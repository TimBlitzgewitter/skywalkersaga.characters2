package de.squeezzy.skywalkersagacharackter.heads;

import dev.dbassett.skullcreator.SkullCreator;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Heads {

    public static ItemStack getAnakin() {
        // Got this base64 string from minecraft-heads.com
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGNiYmE1NmM0ZmI4NjBmNzA4ZThlNjVkMTFiOWQxZmM4MzI5ODRhNTQwODgwMDQzODEwZTAwZWIwMzgwOTdmZiJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lAnakin Skywalker");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getAhsoka() {
        // Got this base64 string from minecraft-heads.com
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Y5YTY1N2FjOWRkMzBjZDc0MTlhZmI2NWM1MDgzNTk3OTc5NzM5NjRhZjMyM2MxYmE2YTY2NWZjMjQwNDUwIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack ahsoka = SkullCreator.itemFromBase64(base64);
        ItemMeta m = ahsoka.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lAhsoka Tano");
        ahsoka.setItemMeta(m);
        return ahsoka;
    }

    public static ItemStack getLuke() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjgzZjMxZWIwM2U1NjM2ZWE2ZmE4OGVlZjk4M2RhOTZhMWM0MGJmMzE0ZjA0ZDg1YTE0Y2EyNmJiNzgyZjQifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack luke = SkullCreator.itemFromBase64(base64);
        ItemMeta m = luke.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lLuke Skywalker §8(IV)");
        luke.setItemMeta(m);
        return luke;
    }

    public static ItemStack getYoda() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTgxZWQ5ZjY4YWE4YTEwNWRkNTNmNGQ1ODg5ZTU4NjYyMTVhNWRlOWE5ZjY0NDFmODUyMTYyOTQ5NzUyZmYifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lYoda");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getObiWan() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmU0OTQ4YzY2MjU2YWRkNmY5M2I5NmI4ZTJkNzhlYTdhZDljYTkwM2JlMDAzNTM5ZTZlNTRiMDE5MTEyOWM3NSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lObi-Wan Kenobi");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getPloKoon() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQwMDhiOGQwZDJiNWEzOWQ4NmJkOWFhOWNmZTIwOTc4YjgyNGJkODdiNmNjZTEzN2QzZTk2ZDIxMWI3NmNjZCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lPlo Koon");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getQuiGon() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI1OTFiZDU5YmZhN2Y1NjI4NWZmYjExYzBmODRkZTI4MDdlOTZkZTc2NTM2NWFmOWM0MTlmOWRiMzEwNDEifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lQui-Gon Jinn");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getBenSolo() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ4MTNlMTk1ZWU0MDFjNjFkZDUwMDljMjRhZmI5NzZkMDdiMDE5NGFiYmE1MzgyMzdjN2NhY2EyZjNiZmVkZSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lBen Solo");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getRey() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjQyNmQ4NzI2N2E0MmVlNmU0NzdiMjU4ZjdhOTMzMjEyNDAxZWQ3ZDYxMDJhZjZmYzY3Yjk4ZGU1OThlNWQyIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§a§lRey");
        skull.setItemMeta(m);
        return skull;
    }

    //Held
    public static ItemStack getLeia () {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmZiYjA2ZmQxYTM1NmRiMDU2MTE4YTZjNDM3MTc0M2FiZDdhZGNkNGZmOTYxNTQ0YjBmNTMzNTdmOWI3NjIifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lLeia");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getJarJar () {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjMzODFhZmI2ZTUzYWRlZTRjMjZiNzE0YjlmNGVkNjg5N2U2NjYxNGVhNjMyNDhhYmUxNThhZjVmN2IyOTQyIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lJar Jar Bings");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getEwok() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQzNDRlMTZmMjExYjA5MWI5YjQzZDc3Mjg3MjQwMTgzNTBkZWY2ZmU3ZmFmZWViNzZmZmRlMDA5N2ZiZDNjZCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lEwok");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getRebelPilot() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAzNmM2Nzk1NjlkYmQyZjlhZWI1OTYzNjU2NzQxMWQ3MDc5OTY0YmM1NTIyMGY3MjZhYjQ4NTFmMmI5ZGViOSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lRebel Pilot");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getRebelHoth() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjMxMjhiYmIwNDNhNzQxNGVlMzhhY2U1MTA3NzY5OTlkZjUzY2Y2YWUxOWY1Y2JiYTMxMWNiNjczMGQwMzRlIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§6§lRebel §8(Hoth)");
        skull.setItemMeta(m);
        return skull;
    }

    //Schrottsammler
    public static ItemStack getReySchrott() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzUxYjE5NWVlYWVhMGIzZGVlMmRlMTdhOTc5YjhjMWNjMmY4YTRiMzJiMzJkMjczYjE4ZDFmNzJkZDAifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lRey §8(Schrottsammlerin)");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getJawa() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjczM2NlMzkyMGIwNjE2N2MyNmMyZjMyOWRkZTNiNDVkMzYwYmM0YjliZmFhYWY2ZjVmMWIwODI1MmFmMTkzNSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lJawa");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getTusken() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZmYmQ2OTdlYTU2N2ExZDhlNDk5ODhhNjJjMmQxYTk3OTM3OWRkOGVkYzUzNGE1MTIzZTdlYmYwNzg3ZjUwIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lTusken-Räuber");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getWicket() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQzNDRlMTZmMjExYjA5MWI5YjQzZDc3Mjg3MjQwMTgzNTBkZWY2ZmU3ZmFmZWViNzZmZmRlMDA5N2ZiZDNjZCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lWicket");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getChiefChirpa() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhZDVkNDdmNTIzMWFhYjljYTBmOTdjZTY3ZGE3NTAzZTUzNmRjMWEzNTM5OTIxMWM3ODJhNzc4MmYzOWMifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§c§lChief Chirpa");
        skull.setItemMeta(m);
        return skull;
    }

    //Schurke
    public static ItemStack getHanSolo() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY2NGJjOTI3ZDVhN2NjNGNlMzM0NTU5OTNmM2Y5MzY3YTBjYmZlZTU4MjJkNTUyOWYyZDg0NzU0MTFmMyJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§5§lHan Solo");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getChewbacca() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2E5ZGIwODY2N2FhMmM5Mzg3OTE4ZjgzNzA0YmY4YzQxM2VlZDZmNDcxMjRhMTU5YTM2NDhkMTQ3ZTQ2YmYxIn19fQ==";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§5§lChewbacca");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getWookie() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY5OTEyODc0YTI2ODdkNTAxYjI3OGQ3OTg1MTk5MzgyOTZiNjJkZTg3YmJlMTU2ZTZlNmIwOWZmNDczMzI5ZSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§5§lWandernder Wookie");
        skull.setItemMeta(m);
        return skull;
    }

    //Kopfgeldjäger
    public static ItemStack getBobaFett() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjlmMzg1NmI1ZDVkOGM4MGNlNzVjZDJkYzM2ZjI5YmUwYWFjNTBiZGJhZDBhNTM0NTJiNzk1ZWNlYjIwNWQ1NCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§b§lBoba Fett");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getHondo() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NmYTIwNzVjNGI4NTM1MzNjMGFmODgwZDBjZTBjOTc5Y2RhOTc4ZTYyYmUwODU3YWZmY2E3ZTIwNGVlYzgzZSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§b§lHondo Ohnaka");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getJabba() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTIyNTkzZjM4ODkyNTdmZDVhZjliMzlkMGFmOTg4YmJkMzBlZDk0ZGIxYWNiNDY2NDIyMjY0YjZjMzM0NCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§b§lJabba");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getTarkin() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVkOWVlODZiZDExMTY5NmVjZGRiMTQyMjA2Nzg0YTdhNzkzZWRlY2RmMWFhNGJhMTkzZWZiZDQ5OWU5MDBiNCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§f§lGroßmoff Tarkin");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getVader() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzFjM2UxZjIyNGI0NDZjY2FjNmE2Y2MzY2Q5ODkxMDE5YTEyMmY5OTY5MWMzOTA3OTkyYTNhZjk5YTIxYjAifX19";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§4§lDarth Vader");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getR2D2() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGRlZTI0NGJlMDg5MjlkZWMwOGZmNDgzYmQ1YTg1NmUwYjZhNzQwOTg4MTc0ZWMzMDQ3Yzc0NjE2ZjA2ZjgwMCJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§3§lR2-D2");
        skull.setItemMeta(m);
        return skull;
    }

    public static ItemStack getC3PO() {
        String base64 = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2ZjMzY3ZjNmMmNhN2MyMDk0ZGUzNDM2ODhjYmZiNjI0MjkxZWM4YThhNDkwMTdhYjRmNzRiNzIyNjFjN2EwYSJ9fX0=";
        SkullCreator.itemFromBase64(base64);
        ItemStack skull = SkullCreator.itemFromBase64(base64);
        ItemMeta m = skull.getItemMeta();
        assert m != null;
        m.setDisplayName("§e§lC3-PO");
        skull.setItemMeta(m);
        return skull;
    }
}
