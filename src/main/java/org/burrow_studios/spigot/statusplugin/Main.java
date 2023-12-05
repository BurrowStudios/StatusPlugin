package org.burrow_studios.spigot.statusplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // register '/status' command
        getCommand("status").setExecutor(new StatusCommand(/* TODO */ null, null));
    }
}
