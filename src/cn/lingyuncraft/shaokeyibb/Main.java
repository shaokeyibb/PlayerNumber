package cn.lingyuncraft.shaokeyibb;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin implements Listener {
    int playernumber=0;
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("PlayerNumber插件开启成功!");
    }
    public void onDisable() {
        getLogger().info("PlayerNumber插件卸载成功!");
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        new BukkitRunnable(){
            @Override
            public void run(){
                playernumber++;
                e.getPlayer().sendMessage( "§a-----------------------------------------\n-你是加入零人帝国的第" + playernumber + "位玩家-\n-----------------------------------------");
            }
        }.runTaskLater(this,20L);
    }

}
