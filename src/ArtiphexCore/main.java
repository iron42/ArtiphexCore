package ArtiphexCore;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.ChatClear;
import Commands.PetTest;
import Events.BuildBreakListener;
import Events.FoodListener;
import Events.JoinQuitListener;
import Events.JumpPad;
import Events.test;

public class main extends JavaPlugin {
	
	public static main plugin;
	
	
	public void onDisable() {
		System.out.println("[ArtiphexCore] disabled");
	}
	
	public void onEnable() {
		
		plugin = this;
		
		System.out.println("[ArtiphexCore] enabled");
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new JoinQuitListener(), this);
		pm.registerEvents(new BuildBreakListener(), this);
		pm.registerEvents(new Navigation(), this);
		pm.registerEvents(new HidePlayers(), this);
		pm.registerEvents(new JumpPad(), this);
		pm.registerEvents(new Store(), this);
		pm.registerEvents(new FoodListener(), this);
		pm.registerEvents(new test(), this);
		
		this.getCommand("cc").setExecutor(new ChatClear());
		this.getCommand("pettest").setExecutor(new PetTest());
	}
}
