package com.mod.nemixmod.handlers;

import java.awt.Color;
import java.util.Random;

import com.mod.nemixmod.NemixMod;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler {
	public static void registerMonster(Class entityClass, String string)
    {
        int entiyID = EntityRegistry.findGlobalUniqueEntityId();
        
        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(8, 4, 4).getRGB(), new Color(13, 229, 10).getRGB());
        EntityRegistry.addSpawn(string, 40, 5, 10, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.forest);
        EntityRegistry.registerModEntity(entityClass, string, entiyID, NemixMod.instance, 64, 1, true);
    }
    
    public static void registerAmbiants(Class entityClass, String string)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        
        EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(255, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
        EntityRegistry.addSpawn(entityClass, 10, 10, 20, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.plains, BiomeGenBase.forest);
        EntityRegistry.registerModEntity(entityClass, string, entityID, NemixMod.instance, 64, 1, true);
    }
}
