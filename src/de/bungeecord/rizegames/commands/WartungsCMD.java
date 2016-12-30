package de.bungeecord.rizegames.commands;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class WartungsCMD extends Command {

	public WartungsCMD () {
		super("wartung");
	}

	@Override
	public void execute (CommandSender sender, String[] args) {
		if (!(sender instanceof ProxiedPlayer)) {
			return;
		}
		ProxiedPlayer player = (ProxiedPlayer) sender;
		RizeGames.getInstance().wartung = !RizeGames.getInstance().wartung;
		player.sendMessage(new TextComponent(RizeGames.prefix + "§7Der §cWartungsmodus §7wurde " + (RizeGames.getInstance().wartung ? "§aAktiviert" : "§cDeaktiviert")));
	}

}
