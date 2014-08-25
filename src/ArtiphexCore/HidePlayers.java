package ArtiphexCore;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HidePlayers implements Listener {
	
	public static ArrayList<Player> hide = new ArrayList<Player>();
	public static ArrayList<Player> show = new ArrayList<Player>();
	
	@EventHandler
	public void PlayerHide(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
			if(e.getMaterial().equals(Material.REDSTONE)) {
				
				e.setCancelled(true);
				
				ItemStack hide1 = new ItemStack (Material.REDSTONE);
				ItemStack hide2 = new ItemStack (Material.SULPHUR);
				
				ItemMeta meta = hide1.getItemMeta();
				ItemMeta meta2 = hide2.getItemMeta();
				
				meta.setDisplayName("§3§lSpieler §8§l->§r §a§lan");
				meta2.setDisplayName("§3§lSpieler §8§l->§r §c§laus");
				
				hide1.setItemMeta(meta);
				hide2.setItemMeta(meta2);
				
				for (Player pl : Bukkit.getOnlinePlayers()) {   
					p.hidePlayer(pl);
			        hide.add(p);
			        show.remove(p);
			        p.getInventory().setItem(1, new ItemStack(hide2));
			        p.updateInventory();
			  }
				
				
				
			}
			
			if (e.getMaterial().equals(Material.SULPHUR)) {
				
				e.setCancelled(true);
				
			 ItemStack hide1 = new ItemStack (Material.REDSTONE);
			 ItemStack hide2 = new ItemStack (Material.SULPHUR);
				
			 ItemMeta meta = hide1.getItemMeta();
			 ItemMeta meta2 = hide2.getItemMeta();
				
			 meta.setDisplayName("§3§lSpieler §8§l->§r §a§lan");
			 meta2.setDisplayName("§3§lSpieler §8§l->§r §c§laus");
				
			 hide1.setItemMeta(meta);
			 hide2.setItemMeta(meta2);
			
			
			if(hide.contains(p)) {
				for (Player pls : Bukkit.getOnlinePlayers()) {
			        p.showPlayer(pls);
			        hide.remove(p);
			        show.add(p);
				}
		        p.getInventory().setItem(1, new ItemStack(hide1));
		        p.updateInventory();
			}
		}
		}
	}
}
