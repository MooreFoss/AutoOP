package com.mc.autoop;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public final class AutoOP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("AutoOP enables successfully.");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinListener(getLogger()), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("AutoOP disables successfully.");
    }
}