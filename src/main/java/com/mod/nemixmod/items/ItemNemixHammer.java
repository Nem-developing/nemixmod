package com.mod.nemixmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import scala.collection.parallel.ParIterableLike.Min;
import scala.swing.TextComponent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Time;

import org.apache.commons.logging.Log;

import com.mod.nemixmod.init.BlockMod;
import com.mod.nemixmod.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;

public class ItemNemixHammer extends ItemPickaxe {

	public ItemNemixHammer(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setMaxDamage(1500);

	}

		
	
	
	
	public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
		if (entity instanceof EntityPlayer) {

		stack.damageItem(1, entity);
		EntityPlayer player = (EntityPlayer) entity;

		Vec3 lookVec = player.getLookVec();
		double xLook = Math.abs(lookVec.xCoord);
		double yLook = Math.abs(lookVec.yCoord);
		double zLook = Math.abs(lookVec.zCoord);

		double max = Math.max(xLook, Math.max(yLook, zLook));

		int addX = 1;
		int addY = 1;
		int addZ = 1;

		
		boolean isCobble = world.getBlock(x, y, z) == Blocks.cobblestone;
		boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
		boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
		boolean isSandtone = world.getBlock(x, y, z) == Blocks.sandstone;
		boolean isironstone = world.getBlock(x, y, z) == Blocks.iron_ore;
		boolean isgoldore = world.getBlock(x, y, z) == Blocks.gold_ore;
		boolean iscoaldore = world.getBlock(x, y, z) == Blocks.coal_ore;
		boolean isdiamondore = world.getBlock(x, y, z) == Blocks.diamond_ore;
		boolean isnemixore = world.getBlock(x, y, z) == BlockMod.nemix_ore;
		boolean isemeraldore = world.getBlock(x, y, z) == Blocks.emerald_ore;
		boolean islazuliore = world.getBlock(x, y, z) == Blocks.lapis_ore;
		boolean isquartzore = world.getBlock(x, y, z) == Blocks.quartz_ore;

		boolean[] vanillaBlocks = new boolean[] { isCobble, isStone, isStoneBrick, isSandtone, isironstone, isgoldore, iscoaldore, isdiamondore, isnemixore, isemeraldore, islazuliore, isquartzore};
		
		
		
		
		if (max == xLook) {
		y -= 1;
		z -= 1;
		addX = 3;
		} else if (max == yLook) {
		x -= 1;
		z -= 1;
		addY = 3;
		} else if (max == zLook) {
		x -= 1;
		y -= 1;
		addZ = 3;
		}
		
		
		
		if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2] || vanillaBlocks[3]
				|| vanillaBlocks[4] || vanillaBlocks[5] || vanillaBlocks[6] || vanillaBlocks[7]
				|| vanillaBlocks[8] || vanillaBlocks[9] || vanillaBlocks[10] || vanillaBlocks[11]) {

		for (int xOffset = 0; xOffset < 3; xOffset += addX) {
		for (int yOffset = 0; yOffset < 3; yOffset += addY) {
		for (int zOffset = 0; zOffset < 3; zOffset += addZ) {

		Block currentBlock = world.getBlock(x + xOffset, y + yOffset, z + zOffset);
		int blockMetadata = world.getBlockMetadata(x + xOffset, y + yOffset, z + zOffset);

		BreakEvent event = new BreakEvent(x + xOffset, y + yOffset, x + zOffset, world, currentBlock, blockMetadata, (EntityPlayer) player);
		event.setCanceled(!player.capabilities.isCreativeMode);
		
		if (currentBlock.getBlockHardness(world, x + xOffset, y + yOffset, z + zOffset) <= 4.0F)
		event.setCanceled(false);

			if (currentBlock.getBlockHardness(world, x + xOffset, y + yOffset, z + zOffset) <= 0F)
			event.setCanceled(true);
	
			MinecraftForge.EVENT_BUS.post(event);
	
				if (!event.isCanceled()) {
				currentBlock.harvestBlock(world, (EntityPlayer) player, x + xOffset, y + yOffset, z + zOffset, blockMetadata);
				world.setBlockToAir(x + xOffset, y + yOffset, z + zOffset);
		
				boolean hasSilk = EnchantmentHelper.getSilkTouchModifier(player);
				boolean canSilk = currentBlock.canSilkHarvest(world, (EntityPlayer) player, x + xOffset, y + yOffset, z + zOffset, blockMetadata);
					if (ForgeHooks.canHarvestBlock(currentBlock, (EntityPlayer) player, blockMetadata) && (!hasSilk || hasSilk && !canSilk)) {
						int exp = currentBlock.getExpDrop(world, blockMetadata, EnchantmentHelper.getFortuneModifier(player));
						currentBlock.dropXpOnBlockBreak(world, x + xOffset, y + yOffset, z + zOffset, exp);
					}	
				}
				}
			}
		}
		return true;
		}
		}
		return false;
		}
	
	
	
}
