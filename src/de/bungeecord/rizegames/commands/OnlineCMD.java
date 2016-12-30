package de.bungeecord.rizegames.commands;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class OnlineCMD extends Command {

	public OnlineCMD () {
		super("online");
	}

	public void execute (CommandSender sender, String[] args) {
		if (!(sender instanceof ProxiedPlayer)) {
			return;
		}

		ProxiedPlayer p = (ProxiedPlayer) sender;

		int i = ProxyServer.getInstance().getPlayers().size() + RizeGames.pb;
		p.sendMessage(new TextComponent(RizeGames.prefix + "§7Es befinden sich zurzeit §e" + i + " §7Spieler auf dem Netzwerk."));
	}

}
