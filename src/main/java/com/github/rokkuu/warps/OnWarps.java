package com.github.rokkuu.warps;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Set;

public class OnWarps implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Set<String> locationsString = OnCreateWarp.getLocationNames();
            StringBuilder message = new StringBuilder();
            for (String location : locationsString){
                message.append(location).append(" ");
            }
            player.sendMessage(ChatColor.GREEN + "----------All created warps----------");
            player.sendMessage(ChatColor.DARK_GREEN + message.toString());

        }
        return true;
    }
}
