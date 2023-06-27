package de.squeezzy.skywalkersagacharackter.listeners;

import de.squeezzy.skywalkersagacharackter.inventories.InventoryItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEventListener implements Listener {

    @EventHandler
    public void giveItems(PlayerJoinEvent e) {
       Player player = e.getPlayer();
       player.getInventory().setItem(8, InventoryItems.charakterMenu());

    }
}
