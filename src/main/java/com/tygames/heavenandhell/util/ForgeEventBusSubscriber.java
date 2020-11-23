package com.tygames.heavenandhell.util;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = HeavenandHell.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if(DimensionType.byName(HeavenandHell.HEAVEN_DIM_TYPE) == null) {
            DimensionManager.registerDimension(HeavenandHell.HEAVEN_DIM_TYPE, DimensionInit.HEAVEN.get(), null, true);

        }
        HeavenandHell.LOGGER.info("Dimensions Registered!");
    }
}
