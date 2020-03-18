package me.suleimandev.scores;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Suleiscore {
	
	//§
	
	@SuppressWarnings("static-access")
	public static void updateScore(Player p) {

		SuleiAPI s = new SuleiAPI(" §6SULEIMAN§fSCORE ");
		
		int jogadoresOnline = Bukkit.getOnlinePlayers().size();
		
		s.addLinha(" §7§l" + jogadoresOnline + " §7jogadores", 12);
		s.addLinha(" ", 11);
		s.addLinha("§fRank: §7", 10);
		s.addLinha("§fCla: §7Nenhum", 9);
		s.addLinha(" ", 8);
		s.addLinha("§fLimite: §b§l$§b0,00", 7);
		s.addLinha(" ", 6);
		s.addLinha("§fCoins: §2§l$§a", 5);
		s.addLinha("§fCash: §e0,00", 3);
		s.addLinha(" ", 1);
		s.addLinha("§6suleimandev.tk", 0);
		
		s.setScoreboard(p);
	}
	
	
	
}
