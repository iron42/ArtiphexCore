package ArtiphexCore;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Navigation implements Listener {
	public Inventory navigation = null;
	
	@EventHandler
	public void onNavigationOpen(PlayerInteractEvent e) {
		ItemStack navigationItem = new ItemStack (Material.COMPASS);
		ItemMeta meta = navigationItem.getItemMeta();
		meta.setDisplayName("§3§lNavigation");
		navigationItem.setItemMeta(meta);
		
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getItem().getType().equals(Material.COMPASS)) {
				
		
		ItemStack black = new ItemStack (Material.STAINED_GLASS_PANE);
		ItemMeta meta2 = black.getItemMeta();
		meta2.setDisplayName(" ");
		black.setDurability((short) 15);
		black.setItemMeta(meta2);
		
		ItemStack spawn = new ItemStack (Material.NETHER_STAR);
		ItemMeta meta3 = spawn.getItemMeta();
		meta3.setDisplayName("§6§lSpawn");
		spawn.setItemMeta(meta3);
		
		ItemStack dw = new ItemStack (Material.BED);
		ItemMeta meta4 = dw.getItemMeta();
		meta4.setDisplayName("§5DreamWar");
		List<String> dwLore = new ArrayList<String>();
		dwLore.add("§7|           Bett-PvP                |");
		dwLore.add("§7|        2 Plattformen             |");
		dwLore.add("§7|  2 überlebenswichtige Betten |");
		meta4.setLore(dwLore);
		dw.setItemMeta(meta4);
		
		ItemStack sg = new ItemStack (Material.IRON_SWORD);
		ItemMeta meta5 = sg.getItemMeta();
		meta5.setDisplayName("§eSurvivalGames");
		List<String> sgLore = new ArrayList<String>();
		sgLore.add("§7|  24 Spieler     |");
		sgLore.add("§7|1 Überlebender|");
		meta5.setLore(sgLore);
		sg.setItemMeta(meta5);
		
		ItemStack wb = new ItemStack (Material.WATER_BUCKET);
		ItemMeta meta6 = wb.getItemMeta();
		meta6.setDisplayName("§bWaterfallBattle");
		List<String> wbLore = new ArrayList<String>();
		wbLore.add("§7Box deine Gegner aus dem Wasserfall | Offical");
		meta6.setLore(wbLore);
		wb.setItemMeta(meta6);
		
		ItemStack ttt = new ItemStack (Material.INK_SACK);
		ItemMeta meta7 = ttt.getItemMeta();
		meta7.setDisplayName("§4TTT");
		List<String> tttLore = new ArrayList<String>();
		tttLore.add("§7| Innocent    §l->§r§7Find");
		tttLore.add("§7| Traitor     §l->§r§7Kill");
		tttLore.add("§7| Detective §l->§r§7Manage");
		ttt.setDurability((short) 1);
		meta7.setLore(tttLore);
		ttt.setItemMeta(meta7);
		
		
		this.navigation = p.getServer().createInventory(null, 27, "§6§lArtiphex§8§lGames");
		this.navigation.setItem(0, black);
		this.navigation.setItem(1, black);
		this.navigation.setItem(2, black);
		this.navigation.setItem(3, black);
		this.navigation.setItem(4, spawn);
		this.navigation.setItem(5, black);
		this.navigation.setItem(6, black);
		this.navigation.setItem(7, black);
		this.navigation.setItem(8, black);
		this.navigation.setItem(9, black);
		this.navigation.setItem(10, black);
		this.navigation.setItem(11, wb);
		this.navigation.setItem(12, sg);
		this.navigation.setItem(13, dw);
		this.navigation.setItem(14, ttt);
		this.navigation.setItem(15, black);
		this.navigation.setItem(16, black);
		this.navigation.setItem(17, black);
		this.navigation.setItem(18, black);
		this.navigation.setItem(19, black);
		this.navigation.setItem(20, black);
		this.navigation.setItem(21, black);
		this.navigation.setItem(21, black);
		this.navigation.setItem(22, black);
		this.navigation.setItem(23, black);
		this.navigation.setItem(24, black);
		this.navigation.setItem(25, black);
		this.navigation.setItem(26, black);
		
		p.openInventory(this.navigation);
			
			}
		}
	}
	
	@EventHandler
	public void onNavigationClick(InventoryClickEvent e) {
		e.setCancelled(true);
		e.setResult(Result.DENY);
	}
	
}
