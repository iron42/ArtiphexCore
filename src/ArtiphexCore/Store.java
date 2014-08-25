package ArtiphexCore;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Store implements Listener {
	
	public Inventory storeMain = null;
	public Inventory storeUser = null;
	
	@EventHandler
	public void Open(PlayerInteractEvent e) {
		
		
		Player p = e.getPlayer();
		
		if (e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getItem().getType().equals(Material.MAGMA_CREAM)) {
				this.storeMain = p.getServer().createInventory(null, 36, "§6§lStore");
				
				this.storeUser = p.getServer().createInventory(null, 36, "§2§lUserStore");
				
				ItemStack green = new ItemStack (Material.STAINED_GLASS_PANE);
				ItemMeta meta1 = green.getItemMeta();
				meta1.setDisplayName(" ");
				green.setDurability((short) 5);
				green.setItemMeta(meta1);
				
				ItemStack yellow = new ItemStack (Material.STAINED_GLASS_PANE);
				ItemMeta meta2 = yellow.getItemMeta();
				meta2.setDisplayName(" ");
				yellow.setDurability((short) 4);
				yellow.setItemMeta(meta2);
				
				ItemStack red = new ItemStack (Material.STAINED_GLASS_PANE);
				ItemMeta meta3 = red.getItemMeta();
				meta3.setDisplayName(" ");
				red.setDurability((short) 14);
				red.setItemMeta(meta3);
				
				ItemStack effekt = new ItemStack (Material.STAINED_GLASS_PANE);
				ItemMeta meta4 = effekt.getItemMeta();
				meta4.setDisplayName(" ");
				effekt.setDurability((short) 14);
				effekt.setItemMeta(meta4);
				
				ItemStack black = new ItemStack (Material.STAINED_GLASS_PANE);
				ItemMeta meta5 = black.getItemMeta();
				meta5.setDisplayName(" ");
				black.setDurability((short) 15);
				black.setItemMeta(meta5);
				
				this.storeMain.setItem(0, green);
				this.storeMain.setItem(1, green);
				this.storeMain.setItem(2, green);
				this.storeMain.setItem(3, green);
				this.storeMain.setItem(9, green);
				this.storeMain.setItem(10, green);
				this.storeMain.setItem(11, green);
				this.storeMain.setItem(18, green);
				this.storeMain.setItem(19, green);
				this.storeMain.setItem(27, green);
				
				this.storeMain.setItem(4, yellow);
				this.storeMain.setItem(5, yellow);
				this.storeMain.setItem(6, yellow);
				this.storeMain.setItem(7, yellow);
				this.storeMain.setItem(12, yellow);
				this.storeMain.setItem(13, yellow);
				this.storeMain.setItem(14, yellow);
				this.storeMain.setItem(15, yellow);
				this.storeMain.setItem(20, yellow);
				this.storeMain.setItem(21, yellow);
				this.storeMain.setItem(22, yellow);
				this.storeMain.setItem(23, yellow);
				this.storeMain.setItem(28, yellow);
				this.storeMain.setItem(29, yellow);
				this.storeMain.setItem(30, yellow);
				this.storeMain.setItem(31, yellow);
				
				this.storeMain.setItem(8, red);
				this.storeMain.setItem(16, red);
				this.storeMain.setItem(17, red);
				this.storeMain.setItem(24, red);
				this.storeMain.setItem(25, red);
				this.storeMain.setItem(26, red);
				this.storeMain.setItem(32, red);
				this.storeMain.setItem(33, red);
				this.storeMain.setItem(34, red);
				this.storeMain.setItem(35, red);
				
				//------------------------------------
				
				this.storeUser.setItem(0, black);
				this.storeUser.setItem(1, black);
				this.storeUser.setItem(2, black);
				this.storeUser.setItem(3, black);
				this.storeUser.setItem(4, black);
				this.storeUser.setItem(5, black);
				this.storeUser.setItem(6, black);
				this.storeUser.setItem(7, black);
				this.storeUser.setItem(8, black);
				this.storeUser.setItem(9, black);
				this.storeUser.setItem(10, black);
				this.storeUser.setItem(11, black);
				this.storeUser.setItem(12, black);
				this.storeUser.setItem(13, black);
				this.storeUser.setItem(14, black);
				this.storeUser.setItem(15, black);
				this.storeUser.setItem(16, black);
				this.storeUser.setItem(17, black);
				this.storeUser.setItem(18, black);
				this.storeUser.setItem(19, black);
				this.storeUser.setItem(20, black);
				this.storeUser.setItem(21, black);
				this.storeUser.setItem(22, black);
				this.storeUser.setItem(23, black);
				this.storeUser.setItem(24, black);
				this.storeUser.setItem(25, black);
				this.storeUser.setItem(26, black);
				this.storeUser.setItem(27, black);
				this.storeUser.setItem(28, black);
				this.storeUser.setItem(29, black);
				this.storeUser.setItem(30, black);
				this.storeUser.setItem(31, black);
				this.storeUser.setItem(32, black);
				this.storeUser.setItem(33, black);
				this.storeUser.setItem(34, black);
				this.storeUser.setItem(35, black);
				
				if (p.hasPermission("chat.player")) {
					p.openInventory(this.storeUser);
				} else if (p.hasPermission("chat.pr")) {
					p.openInventory(this.storeMain);
				}
				
			}
		}
	}
}
