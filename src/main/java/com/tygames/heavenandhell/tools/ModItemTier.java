package com.tygames.heavenandhell.tools;

import com.tygames.heavenandhell.init.INIT;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    HOLY(4, 2500, 12.0f, 1.0f, 30, () -> {
        return Ingredient.fromItems(INIT.SWORD_OF_THE_SPIRIT.get());
    } ),
    SINFUL(4, 2300, 12.0f, 1.0f, 30, () -> {
        return Ingredient.fromItems(INIT.SWORD_OF_SIN.get());

    }),
    MONSTER(4, 100, 1.0f, 1.0f, 10, () -> {
        return Ingredient.fromItems(INIT.JAGGED_STICK.get());
    });


    ;
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantibility;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
