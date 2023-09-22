package com.nate.fakenetwork;

import org.bukkit.plugin.java.JavaPlugin;

import com.nate.fakenetwork.NPCs.bSkywarsSolo;

public class Skywars extends JavaPlugin {
    private static Skywars instance;

    public static Skywars getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        bSkywarsSolo.spawn();
        getLogger().info("Skywars plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Skywars plugin has been disabled!");
    }
}
