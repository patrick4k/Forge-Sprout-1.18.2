package com.chito.sproutmod.entity.client;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.entity.custom.FrogEntity;
import com.chito.sproutmod.entity.custom.MisanthropeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FrogModel extends AnimatedGeoModel<FrogEntity> {
    @Override
    public ResourceLocation getModelLocation(FrogEntity object) {
        return new ResourceLocation(SproutMod.MOD_ID, "geo/frog.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FrogEntity object) {
        return new ResourceLocation(SproutMod.MOD_ID, "textures/entity/misanthrope/frog.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FrogEntity animatable) {
        return new ResourceLocation(SproutMod.MOD_ID, "animations/frog.animation.json");
    }
}
