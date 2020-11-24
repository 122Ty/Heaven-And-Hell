package com.tygames.heavenandhell.entities;

import com.tygames.heavenandhell.HeavenandHell;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VampireEntityRenderer extends MobRenderer<Vampire, VampireEntityModel<Vampire>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(HeavenandHell.MOD_ID, "textures/entity/vampire.png");

    public VampireEntityRenderer(EntityRendererManager rendererManagerIn){
        super(rendererManagerIn, new VampireEntityModel<Vampire>(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(Vampire entity) {
        return TEXTURE;
    }
}

