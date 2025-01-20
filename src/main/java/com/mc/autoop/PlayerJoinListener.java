package com.mc.autoop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import java.util.logging.Logger;

public class PlayerJoinListener implements Listener {

    private final Logger logger;

    public PlayerJoinListener(Logger logger) {
        this.logger = logger;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.isOp()) {
            player.setOp(true);
            player.sendMessage("You have been automatically OPed.");
            logger.info(player.getName() + " has been automatically OPed.");
        }
    }
}