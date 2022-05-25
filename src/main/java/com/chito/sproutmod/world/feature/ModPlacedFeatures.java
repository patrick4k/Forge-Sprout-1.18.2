package com.chito.sproutmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    // SPORESTEEL
    /*
    for all biomes except mushroom, 2 veins per chunk, in mushroom biomes there are 9 veins
    most abundant at y = 5, does not generate above 64 or below -54
     */
    public static final Holder<PlacedFeature> SPORESTEEL_ORE_PLACED = PlacementUtils.register("sporesteel_ore_placed",
            ModConfiguredFeatures.SPORESTEEL_ORE, ModOrePlacement.commonOrePlacement(2, // <- viens per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-54),VerticalAnchor.aboveBottom(64))));
    public static final Holder<PlacedFeature> SPORESTEEL_ORE_PLACED_MUSHROOM_BIOME = PlacementUtils.register("sporesteel_ore_placed_mushroom_biome",
            ModConfiguredFeatures.SPORESTEEL_ORE, ModOrePlacement.commonOrePlacement(9, // <- viens per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-54),VerticalAnchor.aboveBottom(64))));

    // MOONSTONE
    /*
    most abundant at y = 200, does not generate above 400 or below 0
     */
    public static final Holder<PlacedFeature> MOONSTONE_ORE_PLACED = PlacementUtils.register("moonstone_ore_placed",
            ModConfiguredFeatures.MOONSTONE_ORE, ModOrePlacement.commonOrePlacement(12, // <- viens per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0),VerticalAnchor.aboveBottom(400))));

}
