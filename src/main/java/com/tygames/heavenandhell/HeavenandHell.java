package com.tygames.heavenandhell;

import com.tygames.heavenandhell.init.BiomeInit;
import com.tygames.heavenandhell.init.DimensionInit;
import com.tygames.heavenandhell.init.INIT;
import com.tygames.heavenandhell.init.ModEntityTypes;
import com.tygames.heavenandhell.item.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("heavenandhell")
public class HeavenandHell
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "heavenandhell";
    public static final ResourceLocation HEAVEN_DIM_TYPE = new ResourceLocation(MOD_ID,"heaven");
    public static final ResourceLocation HELL_DIM_TYPE = new ResourceLocation(MOD_ID, "hell");


    public HeavenandHell() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);


        INIT.init();
        MinecraftForge.EVENT_BUS.register(this);
        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }
@SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent<EntityType<?>> event){
        ModSpawnEggItem.initSpawnEggs();
    }
//Makes Creative Tab
    public static final ItemGroup TAB = new ItemGroup("heavenTab") {
    @Override
    public ItemStack createIcon() {
        return new ItemStack(INIT.HOLY_BIBLE.get());
    }
};
    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event){
        BiomeInit.registerBiome();
    }


}



