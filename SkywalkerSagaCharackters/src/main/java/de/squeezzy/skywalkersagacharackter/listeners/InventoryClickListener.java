package de.squeezzy.skywalkersagacharackter.listeners;

import de.squeezzy.skywalkersagacharackter.list.CharacterList;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.inventory.InventoryClickEvent;


import java.util.Objects;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent e) {
        if (e.getWhoClicked() instanceof Player) {
            //Inventory inventory = e.getClickedInventory();
            if (e.getView().getTitle().equals("Charackter Menü")) {
                Player player = (Player) e.getWhoClicked();
                e.setCancelled(true);
                ItemStack slot = e.getCurrentItem();
                assert slot != null;

                CharacterList characterList = new CharacterList();

                if (!(Objects.requireNonNull(slot.getItemMeta()).getDisplayName().equals("x"))) {
                    for (int j = 0; j <= characterList.getCharacters().size(); j++) {
                        if (characterList.getCharacters().get(j).getHead().equals(slot)) {
                            ItemStack[] armor = new ItemStack[4];
                            armor[0] = characterList.getCharacters().get(j).getBoots();
                            armor[1] = characterList.getCharacters().get(j).getLeggins();
                            armor[2] = characterList.getCharacters().get(j).getChestplate();
                            armor[3] = characterList.getCharacters().get(j).getHead();
                            player.getInventory().setArmorContents(armor);
                            player.sendMessage("§6Du hast " + Objects.requireNonNull(characterList.getCharacters().get(j).getHead().getItemMeta()).getDisplayName() + " §6ausgewählt!");

                        }
                    }
                } else {
                    player.sendMessage(ChatColor.GRAY + "Du kannst diesen Charakter nicht auswählen!");
                }
            }
        }
    }
}