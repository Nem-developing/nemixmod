package com.mod.nemixmod.renders;

import com.mod.nemixmod.Reference;
import com.mod.nemixmod.entity.SoldatNexo;
import com.mod.nemixmod.init.ItemMod;
import com.mod.nemixmod.models.ModelSoldatNexo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RenderTuto extends RenderLiving 
{

    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/mobs/soldatnexo.png");
    
    public RenderTuto(ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }
    
    protected ResourceLocation getEntiyTexture(EntityLiving living)
    {
        return this.getEntityTexture((SoldatNexo) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }   
    
    public void renderHealtBar(SoldatNexo mob, double x, double y, double z, float par8, float par9)
    
    {
        BossStatus.setBossStatus(mob, true);
        super.doRender(mob, x, y, z, par8, par9);
    }
    
    public void doRender(Entity entity, double x, double y, double z, float par8, float par9)
    
    {
        this.renderHealtBar((SoldatNexo)entity, x, y, z, par8, par9);
    }
    
	
}
