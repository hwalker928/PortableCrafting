package link.harryw.portablecrafting;

import link.harryw.portablecrafting.commands.PCReload;
import org.bukkit.plugin.java.JavaPlugin;
import link.harryw.portablecrafting.events.WorkbenchTrigger;

public final class PortableCrafting extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new WorkbenchTrigger(), this);
        getCommand("pcreload").setExecutor(new PCReload(this));
    }
}
