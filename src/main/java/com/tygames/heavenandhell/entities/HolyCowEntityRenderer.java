package com.tygames.heavenandhell.entities;

import com.tygames.heavenandhell.HeavenandHell;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HolyCowEntityRenderer extends MobRenderer<HolyCow, HolyCowEntityModel<HolyCow>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(HeavenandHell.MOD_ID, "textures/entity/holy_cow.png");

    public HolyCowEntityRenderer(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new HolyCowEntityModel<>(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(HolyCow entity) {
        return TEXTURE;
    }

}