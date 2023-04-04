package swaimx.me.vanila_19;

import org.bukkit.plugin.java.JavaPlugin;
import swaimx.me.vanila_19.listener.PlayerInteractListener;

public final class Vanila_19 extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[+] Vanilla by SwaimX has started");

        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
