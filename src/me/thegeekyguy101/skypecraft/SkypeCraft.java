package me.thegeekyguy101.skypecraft;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SkypeCraft extends JavaPlugin 
{
public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable()
	{
		
	}
	
	public void onDisable()
	{
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		if(commandLabel.equalsIgnoreCase("skype"))
		{
			if(!(sender instanceof Player))
			{
				if(args.length == 0)
				{
					sender.sendMessage(ChatColor.RED + "Incorrect number of arguments");
				}else{
					StringBuilder message = new StringBuilder();
					message.append(args[0]);
					for (int i = 1; i < args.length; i++) {
						message.append(" ");
						message.append(args[i]);
					}
					Bukkit.broadcastMessage("" + message);
				}
			}else{
				sender.sendMessage(ChatColor.RED + "This is a console command!");
			}
		}
		return false;
	}
}
