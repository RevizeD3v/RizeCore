package de.bungeecord.rizegames;

import java.util.ArrayList;

import de.bungeecord.rizegames.commands.HilfeCMD;
import de.bungeecord.rizegames.commands.OnlineCMD;
import de.bungeecord.rizegames.commands.TeamCMD;
import de.bungeecord.rizegames.commands.WartungsCMD;
import de.bungeecord.rizegames.listener.LoginListener;
import de.bungeecord.rizegames.listener.ServerPingListener;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class RizeGames extends Plugin {

	public static String prefix = "§8│ §e§lR§6izeGames.net §8➟ ";
	public static String nopermission = prefix + "§cDu hast keine Berechtigungen für \n§cdiesen Befehl!";
	public static String unknowcommand = prefix + "§cDieser Command ist uns nicht bekannt.";
	
	public static int pb;

	private static RizeGames instance;
	public boolean wartung;
	private ArrayList<String> team = new ArrayList<String>();

	public static RizeGames getInstance () {
		return instance;
	}

	@Override
	public void onEnable () {
		instance = this;
		wartung = false;
		team.add("RevizeD3v");
		team.add("EntexBTW");
		team.add("TheRedCrafter");
		team.add("Sdiffl3r");
		team.add("LoadMitte");

		PluginManager pluginManager = ProxyServer.getInstance().getPluginManager();
		pluginManager.registerCommand(this, new WartungsCMD());
		pluginManager.registerCommand(this, new HilfeCMD("hilfe"));
		pluginManager.registerCommand(this, new OnlineCMD());
		pluginManager.registerCommand(this, new TeamCMD());

		pluginManager.registerListener(this, new ServerPingListener());
		pluginManager.registerListener(this, new LoginListener());
	}

	public ArrayList<String> getTeam () {
		return team;
	}

}
