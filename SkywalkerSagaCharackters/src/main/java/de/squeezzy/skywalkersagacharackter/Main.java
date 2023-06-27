package de.squeezzy.skywalkersagacharackter;

import de.squeezzy.skywalkersagacharackter.commands.GiveItemCommand;
import de.squeezzy.skywalkersagacharackter.listeners.charakter.InventoryClickListener;
import de.squeezzy.skywalkersagacharackter.listeners.JoinEventListener;
import de.squeezzy.skywalkersagacharackter.listeners.menu.MenuClickListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import de.squeezzy.skywalkersagacharackter.listeners.OnClickListener;

import java.util.Objects;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("giveitem")).setExecutor(new GiveItemCommand());
        Listener onClick = new OnClickListener();
        Listener invClick = new InventoryClickListener();
        Listener menuClick = new MenuClickListener();
        Listener joinEvent = new JoinEventListener();
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(onClick, this);
        pluginManager.registerEvents(invClick,this);
        pluginManager.registerEvents(menuClick,this);
        pluginManager.registerEvents(joinEvent,this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
