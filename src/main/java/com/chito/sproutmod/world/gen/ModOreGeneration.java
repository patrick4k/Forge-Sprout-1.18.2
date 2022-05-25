package com.chito.sproutmod.world.gen;

import com.chito.sproutmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        // Gem generation
        if ((event.getCategory() == Biome.BiomeCategory.MOUNTAIN)) {
            base.add(ModPlacedFeatures.MOONSTONE_ORE_PLACED);
        }
        // Sporesteel generation
        if (event.getCategory() == Biome.BiomeCategory.MUSHROOM) {
            base.add(ModPlacedFeatures.SPORESTEEL_ORE_PLACED_MUSHROOM_BIOME);
        }
        else base.add(ModPlacedFeatures.SPORESTEEL_ORE_PLACED);
    }
}
