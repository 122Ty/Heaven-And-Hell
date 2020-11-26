package com.tygames.heavenandhell.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;



public class VampireEntityModel<T extends Vampire> extends EntityModel<T>{
    private final ModelRenderer bone;

    public VampireEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0,0).addBox(16, 0.0f, -12.0f, -2.0f, 4,12,4,0.0f,0.0f);
        bone.setTextureOffset(0,0).addBox(14, 0.0f, -12.0f, -2.0f, 4,12,4,0.25f,0.0f);
        bone.setTextureOffset(32,32).addBox(48, 4.0f, -24.0f, -2.0f, 4,12,4,0.0f,0.0f);
        bone.setTextureOffset(31,31).addBox(48, 4.0f, -24.0f, -2.0f, 4,12,4,0.25f,0.0f);
        bone.setTextureOffset(0,0).addBox(16, -4.0f, -12.0f, -2.0f, 4,12,4,0.0f,0.0f);
        bone.setTextureOffset(0,0).addBox(15, -4.0f, -12.0f, -2.0f, 4,12,4,0.25f,0.0f);
        bone.setTextureOffset(32,32).addBox(48, -8.0f, -24.0f, -2.0f, 4,12,4,0.0f,0.0f);
        bone.setTextureOffset(32,32).addBox(48, -8.0f, -24.0f, -2.0f, 4,12,4,0.25f,0.0f);
        bone.setTextureOffset(16,16).addBox(16, -4.0f, -24.0f, -2.0f, 8,12,4,0.0f,0.0f);
        bone.setTextureOffset(16,16).addBox(16, -4.0f, -24.0f, -2.0f, 8,12,4,0.25f,0.0f);
        bone.setTextureOffset(0,0).addBox(0, -4.0f, -32.0f, -4.0f, 8,8,8,0.25f,0.0f);
        bone.setTextureOffset(0,0).addBox(0, -4.0f, -32.0f, -4.0f, 8,8,8,0.0f,0.0f);

    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bone.render(matrixStackIn, bufferIn,packedLightIn,packedOverlayIn, red, green, blue, alpha);
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
    public ModelRenderer getBone(){
        return bone;
    }
}