package com.tygames.heavenandhell.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class HolyCowEntityModel<T extends HolyCow> extends EntityModel<T>{
    private final ModelRenderer bone2;
    private final ModelRenderer body;
    private final ModelRenderer rotation;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer leg4;
    private final ModelRenderer head;

    public HolyCowEntityModel() {
        textureWidth = 64;
        textureHeight = 32;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 5.0F, 2.0F);


        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone2.addChild(body);


        rotation = new ModelRenderer(this);
        rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(rotation);
        setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
        rotation.setTextureOffset(18,18).addBox(4,-6.0f,-10.0f,-7.0f,12,18,10,0.0f, 0.0f);
        rotation.setTextureOffset(52,52).addBox(0,-3.0f,2.0f,-8.0f,4,6,1,0.0f, 0.0f);

                leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(4.0F, 7.0F, 5.0F);
        bone2.addChild(leg1);
        leg1.setTextureOffset(0,0).addBox(16,-2.0f,0.0f,-2.0f,4,12,4,0.0f,0.0f);

                leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-4.0F, 7.0F, 5.0F);
        bone2.addChild(leg2);
        leg2.setTextureOffset(0,0).addBox(16,-2.0f,0.0f,-2.0f,4,12,4,0.0f,0.0f);


        leg3 = new ModelRenderer(this);
        leg3.setRotationPoint(4.0F, 7.0F, -8.0F);
        bone2.addChild(leg3);
        leg3.setTextureOffset(0,0).addBox(16,-2.0f,0.0f,-1.0f,4,12,4,0.0f,0.0f);


        leg4 = new ModelRenderer(this);
        leg4.setRotationPoint(-4.0F, 7.0F, -8.0F);
        bone2.addChild(leg4);
        leg1.setTextureOffset(0,0).addBox(16,-2.0f,0.0f,-1.0f,4,12,4,0.0f,0.0f);


        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -1.0F, -10.0F);
        bone2.addChild(head);
        head.setTextureOffset(0,0).addBox(0,-4.0f,0-4.0f,-6.0f,8,8,6,0.0f,0.0f);
        head.setTextureOffset(22,22).addBox(28,4.0f,-5.0f,-4.0f,1,3,1,0.0f,0.0f);
        head.setTextureOffset(0,0).addBox(28,-5.0f,-5.0f,-4.0f,1,3,1,0.0f,0.0f);

    }
    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bone2.render(matrixStackIn, bufferIn,packedLightIn,packedOverlayIn, red, green, blue, alpha);
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

    public ModelRenderer getBone2(){
        return bone2;
    }
    public ModelRenderer getBody(){
        return body;
    }

    public ModelRenderer getRotation() {
        return rotation;
    }

    public ModelRenderer getLeg1() {
        return leg1;
    }

    public ModelRenderer getLeg2() {
        return leg2;
    }

    public ModelRenderer getLeg3() {
        return leg3;
    }

    public ModelRenderer getLeg4() {
        return leg4;
    }

    public ModelRenderer getHead() {
        return head;
    }
}
