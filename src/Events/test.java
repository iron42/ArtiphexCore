package Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import api.ParticleEffect;

public class test implements Listener {
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		//ParticleEffect.MAGIC_CRIT.display(p.getLocation(), 0, 0, 0, 1, 5);
		//ParticleEffect.WITCH_MAGIC.display(p.getLocation(), 0, 0, 0, 0, 5);
	}
}
