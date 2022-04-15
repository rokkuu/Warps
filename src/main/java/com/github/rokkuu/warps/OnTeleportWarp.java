package com.github.rokkuu.warps;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OnTeleportWarp implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            String locationName = args[0];
            Player player = (Player) sender;

            OnCreateWarp onCreateWarp = new OnCreateWarp();
            if (OnCreateWarp.isInLocationList(locationName)){
                Location location = OnCreateWarp.getLocationByName(locationName);
                player.teleport(location);
                player.sendMessage(ChatColor.GREEN + "You have been successfully teleported to warp: " + ChatColor.DARK_GREEN + locationName);
            } else {
                player.sendMessage(ChatColor.RED + "There is no such warp. Get all warps: /warps");
            }
        }
        return true;
    }
}
