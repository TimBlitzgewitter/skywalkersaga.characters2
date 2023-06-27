package de.squeezzy.skywalkersagacharackter.listeners.charakter;

import de.squeezzy.skywalkersagacharackter.inventories.*;
import de.squeezzy.skywalkersagacharackter.inventories.charackter.*;
import de.squeezzy.skywalkersagacharackter.list.CharacterList;
import de.squeezzy.skywalkersagacharackter.listeners.OnClickListener;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.inventory.InventoryClickEvent;


import java.util.Objects;

public class InventoryClickListener implements Listener {


    int count;
    JediInventory jediInventory = new JediInventory();
    HeldInventory heldInventory = new HeldInventory();
    SchrottsammlerInventory schrottInventory = new SchrottsammlerInventory();
    SchurkenInventory schurkenInventory = new SchurkenInventory();
    KopfgeldInventory kopfgeldInventory = new KopfgeldInventory();
    BoesewichtInventory boesewichtInventory = new BoesewichtInventory();
    SithInventory sithInventory = new SithInventory();
    AstroInventory astroInventory = new AstroInventory();
    ProtokollInventory protokollInventory = new ProtokollInventory();
    OnClickListener onClickListener = new OnClickListener();
    Inventory charakterInventory = jediInventory.inventory();


    public void openGUI(Player player) {
        count = 0;
        player.openInventory(charakterInventory);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        charakterInventory = e.getInventory();
        if (e.getWhoClicked() instanceof Player) {
            if (e.getView().getTitle().equals("Charakter Menü")) {
                StandardInventory standardInventory = new StandardInventory();
                Player player = (Player) e.getWhoClicked();
                e.setCancelled(true);

                ItemStack slot = e.getCurrentItem();
                assert slot != null;

                if (slot.equals(InventoryItems.redArrowLeft())) {
                    onClickListener.openGUI(player);
                }

                if (slot.equals(InventoryItems.jediArrowRight())) {
                    player.openInventory(jediInventory.inventory());
                    charakterInventory = jediInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(jediInventory.inventory().getItem(2))) {
                    Inventory currentInventory = jediInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.heldArrowRight())) {
                    player.openInventory(heldInventory.inventory());
                    charakterInventory = heldInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(heldInventory.inventory().getItem(2))) {
                    Inventory currentInventory = heldInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.schrottArrowRight())) {
                    player.openInventory(schrottInventory.inventory());
                    charakterInventory = schrottInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(schrottInventory.inventory().getItem(2))) {
                    Inventory currentInventory = schrottInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.schurkeArrowRight())) {
                    player.openInventory(schurkenInventory.inventory());
                    charakterInventory = schurkenInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(schurkenInventory.inventory().getItem(2))) {
                    Inventory currentInventory = schurkenInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.kopfgeldArrowRight())) {
                    player.openInventory(kopfgeldInventory.inventory());
                    charakterInventory = kopfgeldInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(kopfgeldInventory.inventory().getItem(2))) {
                    Inventory currentInventory = kopfgeldInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.boesewichtArrowRight())) {
                    player.openInventory(boesewichtInventory.inventory());
                    charakterInventory = boesewichtInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(boesewichtInventory.inventory().getItem(2))) {
                    Inventory currentInventory = boesewichtInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.sithArrowRight())) {
                    player.openInventory(sithInventory.inventory());
                    charakterInventory = sithInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(sithInventory.inventory().getItem(2))) {
                    Inventory currentInventory = sithInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.astromechArrowRight())) {
                    player.openInventory(astroInventory.inventory());
                    charakterInventory = astroInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(astroInventory.inventory().getItem(2))) {
                    Inventory currentInventory = astroInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }
                if (slot.equals(InventoryItems.protokollArrowRight())) {
                    player.openInventory(protokollInventory.inventory());
                    charakterInventory = protokollInventory.inventory();
                }
                if(Objects.requireNonNull(charakterInventory.getItem(2)).equals(protokollInventory.inventory().getItem(2))) {
                    Inventory currentInventory = protokollInventory.inventory();
                    charakterInventory = standardInventory.inventory2(currentInventory, count);
                    player.openInventory(charakterInventory);
                }


                if (slot.equals(InventoryItems.quarzArrowDown())) {
                    Inventory currentInventory = charakterInventory;
                    count++;
                    if (count < 0) count = 0;
                    if (count > 5) count = 5;
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(jediInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(heldInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(schrottInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory,count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(schurkenInventory.inventory().getItem(2))) {
                        player.openInventory(standardInventory.inventory2(currentInventory, count));
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(kopfgeldInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(boesewichtInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(sithInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(astroInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(protokollInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }

                }

                if (slot.equals(InventoryItems.quarzArrowUp())) {
                    Inventory currentInventory = charakterInventory;
                    count--;
                    if (count < 0) count = 0;
                    if (count > 5) count = 5;
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(jediInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(heldInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(schrottInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(schurkenInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(kopfgeldInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(boesewichtInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(sithInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(astroInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }
                    if (Objects.requireNonNull(currentInventory.getItem(2)).equals(protokollInventory.inventory().getItem(2))) {
                        charakterInventory = standardInventory.inventory2(currentInventory, count);
                        player.openInventory(charakterInventory);
                    }

                }

                CharacterList characterList = new CharacterList();

                if (!(Objects.requireNonNull(slot.getItemMeta()).getDisplayName().equals("x"))) {
                    for (int j = 0; j < characterList.getCharacters().size(); j++) {
                        if (characterList.getCharacters().get(j).getHead().equals(slot)) {
                            ItemStack[] armor = new ItemStack[4];
                            armor[0] = characterList.getCharacters().get(j).getBoots();
                            armor[1] = characterList.getCharacters().get(j).getLeggins();
                            armor[2] = characterList.getCharacters().get(j).getChestplate();
                            armor[3] = characterList.getCharacters().get(j).getHead();
                            player.getInventory().setArmorContents(armor);
                            player.playSound(player, Sound.BLOCK_NOTE_BLOCK_PLING,10,2);
                            player.sendMessage("§6Du hast " + Objects.requireNonNull(characterList.getCharacters().get(j).getHead().getItemMeta()).getDisplayName() + " §6ausgewählt!");

                        }
                    }


                } else {
                    player.sendMessage(ChatColor.GRAY + "Du kannst diesen Charakter nicht auswählen!");
                }
            } else {
                count = 0;
            }
        }
    }
}