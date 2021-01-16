package com.mod.nemixmod.entity;

import java.io.Console;
import java.util.Random;

import com.mod.nemixmod.init.ItemMod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class SoldatNexo extends EntityMob implements IBossDisplayData{
	
	

	public SoldatNexo(World p_i1738_1_) {
		super(p_i1738_1_);
		this.getNavigator().setBreakDoors(true);
	    this.tasks.addTask(0, new EntityAISwimming(this));
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 10.0D, false));
	    this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	    this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
	    this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
	    this.tasks.addTask(8, new EntityAILookIdle(this));
	    this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	    this.setSize(0.6F, 1.8F);
	    dropRareDrop(5);
	}

	
	
	protected void applyEntityAttributes(){
      super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
      this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.2D); 
      this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
      this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
	}
	
	
	public Item getDropItem(){
		return ItemMod.diamond_hammer;
	}
	
	public void dropFewItems(boolean b, int looting){
		
		
		int min = 1;
		int max = 1000;

		int rand = 0 + (int)(Math.floor(Math.random() * (max - min +1) + min));
		
		if (rand == 777) {
			this.dropItem(ItemMod.nemix_hammer, 2);
		} else if (rand < 500) {
			this.dropItem(ItemMod.nemix_apple, 1);	
						
		} else {
			this.dropItem(ItemMod.nemix_ingot, 1);
		}
		
	}
		
	
	
	
	

	
	
}
	
	
