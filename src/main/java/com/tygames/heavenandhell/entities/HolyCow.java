package com.tygames.heavenandhell.entities;

import com.tygames.heavenandhell.init.ModEntityTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.FleeSunGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HolyCow<T extends HolyCow> extends AnimalEntity {

    public HolyCow(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }
    @Override
    protected void registerGoals(){
        super.registerGoals();

    }



    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }
}