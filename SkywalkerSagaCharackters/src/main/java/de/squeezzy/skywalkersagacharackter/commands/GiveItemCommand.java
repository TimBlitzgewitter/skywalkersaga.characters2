package de.squeezzy.skywalkersagacharackter.commands;

import de.squeezzy.skywalkersagacharackter.armor.Boots;
import de.squeezzy.skywalkersagacharackter.armor.Chestplate;
import de.squeezzy.skywalkersagacharackter.armor.Leggins;
import de.squeezzy.skywalkersagacharackter.heads.Heads;
import de.squeezzy.skywalkersagacharackter.inventories.InventoryItems;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class GiveItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory inventory = Bukkit.createInventory(null, 54, "Charackter Heads");
            //Jedi
            inventory.addItem(Heads.getAnakin());
            inventory.addItem(Heads.getAhsoka());
            inventory.addItem(Heads.getLuke());
            inventory.addItem(Heads.getYoda());
            inventory.addItem(Heads.getRey());
            //Held
            inventory.addItem(Heads.getLeia());
            inventory.addItem(Heads.getJarJar());
            inventory.addItem(Heads.getEwok());
            inventory.addItem(Heads.getRebelPilot());
            inventory.addItem(Heads.getRebelHoth());
            //Schrottsammler
            inventory.addItem(Heads.getReySchrott());
            inventory.addItem(Heads.getJawa());
            inventory.addItem(Heads.getTusken());
            inventory.addItem(Heads.getWicket());
            inventory.addItem(Heads.getChiefChirpa());
            //Schurke
            inventory.addItem(Heads.getHanSolo());
            inventory.addItem(Heads.getChewbacca());
            inventory.addItem(Heads.getWookie());

            //Kopfgeldjäger
            inventory.addItem(Heads.getBobaFett());

            inventory.addItem(InventoryItems.charakterMenu());
            //open Inventory
            player.openInventory(inventory);
        }
        return false;
    }
}
