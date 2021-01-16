package com.mod.nemixmod.proxy;

import com.mod.nemixmod.entity.SoldatNexo;
import com.mod.nemixmod.init.RenderMod;
import com.mod.nemixmod.models.ModelSoldatNexo;
import com.mod.nemixmod.renders.RenderTuto;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
        RenderMod.init();
        
	}
}
