package com.snat.glowgui;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemBuilder {

    private ItemStack itemStack;
    private ItemMeta itemMeta;


    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();

    }

    private void updateItemMeta() {
        this.itemStack.setItemMeta(this.itemMeta);
    }

    public ItemBuilder setDisplayName(String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setLore(String... lines) {
        this.itemMeta.setLore(Arrays.asList(lines));
        return this;
    }


    public ItemStack build() {
        this.updateItemMeta();
        return this.itemStack;
    }


}
