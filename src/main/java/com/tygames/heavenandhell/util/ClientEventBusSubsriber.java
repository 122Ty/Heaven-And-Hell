package com.tygames.heavenandhell.util;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.entities.VampireEntityRenderer;
import com.tygames.heavenandhell.init.ModEntityTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HeavenandHell.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubsriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {


        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.VAMPIRE.get(), VampireEntityRenderer::new);


    }
}