package me.Mathjis.GroupM.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandgroupm implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		 Player player = (Player) sender;
		 player.sendMessage("Test works");
		return true;
	}

}
