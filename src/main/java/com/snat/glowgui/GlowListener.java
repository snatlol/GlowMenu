package com.snat.glowgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import static com.snat.glowgui.Utils.color;
public class GlowListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if(e.getView().getTitle().equals(color("&d&lGLOW"))) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            Scoreboard board = Bukkit.getScoreboardManager().getMainScoreboard();
            Team orange;
            Team blue;
            Team yellow;
            Team pink;
            Team red;
            Team clear;

            if(board.getTeam("orangeTeam") == null) {
                orange = board.registerNewTeam("orangeTeam");
            }else{
                orange = board.getTeam("orangeTeam");
            }
            if(board.getTeam("blueTeam") == null) {
                blue = board.registerNewTeam("blueTeam");
            }else{
                blue = board.getTeam("blueTeam");
            }
            if(board.getTeam("yellowTeam") == null) {
                yellow = board.registerNewTeam("yellowTeam");
            }else{
                yellow = board.getTeam("yellowTeam");
            }
            if(board.getTeam("pinkTeam") == null) {
                pink = board.registerNewTeam("pinkTeam");
            }else{
                pink = board.getTeam("pinkTeam");
            }
            if(board.getTeam("redTeam") == null) {
                red = board.registerNewTeam("redTeam");
            }else{
                red = board.getTeam("redTeam");
            }
            if(board.getTeam("clear") == null) {
                clear = board.registerNewTeam("clear");
            }else{
                clear = board.getTeam("clear");
            }






            switch(e.getRawSlot()) {
                case 10: //Orange
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&6&lYou are now glowing Orange!"));
                    player.setGlowing(true);
                    orange.setColor(ChatColor.GOLD);
                    orange.addEntry(player.getName());
                    break;
                case 11: //blue
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&b&lYou are now glowing Blue!"));
                    player.setGlowing(true);
                    blue.setColor(ChatColor.BLUE);
                    blue.addEntry(player.getName());
                    break;
                case 12: //pink
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&d&lYou are now glowing Pink!"));
                    player.setGlowing(true);
                    pink.setColor(ChatColor.LIGHT_PURPLE);
                    pink.addEntry(player.getName());
                    break;
                case 13: //Yellow
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&e&lYou are now glowing Yellow!"));
                    player.setGlowing(true);
                    yellow.setColor(ChatColor.YELLOW);
                    yellow.addEntry(player.getName());
                    break;
                case 14: //Red
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&c&lYou are now glowing Red!"));
                    player.setGlowing(true);
                    red.setColor(ChatColor.RED);
                    red.addEntry(player.getName());
                    break;
                case 31: //Clear
                    player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 1, 1);
                    player.sendMessage(color("&c&lYou no longer glowing!"));
                    player.setGlowing(false);
                    break;

                default:
                    return;
            }
            player.closeInventory();
        }
    }
}
