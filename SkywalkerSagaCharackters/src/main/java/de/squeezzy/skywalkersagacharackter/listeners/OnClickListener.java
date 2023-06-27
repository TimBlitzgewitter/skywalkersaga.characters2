package de.squeezzy.skywalkersagacharackter.listeners;

import de.squeezzy.skywalkersagacharackter.inventories.InventoryItems;
import de.squeezzy.skywalkersagacharackter.inventories.StandardInventory;
import de.squeezzy.skywalkersagacharackter.listeners.charakter.InventoryClickListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class OnClickListener implements Listener {
    StandardInventory standardInventory = new StandardInventory();
    @EventHandler
    public void OnInventoryClick(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        ItemStack i = e.getItem();
        assert i != null;
        if (i.equals(InventoryItems.charakterMenu())) {
            openGUI(p);
        }
    }
    public void openGUI(Player p) {
        p.openInventory(standardInventory.inventory());
    }
}


