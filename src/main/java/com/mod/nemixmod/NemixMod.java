package com.mod.nemixmod;

import com.mod.nemixmod.init.BlockMod;
import com.mod.nemixmod.init.ItemMod;
import com.mod.nemixmod.init.RemoveMod;
import com.mod.nemixmod.proxy.CommonProxy;
import com.mod.nemixmod.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class NemixMod
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs nemixtab = new CreativeTabs("nemixtab") 
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(BlockMod.nemix_block);
		}
	};
	 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemMod.init(); 
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
		RemoveMod.init();
		WorldRegister.mainRegistry();
	}
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
