package com.tygames.heavenandhell.init;


import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.world.biomes.HeveanlyPlains;
import com.tygames.heavenandhell.world.biomes.HellBiome;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {

    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, HeavenandHell.MOD_ID);

    public static  final RegistryObject<Biome> HEAVENLY_PLAINS = BIOMES.register("heaven_biome",
            () -> new HeveanlyPlains(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(1.2f).temperature(0.5f)
                    .waterColor(1628396).waterFogColor(1636076).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(INIT.HOLY_BLOCK.get().getDefaultState(),
                            INIT.HOLY_DIRT.get().getDefaultState(), INIT.HOLY_BLOCK.get().getDefaultState())).category(Biome.Category.PLAINS).downfall(0.5f).depth(0.125f).parent(null)));


    public static  final RegistryObject<Biome> HELL_BIOME = BIOMES.register("hell_biome",
            () -> new HellBiome(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(1.2f).temperature(0.5f)
                    .waterColor(16727059).waterFogColor(16722195).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(INIT.HELL_BLOCK.get().getDefaultState(),
                            INIT.HELL_DIRT.get().getDefaultState(), INIT.HELL_BLOCK.get().getDefaultState())).category(Biome.Category.NETHER).downfall(0.5f).depth(0.125f).parent(null)));


    public static void registerBiome() {
        registerBiome(HEAVENLY_PLAINS.get(), BiomeDictionary.Type.OVERWORLD);
        registerBiome(HELL_BIOME.get(), BiomeDictionary.Type.NETHER);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }
}