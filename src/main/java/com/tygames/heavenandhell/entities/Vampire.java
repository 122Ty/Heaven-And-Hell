package com.tygames.heavenandhell.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.FleeSunGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class Vampire extends MonsterEntity {
    private FleeSunGoal fleeSunGoal;

    public Vampire(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }
    @Override
    protected void registerGoals(){
        super.registerGoals();
        this.fleeSunGoal = new FleeSunGoal(this, 3);
    }

    }



