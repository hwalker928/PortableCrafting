package link.harryw.portablecrafting.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class WorkbenchTrigger implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if(event.getAction() != Action.RIGHT_CLICK_AIR) {
            return;
        }

        if (event.getItem().getType() != Material.WORKBENCH) {
            return;
        }

        if (event.getPlayer().hasPermission("portablecrafting.use") && event.getAction() == Action.RIGHT_CLICK_AIR) {
            event.getPlayer().openWorkbench(null, true);
        }
    }
}
