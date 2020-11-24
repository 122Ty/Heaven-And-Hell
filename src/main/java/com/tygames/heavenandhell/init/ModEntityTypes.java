package com.tygames.heavenandhell.init;

import com.tygames.heavenandhell.HeavenandHell;
import com.tygames.heavenandhell.entities.Vampire;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, HeavenandHell.MOD_ID);

    public static final RegistryObject<EntityType<Vampire>> VAMPIRE = ENTITY_TYPES.register("vampire", () -> EntityType.Builder.
            <Vampire>create(Vampire::new, EntityClassification.MONSTER).size(0.6f, 1.95f)
            .build(new ResourceLocation(HeavenandHell.MOD_ID, "vampire").toString()));

}
