package me.suleimandev.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.suleimandev.scores.Suleiscore;

public class PlayerListener implements Listener {
	
	@EventHandler
	private void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		Suleiscore.updateScore(p);
		
		
	}
	
	
	@EventHandler
	private void quit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
	}
}
