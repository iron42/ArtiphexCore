package Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinQuitListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		ArtiphexCore.HidePlayers.show.add(p);
		
		ItemStack join1 = new ItemStack (Material.COMPASS);
		ItemStack join2 = new ItemStack (Material.REDSTONE);
		ItemStack join3 = new ItemStack (Material.MAGMA_CREAM);
		ItemStack join4 =  new ItemStack(Material.SKULL_ITEM);
		ItemStack join5 =  new ItemStack(Material.GOLDEN_APPLE, 1);
		
		ItemMeta meta = join1.getItemMeta();
		ItemMeta meta2 = join2.getItemMeta();
		ItemMeta meta3 = join3.getItemMeta();
		ItemMeta meta4 = join4.getItemMeta();
		ItemMeta meta5 = join5.getItemMeta();
		
		meta.setDisplayName("§3§lNavigation");
		meta2.setDisplayName("§3§lSpieler §8§l->§r §a§lan");
		meta3.setDisplayName("§6§lStore §8| §a§lOPEN");
		meta4.setDisplayName("§a§lFreunde");
		meta5.setDisplayName("§a§lLobby");
		
		
		meta.setLore(null);
		meta2.setLore(null);
		meta3.setLore(null);
		meta4.setLore(null);
		meta5.setLore(null);
		
		
		join1.setItemMeta(meta);
		join2.setItemMeta(meta2);
		join3.setItemMeta(meta3);
		join4.setItemMeta(meta4);
		join5.setItemMeta(meta5);
		
		p.getInventory().setItem(0, new ItemStack(join1));
		p.getInventory().setItem(1, new ItemStack(join2));
		p.getInventory().setItem(4, new ItemStack(join3));
		p.getInventory().setItem(7, new ItemStack(join4));
		p.getInventory().setItem(8, new ItemStack(join5));
		
		e.setJoinMessage("");
		
		for (Player plh : ArtiphexCore.HidePlayers.hide) {
			for (Player pl1 : Bukkit.getOnlinePlayers()) {
		        plh.hidePlayer(pl1);
			}
		}
		
		//p.teleport
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		e.setQuitMessage("");
	}
}
