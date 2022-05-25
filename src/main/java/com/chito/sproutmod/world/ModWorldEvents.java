package com.chito.sproutmod.world;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.world.gen.ModEntityGeneration;
import com.chito.sproutmod.world.gen.ModOreGeneration;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = SproutMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModEntityGeneration.onEntitySpawn(event);
    }
}
