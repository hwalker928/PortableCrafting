package link.harryw.portablecrafting.commands;

import link.harryw.portablecrafting.PortableCrafting;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class PCReload implements CommandExecutor {
    private final PortableCrafting plugin;

    public PCReload(PortableCrafting plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        plugin.reloadConfig();
        FileConfiguration config = plugin.getConfig();
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', config.getString("prefix")) + ChatColor.translateAlternateColorCodes('&', config.getString("reloadConfig")));
        return true;
    }
}