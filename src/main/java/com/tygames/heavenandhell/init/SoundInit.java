package com.tygames.heavenandhell.init;

import com.tygames.heavenandhell.HeavenandHell;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, HeavenandHell.MOD_ID);

    public static final RegistryObject<SoundEvent> GUNSHOT = SOUNDS.register("item.gunshot",
            () -> new SoundEvent(new ResourceLocation(HeavenandHell.MOD_ID, "item.gunshot")));
}
