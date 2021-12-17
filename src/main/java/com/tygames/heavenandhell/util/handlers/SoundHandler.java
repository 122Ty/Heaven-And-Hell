package com.tygames.heavenandhell.util.handlers;

import com.tygames.heavenandhell.HeavenandHell;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundHandler
{
    public static SoundEvent ITEM_GUNSHOT;

    public static void registerSounds() {
        ITEM_GUNSHOT = registerSounds("item.gunshot");
    }

    private static SoundEvent registerSounds(String name){
        ResourceLocation location = new ResourceLocation(HeavenandHell.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
