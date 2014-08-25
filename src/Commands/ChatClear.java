package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ArtiphexCore.main;


public class ChatClear implements CommandExecutor {

	 @Override
	 public boolean onCommand(final CommandSender cs, Command cmd, String label,
	   String[] args) {
	  if (cs.isOp()) {
	   
	  
	  if (label.equalsIgnoreCase("cc")) {
	    Bukkit.getScheduler().scheduleSyncDelayedTask(main.plugin, new Runnable() {
	       
	       @Override
	       public void run() {
	       for (int i = 0; i < 100; i++) {
	        for (Player p : Bukkit.getOnlinePlayers()) {
	        	p.sendMessage("\n");
	        }
	    	   
	       }
	       }
	    });
	  }
	  
	  // TODO Auto-generated method stub
	  
	  }
	  return true;
	 }

	}
