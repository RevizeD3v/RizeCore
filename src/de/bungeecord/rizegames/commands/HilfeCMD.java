package de.bungeecord.rizegames.commands;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class HilfeCMD extends Command {

	public HilfeCMD (String name) {
		super(name);
	}

	@Override
	public void execute (CommandSender sender, String[] args) {
		if (sender instanceof ProxiedPlayer) {
			ProxiedPlayer p = (ProxiedPlayer) sender;
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));
			p.sendMessage(new TextComponent(RizeGames.prefix + "§eHilfe seite"));

		} else {
			sender.sendMessage(new TextComponent(RizeGames.prefix + "§cDu musst ein Spieler sein!"));
		}
	}

}
