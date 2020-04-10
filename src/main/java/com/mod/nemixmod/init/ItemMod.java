package com.mod.nemixmod.init;

import com.mod.nemixmod.NemixMod;
import com.mod.nemixmod.Reference;
import com.mod.nemixmod.items.ItemNemixApple;
import com.mod.nemixmod.items.ItemNemixArmor;
import com.mod.nemixmod.items.ItemNemixAxe;
import com.mod.nemixmod.items.ItemNemixHoe;
import com.mod.nemixmod.items.ItemNemixPickaxe;
import com.mod.nemixmod.items.ItemNemixReinforcedArmor;
import com.mod.nemixmod.items.ItemNemixReinforcedAxe;
import com.mod.nemixmod.items.ItemNemixReinforcedHoe;
import com.mod.nemixmod.items.ItemNemixReinforcedPickaxe;
import com.mod.nemixmod.items.ItemNemixReinforcedShovel;
import com.mod.nemixmod.items.ItemNemixReinforcedSword;
import com.mod.nemixmod.items.ItemNemixShovel;
import com.mod.nemixmod.items.ItemNemixSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
	public static ToolMaterial NemixMatt = EnumHelper.addToolMaterial("Nemix", 8, 3333, 15, 5, 30);
	public static ToolMaterial NemixReinforcedMatt = EnumHelper.addToolMaterial("NemixReinforced", 10, 7777, 30, 15, 1);
	
	
	public static ArmorMaterial NemixArm = EnumHelper.addArmorMaterial("Nemix", 40, new int[] {5, 10, 10, 5}, 7);
	public static ArmorMaterial NemixReinforcedArm = EnumHelper.addArmorMaterial("NemixReinforced", 40, new int[] {10, 20, 20, 10}, 7);
	
	
	
	public static Item nemix_ingot, nemix_core_ingot, nemix_reinforced_ingot, nemix_sword, nemix_shovel, nemix_pickaxe, nemix_axe, nemix_hoe, nemix_helmet, nemix_chestplate, nemix_leggings, nemix_boots, nemix_apple, nemix_stick, nemix_core, nemix_reinforced_core, nemix_reinforced_sword, nemix_reinforced_pickaxe, nemix_reinforced_helmet ,nemix_reinforced_chestplate, nemix_reinforced_leggings, nemix_reinforced_boots,nemix_reinforced_axe, nemix_reinforced_hoe, nemix_reinforced_shovel;
	public static void init()
	{ 
		nemix_ingot = new Item().setUnlocalizedName("nemix_ingot").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_ingot");
		nemix_core_ingot = new Item().setUnlocalizedName("nemix_core_ingot").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_core_ingot");
		nemix_sword = new ItemNemixSword(ItemMod.NemixMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_sword").setUnlocalizedName("nemix_sword");
		nemix_pickaxe = new ItemNemixPickaxe(ItemMod.NemixMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_pickaxe").setUnlocalizedName("nemix_pickaxe");
		nemix_axe = new ItemNemixAxe(ItemMod.NemixMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_axe").setUnlocalizedName("nemix_axe");
		nemix_hoe = new ItemNemixHoe(ItemMod.NemixMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_hoe").setUnlocalizedName("nemix_hoe");
		nemix_helmet = new ItemNemixArmor(ItemMod.NemixArm, 0).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_helmet").setUnlocalizedName("nemix_helmet");
		nemix_chestplate = new ItemNemixArmor(ItemMod.NemixArm, 1).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_chestplate").setUnlocalizedName("nemix_chestplate");
		nemix_leggings = new ItemNemixArmor(ItemMod.NemixArm, 2).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_leggings").setUnlocalizedName("nemix_leggings");
		nemix_boots = new ItemNemixArmor(ItemMod.NemixArm, 3).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_boots").setUnlocalizedName("nemix_boots");
		nemix_apple = new ItemNemixApple(4, 10.0F, true).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_apple").setUnlocalizedName("nemix_apple");
		nemix_shovel = new ItemNemixShovel(ItemMod.NemixMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_shovel").setUnlocalizedName("nemix_shovel");
		nemix_stick = new Item().setUnlocalizedName("nemix_stick").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_stick");
		nemix_core = new Item().setUnlocalizedName("nemix_core").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_core");
		nemix_reinforced_core = new Item().setUnlocalizedName("nemix_reinforced_core").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_core");
		nemix_reinforced_sword = new ItemNemixReinforcedSword(ItemMod.NemixReinforcedMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_sword").setUnlocalizedName("nemix_reinforced_sword");
		nemix_reinforced_pickaxe = new ItemNemixReinforcedPickaxe(ItemMod.NemixReinforcedMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_pickaxe").setUnlocalizedName("nemix_reinforced_pickaxe");
		nemix_reinforced_axe = new ItemNemixReinforcedAxe(ItemMod.NemixReinforcedMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_axe").setUnlocalizedName("nemix_reinforced_axe");		
		nemix_reinforced_hoe = new ItemNemixReinforcedHoe(ItemMod.NemixReinforcedMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_hoe").setUnlocalizedName("nemix_reinforced_hoe");			
		nemix_reinforced_shovel = new ItemNemixReinforcedShovel(ItemMod.NemixReinforcedMatt).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_shovel").setUnlocalizedName("nemix_reinforced_shovel");
		nemix_reinforced_helmet = new ItemNemixReinforcedArmor(NemixReinforcedArm, 0).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_helmet").setUnlocalizedName("nemix_reinforced_helmet");
		nemix_reinforced_chestplate = new ItemNemixReinforcedArmor(NemixReinforcedArm, 1).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_chestplate").setUnlocalizedName("nemix_reinforced_chestplate");
		nemix_reinforced_leggings = new ItemNemixReinforcedArmor(NemixReinforcedArm, 2).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_leggings").setUnlocalizedName("nemix_reinforced_leggings");
		nemix_reinforced_boots = new ItemNemixReinforcedArmor(NemixReinforcedArm, 3).setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_boots").setUnlocalizedName("nemix_reinforced_boots");
		nemix_reinforced_ingot = new Item().setUnlocalizedName("nemix_reinforced_ingot").setCreativeTab(NemixMod.nemixtab).setTextureName(Reference.MOD_ID + ":nemix_reinforced_ingot");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ItemMod.nemix_ingot, "nemix_ingot");
		GameRegistry.registerItem(ItemMod.nemix_core_ingot, "nemix_core_ingot");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_ingot, "nemix_reinforced_ingot");
		GameRegistry.registerItem(ItemMod.nemix_sword, "nemix_sword");
		GameRegistry.registerItem(ItemMod.nemix_pickaxe, "nemix_pickaxe");
		GameRegistry.registerItem(ItemMod.nemix_axe, "nemix_axe");
		GameRegistry.registerItem(ItemMod.nemix_shovel, "nemix_shovel");
		GameRegistry.registerItem(ItemMod.nemix_hoe, "nemix_hoe");
		GameRegistry.registerItem(ItemMod.nemix_helmet, "nemix_helmet");
		GameRegistry.registerItem(ItemMod.nemix_chestplate, "nemix_chestplate");
		GameRegistry.registerItem(ItemMod.nemix_leggings, "nemix_leggings");
		GameRegistry.registerItem(ItemMod.nemix_boots, "nemix_boots");
		GameRegistry.registerItem(ItemMod.nemix_apple, "nemix_apple");
		GameRegistry.registerItem(ItemMod.nemix_stick, "nemix_stick");
		GameRegistry.registerItem(ItemMod.nemix_core, "nemix_core");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_core, "nemix_reinforced_core");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_sword, "nemix_reinforced_sword");		
		GameRegistry.registerItem(ItemMod.nemix_reinforced_pickaxe, "nemix_reinforced_pickaxe");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_axe, "nemix_reinforced_axe");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_hoe, "nemix_reinforced_hoe");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_shovel, "nemix_reinforced_shovel");		
		GameRegistry.registerItem(ItemMod.nemix_reinforced_helmet, "nemix_reinforced_helmet");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_chestplate, "nemix_reinforced_chestplate");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_leggings, "nemix_reinforced_leggings");
		GameRegistry.registerItem(ItemMod.nemix_reinforced_boots, "nemix_reinforced_boots");		
	}
}
