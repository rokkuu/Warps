/*
@author: github.com/rokkuu
TODO: Save warps in config file
TODO: Remove command
TODO: dsadsadsa
 */

package com.github.rokkuu.warps;

import org.bukkit.plugin.java.JavaPlugin;

public final class Warps extends JavaPlugin {


    @Override
    public void onEnable() {
        this.getCommand("warpc").setExecutor(new OnCreateWarp());
        this.getCommand("warptp").setExecutor(new OnTeleportWarp());
        this.getCommand("warps").setExecutor(new OnWarps());
        this.getCommand("warpr").setExecutor(new OnRemoveWarp());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
