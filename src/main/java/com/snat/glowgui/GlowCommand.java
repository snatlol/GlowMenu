package com.snat.glowgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static com.snat.glowgui.Utils.color;

public class GlowCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            Inventory inv = Bukkit.createInventory(player, 36, color("&d&lGLOW"));
            if (player.hasPermission("Glow.use")) {
                player.openInventory(inv);
            } else {
                player.sendMessage(color("&cYou do not have permission!"));
            }



            //Orange
            ItemStack orange = new ItemBuilder(Material.ORANGE_STAINED_GLASS).
                    setDisplayName(color("&6&lOrange")).setLore(color("&6Glow Orange!")).build();
            inv.setItem(10, orange);


            //Blue
            ItemStack blue = new ItemBuilder(Material.BLUE_STAINED_GLASS).
                    setDisplayName(color("&b&lBlue")).setLore(color("&bGlow Blue!")).build();
            inv.setItem(11, blue);


            //Pink
            ItemStack pink = new ItemBuilder(Material.PINK_STAINED_GLASS).
                    setDisplayName(color("&d&lPink")).setLore(color("&dGlow Pink!")).build();
            inv.setItem(12, pink);


            //Yellow
            ItemStack yellow = new ItemBuilder(Material.YELLOW_STAINED_GLASS).
                    setDisplayName(color("&e&lYellow")).setLore(color("&eGlow Yellow!")).build();
            inv.setItem(13, yellow);


            //Red
            ItemStack red = new ItemBuilder(Material.RED_STAINED_GLASS).
                    setDisplayName(color("&c&lRed")).setLore(color("&cGlow Red!")).build();
            inv.setItem(14, red);


            //Clear
            ItemStack clear = new ItemBuilder(Material.GLASS).
                    setDisplayName(color("&f&lClear")).setLore(color("&cClear All Glowing Effects!")).build();
            inv.setItem(31, clear);
            player.setGlowing(false);


            // Frame
            ItemStack frame = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
            for (int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 28, 29, 30, 32, 33, 34, 35}) {
                inv.setItem(i, frame);
            }
        }
        return false;
    }
}
