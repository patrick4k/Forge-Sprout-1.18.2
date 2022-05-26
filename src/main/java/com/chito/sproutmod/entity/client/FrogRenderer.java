package com.chito.sproutmod.entity.client;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.entity.custom.FrogEntity;
import com.chito.sproutmod.entity.custom.MisanthropeEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FrogRenderer extends GeoEntityRenderer<FrogEntity> {
    public FrogRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FrogModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(FrogEntity instance) {
        return new ResourceLocation(SproutMod.MOD_ID, "textures/entity/frog/frog.png");
    }

    @Override
    public RenderType getRenderType(FrogEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
