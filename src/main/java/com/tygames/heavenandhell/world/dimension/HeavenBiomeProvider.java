package com.tygames.heavenandhell.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.tygames.heavenandhell.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class HeavenBiomeProvider extends BiomeProvider {
    private Random rand;
    public HeavenBiomeProvider() {
        super(biomeList);
        rand = new Random();
    }

    public static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.HEAVENLY_PLAINS.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return BiomeInit.HEAVENLY_PLAINS.get();
    }
}
