package me.Mathjis.GroupM.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Mathjis.GroupM.Main;

public class eventPlayerJoin implements Listener{
	private Main plugin;
	
	public eventPlayerJoin(Main pl){
		plugin = pl;
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		String message = plugin.getConfig().getString("Welcome-Message").replace("{player}", player.getName());
		player.sendMessage(message);
	}
}
