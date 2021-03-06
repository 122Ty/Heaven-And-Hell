package com.tygames.heavenandhell.world.biomes;

import com.tygames.heavenandhell.entities.Vampire;
import com.tygames.heavenandhell.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;

public class HeveanlyPlains extends Biome {
    public HeveanlyPlains(Builder biomeBuilder) {
        super(biomeBuilder);

        addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.SWAMP_HUT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));

    }


    }


