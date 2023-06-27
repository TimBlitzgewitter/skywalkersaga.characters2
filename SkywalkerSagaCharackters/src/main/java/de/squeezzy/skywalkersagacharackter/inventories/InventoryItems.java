package de.squeezzy.skywalkersagacharackter.inventories;

import dev.dbassett.skullcreator.SkullCreator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InventoryItems {


    public  static ItemStack glaspane(){
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack jediArrowRight() {
            String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVmMzU2YWQyYWE3YjE2NzhhZWNiODgyOTBlNWZhNWEzNDI3ZTVlNDU2ZmY0MmZiNTE1NjkwYzY3NTE3YjgifX19";
            SkullCreator.itemFromBase64(base64);
            ItemStack skull = SkullCreator.itemFromBase64(base64);
            ItemMeta m = skull.getItemMeta();
            assert m != null;
            m.setDisplayName("§a§lJedi");
            skull.setItemMeta(m);
            return skull;

    }

    public static ItemStack heldArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmU4Y2Q1MzY2NGQ5MzA3YjY4NjliOWFiYmFlMmI3NzM3YWI3NjJiYjE4YmIzNGYzMWM1Y2E4ZjNlZGI2M2I2In19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lHeld");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack schrottArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjI4MjViY2EzOGU5YTIyZWRmNWVjOWUwOTZhM2Y2OGY1OWVjZThlNGVjNDcxZjdjZGNhMzM3MDk2ZmVmYTgzIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lSchrottsammler");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack schurkeArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjcyNmQyODhhNzRlOGFjOTI0YzU4YzkzZjViMzVjYWNkNjk0NmE2Y2NmZGJkYTg1ZmU4YWNiOWUzZWVjZWJkYiJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§5§lSchurke");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack kopfgeldArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmZmNTVmMWIzMmMzNDM1YWMxYWIzZTVlNTM1YzUwYjUyNzI4NWRhNzE2ZTU0ZmU3MDFjOWI1OTM1MmFmYzFjIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§b§lKopfgeldjäger");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack boesewichtArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTU2YTM2MTg0NTllNDNiMjg3YjIyYjdlMjM1ZWM2OTk1OTQ1NDZjNmZjZDZkYzg0YmZjYTRjZjMwYWI5MzExIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§f§lBösewicht");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack sithArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg2NjA2OTFkMWNhMDI5ZjEyMGEzZmYwZWFiYWI5M2EyMzA2YjM3YTdkNjExMTlmY2QxNDFmZjJmNmZjZDc5OCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§4§lSith");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack astromechArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjY3MWM0YzA0MzM3YzM4YTVjN2YzMWE1Yzc1MWY5OTFlOTZjMDNkZjczMGNkYmVlOTkzMjA2NTVjMTlkIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§3§lAstromech-Droide");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack protokollArrowRight() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE5MmFkNDU2Zjc2ZWM3Y2FhMzU5NTkyMmQ1ZmNjMzhkY2E5MjhkYzY3MTVmNzUyZTc0YzhkZGRlMzQ0ZSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§e§lProtokoll-Droide");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack charakterMenu() {
        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§e§lMenü");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§7§l>> §6Übersicht und Auswahl von");
        lore.add("§7§l>> §6Quests, Schiffen und Charakteren§8§l!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack quarzArrowDown() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzkxMmQ0NWIxYzc4Y2MyMjQ1MjcyM2VlNjZiYTJkMTU3NzdjYzI4ODU2OGQ2YzFiNjJhNTQ1YjI5YzcxODcifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§7§lSeite Runter");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack quarzArrowUp() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk5YWFmMjQ1NmE2MTIyZGU4ZjZiNjI2ODNmMmJjMmVlZDlhYmI4MWZkNWJlYTFiNGMyM2E1ODE1NmI2NjkifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§7§lSeite Hoch");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack redArrowLeft() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg0ZjU5NzEzMWJiZTI1ZGMwNThhZjg4OGNiMjk4MzFmNzk1OTliYzY3Yzk1YzgwMjkyNWNlNGFmYmEzMzJmYyJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§4§lZurück");
        skull.setItemMeta(m);
        return skull;
    }

    public  static ItemStack map(){
        ItemStack item = new ItemStack(Material.FILLED_MAP);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§f§lKarte");
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack charakterKopf() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAzNmM2Nzk1NjlkYmQyZjlhZWI1OTYzNjU2NzQxMWQ3MDc5OTY0YmM1NTIyMGY3MjZhYjQ4NTFmMmI5ZGViOSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§f§lCharakter");
        skull.setItemMeta(m);
        return skull;
    }

    public  static ItemStack spaceship(){
        ItemStack item = new ItemStack(Material.OAK_BOAT);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§f§lRaumschiff");
        item.setItemMeta(meta);
        return item;
    }

    public  static ItemStack quests(){
        ItemStack item = new ItemStack(Material.BOOK);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§f§lQuests");
        item.setItemMeta(meta);
        return item;
    }





}
