package com.tygames.heavenandhell.fluid;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.init.INIT;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FluidProperties {
    public static final ForgeFlowingFluid.Properties BLOOD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(INIT.BLOOD_FLUID, INIT.BLOOD_FLUID_FLOWING,
            FluidAttributes.builder(new ResourceLocation(HeavenandHell.MOD_ID, "blocks/blood_still"),
                    new ResourceLocation(HeavenandHell.MOD_ID, "blocks/blood_flow")).density(5).luminosity(10).sound(SoundEvents.ITEM_BUCKET_FILL)
                    .overlay(new ResourceLocation(HeavenandHell.MOD_ID, "blocks/blood_overlay")).rarity(Rarity.RARE)).block(INIT.BLOOD_FLUID_BLOCK);
    public static final ForgeFlowingFluid.Properties HOLY_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(INIT.HOLY_WATER, INIT.HOLY_WATER_FLOWING,
            FluidAttributes.builder(new ResourceLocation(HeavenandHell.MOD_ID, "blocks/holy_water_still"),
                    new ResourceLocation(HeavenandHell.MOD_ID, "blocks/holy_water_flow")).density(69).luminosity(100).sound(SoundEvents.AMBIENT_UNDERWATER_ENTER)
                    .overlay(new ResourceLocation(HeavenandHell.MOD_ID, "blocks/holy_water_overlay")).rarity(Rarity.RARE)).block(INIT.HOLY_WATER_BLOCK);
}
