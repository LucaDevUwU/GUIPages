package com.snowy.guipages;

import org.bukkit.plugin.java.JavaPlugin;

public final class GUIPages extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gui").setExecutor(GUICommand);
    }
}
