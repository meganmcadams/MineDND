package io.github.meganmcadams.minednd;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class MineDND extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Enabled " + this.getName());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Disabled " + this.getName());
    }

}
