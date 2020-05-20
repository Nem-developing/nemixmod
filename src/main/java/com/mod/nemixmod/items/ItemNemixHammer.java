package com.mod.nemixmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import scala.collection.parallel.ParIterableLike.Min;
import scala.swing.TextComponent;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Time;

import org.apache.commons.logging.Log;

import com.mod.nemixmod.init.BlockMod;
import com.mod.nemixmod.init.ItemMod;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;

public class ItemNemixHammer extends ItemPickaxe {

	public ItemNemixHammer(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setMaxDamage(3333);

	}

	public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z,
			EntityLivingBase elb) {
		boolean isCobble = world.getBlock(x, y, z) == Blocks.cobblestone;
		boolean isStone = world.getBlock(x, y, z) == Blocks.stone;
		boolean isStoneBrick = world.getBlock(x, y, z) == Blocks.stonebrick;
		boolean isSandtone = world.getBlock(x, y, z) == Blocks.sandstone;
		boolean isironstone = world.getBlock(x, y, z) == Blocks.iron_ore;
		boolean isgoldore = world.getBlock(x, y, z) == Blocks.gold_ore;
		boolean iscoaldore = world.getBlock(x, y, z) == Blocks.coal_ore;
		boolean isdiamondore = world.getBlock(x, y, z) == Blocks.diamond_ore;
		boolean isnemixore = world.getBlock(x, y, z) == BlockMod.nemix_ore;

		boolean[] vanillaBlocks = new boolean[] { isCobble, isStone, isStoneBrick, isSandtone, isironstone, isgoldore,
				iscoaldore, isdiamondore, isnemixore };

		if (elb instanceof EntityPlayer) { 										///////////////////////////////////////////////////////////////////////////
																				// Petit patch réalisé par : github.com/antoineok | Cela évite les crash //
			EntityPlayer player = (EntityPlayer) elb; 							// serveur donc merci à lui pour cette petite correction.				 //
			float yaw = player.prevRenderYawOffset; 							///////////////////////////////////////////////////////////////////////////

			while (yaw > 360) {
				yaw = yaw - 360;
			}

			while (yaw < 0) {
				yaw = yaw + 360;
			}

			if (yaw >= 135 && yaw < 225) { // Nord
				if (y < 6) {

					player.addChatMessage(new ChatComponentText(
							EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
					player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6..."));
					stack.damageItem(1, elb);

				} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2] || vanillaBlocks[3]
						|| vanillaBlocks[4] || vanillaBlocks[5] || vanillaBlocks[6] || vanillaBlocks[7]
						|| vanillaBlocks[8]) {
					for (int ix = -1; ix < 2; ++ix) {
						for (int iy = -1; iy < 2; ++iy) {
							for (int iz = -1; iz < 2; ++iz) {

								if (world.getBlock(x, y, z) != Blocks.bedrock) {
									{
										world.func_147480_a((x + ix), (y + iy), z, true);
									}
								}

							}

						}
					}
					stack.damageItem(9, elb);

				}
			} else if (yaw >= 225 && yaw < 315) { // EST
				if (y < 6) {

				} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2] || vanillaBlocks[3]
						|| vanillaBlocks[4] || vanillaBlocks[5] || vanillaBlocks[6] || vanillaBlocks[7]
						|| vanillaBlocks[8]) {
					for (int ix = -1; ix < 2; ++ix) {
						for (int iy = -1; iy < 2; ++iy) {
							for (int iz = -1; iz < 2; ++iz) {

								if (world.getBlock(x, y, z) != Blocks.bedrock) {
									{
										world.func_147480_a(x, (y + iy), (z + iz), true);
									}
								}

							}

						}
						stack.damageItem(9, elb);

					}

				}
			} else if (yaw >= 46 && yaw < 135) { // OUEST
				if (y < 6) {

				} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2] || vanillaBlocks[3]
						|| vanillaBlocks[4] || vanillaBlocks[5] || vanillaBlocks[6] || vanillaBlocks[7]
						|| vanillaBlocks[8]) {
					for (int ix = -1; ix < 2; ++ix) {
						for (int iy = -1; iy < 2; ++iy) {
							for (int iz = -1; iz < 2; ++iz) {

								if (world.getBlock(x, y, z) != Blocks.bedrock) {
									{
										world.func_147480_a(x, y + iy, z + iz, true);

									}
								}

							}

						}
					}
					stack.damageItem(9, elb);

				}

			} else // SUD
			{
				if (y < 6) {
					player.addChatMessage(new ChatComponentText(
							EnumChatFormatting.GOLD + "Tu ne peut pas utiliser le nemix hammer en desous de la"));
					player.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "couche 6..."));
					stack.damageItem(1, elb);
				} else if (vanillaBlocks[0] || vanillaBlocks[1] || vanillaBlocks[2] || vanillaBlocks[3]
						|| vanillaBlocks[4] || vanillaBlocks[5] || vanillaBlocks[6] || vanillaBlocks[7]
						|| vanillaBlocks[8]) {
					for (int ix = -1; ix < 2; ++ix) {
						for (int iy = -1; iy < 2; ++iy) {
							for (int iz = -1; iz < 2; ++iz) {

								if (world.getBlock(x, y, z) != Blocks.bedrock) {
									{
										world.func_147480_a((x + ix), (y + iy), z, true);

									}
								}

							}

						}
					}
					stack.damageItem(9, elb);
				}

				return true;
			}

		}
		return false;
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//																																																	//
//                _______      _____________                 __           _______                       _______                    _________     _________     _________                  ____      //
//  |\      |    |            |      |      |               |   \        |           \            /    |           |              |         |   |         |        |      |\      |      /          //
//  | \     |    |            |      |      |               |     \      |            \          /     |           |              |         |   |         |        |      | \     |     /           //
//  |  \    |    |            |      |      |               |       \    |             \        /      |           |              |         |   |_________|        |      |  \    |     |           //
//  |   \   |    |=====       |      |      |     =====     |        |   |=====         \      /       |=====      |              |         |   |                  |      |   \   |     |     __    //
//  |    \  |    |            |      |      |               |       /    |               \    /        |           |              |         |   |                  |      |    \  |     |       |   //
//  |     \ |    |            |      |      |               |     /      |                \  /         |           |              |         |   |                  |      |     \ |      \      /   //
//  |      \|    |_______     |      |      |               |__ /        |_______          \/          |_______    |_________     |_________|   |              ____|____  |      \|       \____/    //
//																																																    //
//																																																    //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
