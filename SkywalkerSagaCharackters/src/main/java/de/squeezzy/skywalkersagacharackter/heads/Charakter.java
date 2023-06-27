package de.squeezzy.skywalkersagacharackter.heads;

import org.bukkit.inventory.ItemStack;

public class Charakter {
    private ItemStack head;
    private ItemStack chestplate;
    private ItemStack leggins;
    private ItemStack boots;

    public Charakter(ItemStack head,ItemStack chestplate,ItemStack leggins,ItemStack boots) {
        this.head = head;
        this.chestplate = chestplate;
        this.leggins = leggins;
        this.boots = boots;
    }

    public ItemStack getHead() {
        return head;
    }

    public  ItemStack getChestplate() {
        return chestplate;
    }

    public ItemStack getLeggins() {
        return leggins;
    }

    public ItemStack getBoots() {
        return boots;
    }
}
