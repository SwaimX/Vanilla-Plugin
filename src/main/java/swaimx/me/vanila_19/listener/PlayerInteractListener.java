package swaimx.me.vanila_19.listener;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.generator.ChunkGenerator;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){

        if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (e != null){
                if (e.getItem() != null){
                    if (e.getItem().getItemMeta().getDisplayName().equals("info")){
                        Player p = e.getPlayer();
                        if (e.getClickedBlock().getChunk().isSlimeChunk()){
                            p.sendTitle("", ChatColor.GREEN + "This is a slime chunk", 2, 10, 2);
                        } else {
                            p.sendTitle("", ChatColor.RED + "This is a not slime chunk", 2, 10, 2);
                        }

                    }
                }
            }

        }




    }

}
