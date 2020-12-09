package com.tygames.heavenandhell.armor;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.init.INIT;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ArmorTier implements IArmorMaterial {

    HOLY(HeavenandHell.MOD_ID + ":holy", 10, new int[] {4,9,7,4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0f, () -> {return Ingredient.fromItems(INIT.HOLY_INGOT.get()); }),
    SINFUL(HeavenandHell.MOD_ID + ":sinful", 10, new int[] {4,9,7,4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0f, () -> {return Ingredient.fromItems(INIT.SINFUL_INGOT.get()); }),
    ANGELIC(HeavenandHell.MOD_ID + ":angelic", 10, new int[] {5, 10 ,8, 5}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0f, () -> {return Ingredient.fromItems(INIT.ANGELIC_GRACE.get()); }),
    DEMONIC(HeavenandHell.MOD_ID + ":demonic", 10, new int[] {5, 10 ,8, 5}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0f, () -> {return Ingredient.fromItems(INIT.DEMONIC_SOUL.get()); }),
    MONSTER(HeavenandHell.MOD_ID + ":monster", 10, new int[] {4,9,7,4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0f, () -> {return Ingredient.fromItems(INIT.MONSTER_HIDE.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ArmorTier(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this. damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
