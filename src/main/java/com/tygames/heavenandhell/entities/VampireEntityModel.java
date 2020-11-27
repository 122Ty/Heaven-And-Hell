package com.tygames.heavenandhell.entities;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;


    public class VampireEntityModel<T extends Vampire> extends EntityModel<T> {
        private final ModelRenderer bone;
        private final ModelRenderer Head;
        private final ModelRenderer Body;
        private final ModelRenderer RightArm;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightLeg;
        private final ModelRenderer LeftLeg;

        public VampireEntityModel() {
            textureWidth = 64;
            textureHeight = 64;

            bone = new ModelRenderer(this);
            bone.setRotationPoint(0.0F, 24.0F, 0.0F);
            bone.setTextureOffset(0, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
            bone.setTextureOffset(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
            bone.setTextureOffset(16, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
            bone.setTextureOffset(16, 32).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
            bone.setTextureOffset(40, 16).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            bone.setTextureOffset(40, 32).addBox(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
            bone.setTextureOffset(32, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            bone.setTextureOffset(48, 48).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
            bone.setTextureOffset(0, 16).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            bone.setTextureOffset(0, 32).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
            bone.setTextureOffset(16, 48).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            bone.setTextureOffset(0, 48).addBox(-0.1F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

            Head = new ModelRenderer(this);
            Head.setRotationPoint(0.0F, 0.0F, 0.0F);
            setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);


            Body = new ModelRenderer(this);
            Body.setRotationPoint(0.0F, 0.0F, 0.0F);


            RightArm = new ModelRenderer(this);
            RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
            setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);


            LeftArm = new ModelRenderer(this);
            LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
            setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);


            RightLeg = new ModelRenderer(this);
            RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
            setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);


            LeftLeg = new ModelRenderer(this);
            LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
            setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);

        }

        @Override
        public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            bone.render(matrixStack, buffer, packedLight, packedOverlay);
            Head.render(matrixStack, buffer, packedLight, packedOverlay);
            Body.render(matrixStack, buffer, packedLight, packedOverlay);
            RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
            LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
            RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }
