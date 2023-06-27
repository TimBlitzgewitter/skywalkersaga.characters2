package de.squeezzy.skywalkersagacharackter.inventories.charackter;

import de.squeezzy.skywalkersagacharackter.heads.Heads;
import de.squeezzy.skywalkersagacharackter.inventories.InventoryItems;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class SithInventory {

    public Inventory inventory() {

        Inventory inventory = Bukkit.createInventory(null, 54, "Charakter Menü");

        //row 1
        inventory.setItem(0, InventoryItems.jediArrowRight());
        inventory.setItem(1,InventoryItems.glaspane());
        inventory.addItem(Heads.getVader());

        inventory.setItem(8,InventoryItems.redArrowLeft());

        //row 2
        inventory.setItem(9,InventoryItems.heldArrowRight());
        inventory.setItem(10,InventoryItems.glaspane());

        inventory.setItem(17,InventoryItems.glaspane());

        //row 3
        inventory.setItem(18,InventoryItems.schrottArrowRight());
        inventory.setItem(19,InventoryItems.glaspane());

        inventory.setItem(26,InventoryItems.glaspane());

        //row 4
        inventory.setItem(27,InventoryItems.schurkeArrowRight());
        inventory.setItem(28,InventoryItems.glaspane());

        inventory.setItem(35,InventoryItems.glaspane());

        //row 5
        inventory.setItem(36,InventoryItems.kopfgeldArrowRight());
        inventory.setItem(37,InventoryItems.glaspane());

        inventory.setItem(44,InventoryItems.glaspane());

        //row 6
        inventory.setItem(45,InventoryItems.quarzArrowDown());
        inventory.setItem(46,InventoryItems.glaspane());

        inventory.setItem(53,InventoryItems.glaspane());

        return inventory;
    }

}
