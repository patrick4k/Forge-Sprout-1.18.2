package com.chito.sproutmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    // TODO balance ore generation and rarity
    // TODO add biome specific generation
    public static final Holder<PlacedFeature> SPORESTEEL_ORE_PLACED = PlacementUtils.register("sporesteel_ore_placed",
            ModConfiguredFeatures.SPORESTEEL_ORE, ModOrePlacement.commonOrePlacement(9,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom( -80),VerticalAnchor.aboveBottom(300))));
}
