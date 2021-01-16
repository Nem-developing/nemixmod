package com.mod.nemixmod.init;

import com.mod.nemixmod.entity.SoldatNexo;
import com.mod.nemixmod.handlers.EntityHandler;

import net.minecraft.entity.passive.EntityAnimal;

public class EntityMod {
	public static void init(){
		EntityHandler.registerMonster(SoldatNexo.class, "SoldatNexo");
	}
}
