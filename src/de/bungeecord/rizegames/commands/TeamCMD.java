package de.bungeecord.rizegames.commands;

import de.bungeecord.rizegames.RizeGames;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class TeamCMD extends Command {
	public TeamCMD() {
		super("team", "core.team", "s");
		
	}
	
	
	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length < 1) {
			sender.sendMessage(new TextComponent(RizeGames.prefix + "§cBitte benutze §8➟ §7(/tc)"));
			return;
		} else {
			String msg = "";
			for(int i = 0; i < args.length; i++) {
				msg=args[i] + " ";
				
			}
			
			for(ProxiedPlayer team : ProxyServer.getInstance().getPlayers()) {
				if(team.hasPermission("core.teamchat")) {
					team.sendMessage(new TextComponent(RizeGames.prefix + "§8│ §a§lTEAM §8│ §8➟ §7" + sender + " §8➟ §7" + msg));
				}
			}
		}
		
	}

}
