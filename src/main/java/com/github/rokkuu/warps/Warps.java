package com.github.rokkuu.warps;

import org.bukkit.plugin.java.JavaPlugin;

public final class Warps extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("warpc").setExecutor(new OnCreateWarp());
        this.getCommand("warptp").setExecutor(new OnTeleportWarp());
        this.getCommand("warps").setExecutor(new OnWarps());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
