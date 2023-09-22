package com.nate.fakenetwork.NPCs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class bSkywarsSolo {
    public static void spawn(Location location) {
        World world = location.getWorld();
        if (world != null) {
            Location npcLocation = new Location(world, 203, 58, 344);
            LivingEntity npc = (LivingEntity) world.spawnEntity(npcLocation, EntityType.VILLAGER);
            npc.setCustomName("MyNPC");
            npc.setCustomNameVisible(true);
        }
    }
}
