package com.snat.glowgui;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

public final class Main extends JavaPlugin {
    public Scoreboard scoreboard = this.getServer().getScoreboardManager().getMainScoreboard();

    @Override
    public void onEnable() {
        this.getCommand("glow").setExecutor(new GlowCommand());
        getServer().getPluginManager().registerEvents(new GlowListener(), this);
    }

    public void onDisable() {


        scoreboard.getTeams().clear();


    }
}
