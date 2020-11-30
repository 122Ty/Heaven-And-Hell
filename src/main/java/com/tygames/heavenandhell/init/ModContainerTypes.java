package com.tygames.heavenandhell.init;

import com.tygames.heavenandhell.HeavenandHell;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES =new DeferredRegister<>(ForgeRegistries.CONTAINERS, HeavenandHell.MOD_ID);

    public static final RegistryObject<ContainerType<HoldingContainer>> HEAVENLY_ALTAR = CONTAINER_TYPES.register("heavenly_altar", () -> IForgeContainerType.create(HoldingContainer::new));
}
