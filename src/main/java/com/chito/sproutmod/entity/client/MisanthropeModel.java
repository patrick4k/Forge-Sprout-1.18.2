package com.chito.sproutmod.entity.client;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.entity.custom.MisanthropeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MisanthropeModel extends AnimatedGeoModel<MisanthropeEntity> {
    @Override
    public ResourceLocation getModelLocation(MisanthropeEntity object) {
        return new ResourceLocation(SproutMod.MOD_ID, "geo/misanthrope.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MisanthropeEntity object) {
        return new ResourceLocation(SproutMod.MOD_ID, "textures/entity/misanthrope/misanthrope.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MisanthropeEntity animatable) {
        return new ResourceLocation(SproutMod.MOD_ID, "animations/misanthrope.animation.json");
    }
}
