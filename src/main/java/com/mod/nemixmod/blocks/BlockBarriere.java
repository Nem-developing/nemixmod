package com.mod.nemixmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBarriere extends Block{

	public BlockBarriere(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockUnbreakable();
		this.setLightLevel(100);
	}
	
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	


}
