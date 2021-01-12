package com.mod.nemixmod.init;

import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RemoveMod {

	public static void init() {
		removeCraft(new ItemStack(Items.writable_book));
	}
	
	
	private static void removeCraft(ItemStack stack) {
		
		List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
		
		
		for (int i = 0; i < recipeList.size(); i++) {
			ItemStack out = recipeList.get(i).getRecipeOutput();
			if (out != null && stack.getItem() == out.getItem() && stack.getItemDamage() == out.getItemDamage()) {
				recipeList.remove(i);
			}
		}
 		
		
	}
}

