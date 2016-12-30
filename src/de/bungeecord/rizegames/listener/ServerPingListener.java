package de.bungeecord.rizegames.listener;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class ServerPingListener implements Listener {

	@EventHandler
	public void onProxyPing (ProxyPingEvent e) {
		ServerPing ping = e.getResponse();
		ServerPing.Players players = ping.getPlayers();

		if (RizeGames.getInstance().wartung) {
			ping.setVersion(new ServerPing.Protocol("§cWartungsarbeiten§4", ping.getVersion().getProtocol() - 1));

		}

		ping.setDescription("§e§lR§6izeGames.net §8│ §7Dein §eMinigames §7Netzwerk §8× §61.8 §8- §61.10\n §8➟ §c§lWARTUNG §8× §aFortschritt §8➟ §b10%");
		players.setMax(100);
		ping.setPlayers(players);
		e.setResponse(ping);
	}

}
