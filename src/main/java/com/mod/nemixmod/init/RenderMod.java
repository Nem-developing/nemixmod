package com.mod.nemixmod.init;

import com.mod.nemixmod.entity.SoldatNexo;
import com.mod.nemixmod.models.ModelSoldatNexo;
import com.mod.nemixmod.renders.RenderTuto;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderMod {
	
	public static void init() {
		RenderingRegistry.registerEntityRenderingHandler(SoldatNexo.class, new RenderTuto(new ModelSoldatNexo(), 0.5F));
	}
}
