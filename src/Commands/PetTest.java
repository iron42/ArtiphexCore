package Commands;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

import petapi.PetMaker;

public class PetTest implements CommandExecutor {
	static HashMap<String,LivingEntity> petowners = new HashMap<String,LivingEntity>();

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label,
			String[] args) {
		if(cmd.getName().equalsIgnoreCase("pettest")) {
			  final Player p = (Player) cs;
		        Sheep creeper = p.getWorld().spawn(p.getLocation(), Sheep.class);
		        creeper.setColor(DyeColor.GREEN);
		        creeper.setCustomName(ChatColor.GOLD + "MrCreeper");
		        creeper.setCustomNameVisible(true);
		        PetMaker.makePet(creeper, UUID.fromString(p.getUniqueId().toString()));
		        
		        petowners.put(p.getName(), creeper);
		        
		        
		}
		return false;
	}
}
