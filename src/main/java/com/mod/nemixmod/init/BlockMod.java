package com.mod.nemixmod.init;

import com.mod.nemixmod.NemixMod;
import com.mod.nemixmod.Reference;
import com.mod.nemixmod.blocks.BlockBarriere;
import com.mod.nemixmod.blocks.BlockBasic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import scala.xml.PrettyPrinter.Item;

public class BlockMod
{
	public static Block nemix_block, nemix_ore, nemix_barriere, nemix_reinforced_block;
	public static void init()
	{
		nemix_block = new BlockBasic(Material.rock).setBlockName("nemix_block").setHardness(10).setResistance(50).setCreativeTab(NemixMod.nemixtab).setBlockTextureName(Reference.MOD_ID + ":nemix_block");
		nemix_ore = new BlockBasic(Material.rock).setBlockName("nemix_ore").setHardness(5).setResistance(30).setCreativeTab(NemixMod.nemixtab).setBlockTextureName(Reference.MOD_ID + ":nemix_ore");
		nemix_barriere = new BlockBarriere(Material.glass).setBlockName("nemix_barriere").setHardness(-1).setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName(Reference.MOD_ID + ":nemix_barriere");
		nemix_reinforced_block = new BlockBasic(Material.rock).setBlockName("nemix_reinforced_block").setHardness(10).setResistance(50).setCreativeTab(NemixMod.nemixtab).setBlockTextureName(Reference.MOD_ID + ":nemix_reinforced_block");

	} 
	
	public static void register()
	{
		GameRegistry.registerBlock(nemix_block, nemix_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(nemix_ore, nemix_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(nemix_barriere, nemix_barriere.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(nemix_reinforced_block, nemix_reinforced_block.getUnlocalizedName().substring(5));
		GameRegistry.addSmelting(BlockMod.nemix_ore, new ItemStack(ItemMod.nemix_ingot, 1), 10.0F);
		GameRegistry.addRecipe(new ItemStack(BlockMod.nemix_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.nemix_ingot});
		GameRegistry.addRecipe(new ItemStack(BlockMod.nemix_reinforced_block, 1), new Object[] {"###", "###", "###", '#', ItemMod.nemix_reinforced_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_ingot, 9), new Object[] {"#", '#', BlockMod.nemix_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_ingot, 9), new Object[] {"#", '#', BlockMod.nemix_reinforced_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {"  N", "  N", "  S", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {" N ", " N ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_sword, 1), new Object[] {"N  ", "N  ", "S  ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_pickaxe, 1), new Object[] {"NNN", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_axe, 1), new Object[] {"NN ", "NS ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_hoe, 1), new Object[] {"NN ", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_helmet, 1), new Object[] {"NNN", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_chestplate, 1), new Object[] {"NNN", "NNN", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_leggings, 1), new Object[] {"NNN", "N N", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_boots, 1), new Object[] {"N N", "N N", 'N', ItemMod.nemix_ingot,});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_shovel, 1), new Object[] {" N ", " S ", " S ", 'N', ItemMod.nemix_ingot, 'S', ItemMod.nemix_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_stick, 1), new Object[] {"DND", "DND", 'N', ItemMod.nemix_ingot, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_core, 1), new Object[] {" B ", "BNB", " B ", 'N', Items.nether_star, 'B', BlockMod.nemix_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_ingot, 1), new Object[] {"ONO", "NGN", "ONO", 'O', Blocks.obsidian, 'N', ItemMod.nemix_ingot, 'G', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_core, 1), new Object[] {"OOO", "OCO", "OOO", 'O', Blocks.obsidian, 'C', ItemMod.nemix_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_sword, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_reinforced_ingot, 'S', ItemMod.nemix_sword, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_pickaxe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_reinforced_ingot, 'S', ItemMod.nemix_pickaxe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_axe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_reinforced_ingot, 'S', ItemMod.nemix_axe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_hoe, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_reinforced_ingot, 'S', ItemMod.nemix_hoe, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_shovel, 1), new Object[] {"ISI", "SCS", "ISI", 'I', ItemMod.nemix_reinforced_ingot, 'S', ItemMod.nemix_shovel, 'C', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_apple, 1), new Object[] {"III", "ISI", "III", 'I', ItemMod.nemix_ingot, 'S', Items.apple});
		
		// Armure Nemix renfocrée
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_helmet, 1), new Object[] {"LCL", "CRC", "LCL", 'L', ItemMod.nemix_reinforced_ingot, 'C', ItemMod.nemix_helmet, 'R', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_chestplate, 1), new Object[] {"LCL", "CRC", "LCL", 'L', ItemMod.nemix_reinforced_ingot, 'C', ItemMod.nemix_chestplate, 'R', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_leggings, 1), new Object[] {"LCL", "CRC", "LCL", 'L', ItemMod.nemix_reinforced_ingot, 'C', ItemMod.nemix_leggings, 'R', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_boots, 1), new Object[] {"LCL", "CRC", "LCL", 'L', ItemMod.nemix_reinforced_ingot, 'C', ItemMod.nemix_boots, 'R', ItemMod.nemix_reinforced_core});
		
		// Hammers
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_reinforced_hammer, 1), new Object[] {"LHL", "HRH", "LHL", 'L', ItemMod.nemix_reinforced_ingot, 'H', ItemMod.nemix_hammer, 'R', ItemMod.nemix_reinforced_core});
		GameRegistry.addRecipe(new ItemStack(ItemMod.nemix_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', ItemMod.nemix_stick, 'M', ItemMod.nemix_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.diamond_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', Items.stick, 'M', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ItemMod.golden_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', Items.stick, 'M', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.iron_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', Items.stick, 'M', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.stone_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', Items.stick, 'M', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(ItemMod.wooden_hammer, 1), new Object[] {"MMM", "MMM", " S ", 'S', Items.stick, 'M', Blocks.planks});

		
		
		
	}
}
