package com.tygames.heavenandhell.world.biomes;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import com.tygames.heavenandhell.init.INIT;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class HeavenBiomeSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    public HeavenBiomeSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> function) {
        super(function);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
                             BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        Random rd = new Random();
        int i = rd.nextInt(3);
        if (i == 0) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed,
                    new SurfaceBuilderConfig(INIT.HOLY_BLOCK.get().getDefaultState(),
                            INIT.HELL_BLOCK.get().getDefaultState(), Blocks.ACACIA_PLANKS.getDefaultState()));
        } else {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed,
                    new SurfaceBuilderConfig(
                            i == 1 ? Blocks.GRASS_BLOCK.getDefaultState()
                                    : INIT.HOLY_BLOCK.get().getDefaultState(),
                            INIT.HELL_BLOCK.get().getDefaultState(), Blocks.ACACIA_PLANKS.getDefaultState()));
        }
    }
}