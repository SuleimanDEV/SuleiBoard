package me.suleimandev;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.suleimandev.events.PlayerListener;
import me.suleimandev.scores.Suleiscore;

/**
 * @author SuleimanDEV
 * @version 1.0
 *
 */

public class Main extends JavaPlugin {
	
	public static Main instance;
	public static Main getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"[SULEIMANDEV] Ativado");
		Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
		
		new BukkitRunnable() {
			
			@Override
			public void run() {
				for(Player ps : Bukkit.getOnlinePlayers()) {
					Suleiscore.updateScore(ps);
				}
			}
		}.runTaskTimer(this, 0L, 20L);
		
	}
	
	@Override
	public void onDisable() {
		instance = null;
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"[SULEIMANDEV] Desativado");
	}
	
}
