package de.squeezzy.skywalkersagacharackter.inventories;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class StandardInventory {

    public Inventory inventory() {
        Inventory inventory = Bukkit.createInventory(null, 54, "Menü");

        //row 1
        for (int i = 0; i < 54; i++) {
            inventory.setItem(i,InventoryItems.glaspane());
        }
        inventory.setItem(10, InventoryItems.map());
        inventory.setItem(12, InventoryItems.charakterKopf());
        inventory.setItem(14, InventoryItems.spaceship());
        inventory.setItem(16, InventoryItems.quests());

        return inventory;
    }

    public Inventory inventory2(Inventory currentinventory, int currentCount) {

        if (currentCount == 0) {
            //row 1
            currentinventory.setItem(0, InventoryItems.jediArrowRight());

            //row 2
            currentinventory.setItem(9, InventoryItems.heldArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.schrottArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.schurkeArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.kopfgeldArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());
        }

        if (currentCount == 1) {
            //row 1
            currentinventory.setItem(0, InventoryItems.quarzArrowUp());

            //row 2
            currentinventory.setItem(9, InventoryItems.heldArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.schrottArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.schurkeArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.kopfgeldArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());
        }

        if (currentCount == 2) {
            //row 1
            currentinventory.setItem(0, InventoryItems.quarzArrowUp());

            //row 2
            currentinventory.setItem(9, InventoryItems.schrottArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.schurkeArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.kopfgeldArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.boesewichtArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());
        }

        if (currentCount == 3) {

            //row 1
            currentinventory.setItem(0, InventoryItems.quarzArrowUp());

            //row 2
            currentinventory.setItem(9, InventoryItems.schurkeArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.kopfgeldArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.boesewichtArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.sithArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());


        }

        if (currentCount == 4) {

            //row 1
            currentinventory.setItem(0, InventoryItems.quarzArrowUp());

            //row 2
            currentinventory.setItem(9, InventoryItems.kopfgeldArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.boesewichtArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.sithArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.astromechArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());


        }

        if (currentCount == 5) {

            //row 1
            currentinventory.setItem(0, InventoryItems.quarzArrowUp());

            //row 2
            currentinventory.setItem(9, InventoryItems.boesewichtArrowRight());

            //row 3
            currentinventory.setItem(18, InventoryItems.sithArrowRight());

            //row 4
            currentinventory.setItem(27, InventoryItems.astromechArrowRight());

            //row 5
            currentinventory.setItem(36, InventoryItems.protokollArrowRight());

            //row 6
            currentinventory.setItem(45, InventoryItems.quarzArrowDown());


        }


        return currentinventory;
    }
}
