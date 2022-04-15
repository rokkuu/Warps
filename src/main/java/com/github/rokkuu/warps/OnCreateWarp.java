package com.github.rokkuu.warps;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Set;

public class OnCreateWarp implements CommandExecutor {
    private static HashMap<String, Location> warps = new HashMap<>();

    public static void addLocation(Location location, String name){
        warps.put(name, location);
    }

    public static void removeLocation(Location location, String name){
        warps.remove(name, location);
    }

    // key
    public static boolean isInLocationList(Location location){
        return warps.containsValue(location);
    }

    // value
    public static boolean isInLocationList(String name){
        return warps.containsKey(name);
    }

    public static Location getLocationByName(String name){
        System.out.println(warps.get(name));
        return warps.get(name);
    }

    public static Set<String> getLocationNames(){
        return warps.keySet();
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Location playerLocationOnCommand = ((Player) sender).getLocation();
            warps.put(args[0], playerLocationOnCommand);
            sender.sendMessage(ChatColor.DARK_GREEN + args[0] + ChatColor.GREEN + " has been successfully created!");
        }
        return true;
    }
}
