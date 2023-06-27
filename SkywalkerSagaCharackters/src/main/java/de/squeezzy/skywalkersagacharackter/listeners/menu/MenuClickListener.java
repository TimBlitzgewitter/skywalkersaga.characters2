package de.squeezzy.skywalkersagacharackter.listeners.menu;

import de.squeezzy.skywalkersagacharackter.inventories.InventoryItems;
import de.squeezzy.skywalkersagacharackter.inventories.StandardInventory;
import de.squeezzy.skywalkersagacharackter.listeners.charakter.InventoryClickListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MenuClickListener implements Listener {

    InventoryClickListener inventoryClickListener = new InventoryClickListener();
    StandardInventory standardInventory = new StandardInventory();
    Inventory inventory = standardInventory.inventory();

    @EventHandler

    public void MenuClick(InventoryClickEvent e) {
        inventory = e.getInventory();
        if (e.getWhoClicked() instanceof Player) {
            if (!(e.getView().getTitle().equals("Menü"))) {
                inventory = standardInventory.inventory();
                return;
            } else {
                Player player = (Player) e.getWhoClicked();
                e.setCancelled(true);
                ItemStack slot = e.getCurrentItem();
                assert slot != null;

                if (slot.equals(InventoryItems.charakterKopf())) {

                    inventoryClickListener.openGUI(player);
                }

            }
        }
    }
}