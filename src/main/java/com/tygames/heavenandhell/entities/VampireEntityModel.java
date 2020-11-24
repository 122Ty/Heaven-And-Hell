package com.tygames.heavenandhell.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class VampireEntityModel<T extends Vampire> extends EntityModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer legs;
    private final ModelRenderer arm;

    public VampireEntityModel() {
        textureWidth = 16;
        textureHeight = 16;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 8.0F, 0.0F);


        legs = new ModelRenderer(this);
        legs.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(legs);
        legs.setTextureOffset(0,0).addBox(0f,-2.0f,0.0f, 0.0F, 6,16,0.0f, false);

        arm = new ModelRenderer(this);
        arm.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(arm);
        arm.setTextureOffset(0,0).addBox(0, -10.0F, -1.0F, 0.0F, 22, 1, 1, 0.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        body.render(matrixStackIn, bufferIn,packedLightIn,packedOverlayIn, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }

    public ModelRenderer getArm() {
        return arm;
    }

    public ModelRenderer getBody() {
        return body;
    }

    public ModelRenderer getLegs() {
        return legs;
    }
}