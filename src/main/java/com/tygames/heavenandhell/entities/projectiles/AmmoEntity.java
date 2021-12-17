package com.tygames.heavenandhell.entities.projectiles;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

public class AmmoEntity extends ArrowEntity{
    public AmmoEntity(World worldIn, LivingEntity shooter) {
        super(worldIn, shooter);
    }

    @Override
    protected void onHit(RayTraceResult raytraceResultIn) {
        super.onHit(raytraceResultIn);
        RayTraceResult.Type hitType = raytraceResultIn.getType();

            // dont stick in the ground as an arrow like a normal one would
            this.remove();

    }

    // do something when it hits an entity
    @Override
    protected void arrowHit(LivingEntity living) {
        super.arrowHit(living);


        living.addPotionEffect(new EffectInstance(Effects.GLOWING, 300, 0));
    }
}