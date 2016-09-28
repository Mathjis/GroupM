package me.Mathjis.GroupM;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import me.Mathjis.GroupM.commands.commandgroupm;
import me.Mathjis.GroupM.events.eventPlayerJoin;

public class Main extends JavaPlugin {
	FileConfiguration config = getConfig();
	public static Inventory inv = Bukkit.createInventory(null, 9);

	@Override
	public void onEnable() {
		// CONFIG
		config.addDefault("Welcome-Message", "Welcome {player}");
		config.options().copyDefaults(true);
		saveConfig();
		// END CONFIG
		getServer().getPluginManager().registerEvents(new eventPlayerJoin(this), this);
		this.getCommand("GroupM").setExecutor(new commandgroupm());

	}

}