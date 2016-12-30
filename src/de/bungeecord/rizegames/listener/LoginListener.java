package de.bungeecord.rizegames.listener;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class LoginListener implements Listener {

	@EventHandler
	public void onLogin (LoginEvent e) {
		String playername = e.getConnection().getName();

		if (RizeGames.getInstance().wartung) {
			for (String allowed : RizeGames.getInstance().getTeam()) {
				if (allowed.equals(playername)) {
					return;
				}
			}
			e.setCancelReason("§8│ §e§lR§6izeGames.net §8│\n \n§cWir sind momentan in Wartungsarbeiten.\n§7Bitte versuch es Später noch mal.\n§bTeamSpeak §8➟ §7RizeGames.net\n §bTwitter §8➟ §7@RizeGamesNET\n \n§8│ §e§lR§6izeGames.net §8│");
			e.setCancelled(true);

		}
	}

}
