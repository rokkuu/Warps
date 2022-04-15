package com.github.rokkuu.warps;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OnRemoveWarp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            String locationName = args[0];
            if (OnCreateWarp.isInLocationList(locationName)){
                OnCreateWarp.removeLocation(OnCreateWarp.getLocationByName(locationName), locationName);
                sender.sendMessage(ChatColor.GREEN + "Warp: " + ChatColor.DARK_GREEN + locationName + ChatColor.GREEN + " has been successfully removed!");
            }
        }
        return true;
    }
}
