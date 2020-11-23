package com.tygames.heavenandhell.init;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.world.dimension.HeavenModDimension;
import com.tygames.heavenandhell.world.dimension.HellModDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, HeavenandHell.MOD_ID);

    public static final RegistryObject<ModDimension> HEAVEN = MOD_DIMENSIONS.register("heaven", () -> new HeavenModDimension());
    public static final RegistryObject<ModDimension> HELL = MOD_DIMENSIONS.register("hell", () -> new HellModDimension());
}
