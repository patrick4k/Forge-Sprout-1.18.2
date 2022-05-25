package com.chito.sproutmod.world.feature;

import com.chito.sproutmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    // SPORESTEEL
    public static final List<OreConfiguration.TargetBlockState> SPORESTEEL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SPORESTEEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SPORESTEEL_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SPORESTEEL_ORE = FeatureUtils.register("sporesteel_ore",
            Feature.ORE, new OreConfiguration(SPORESTEEL_ORES, 9)); // pSize = vien size // vien size must be >= 2 or 3

    // MOONSTONE
    public static final List<OreConfiguration.TargetBlockState> MOONSTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOONSTONE_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOONSTONE_ORE = FeatureUtils.register("moonstone_ore",
            Feature.ORE, new OreConfiguration(MOONSTONE_ORES, 9)); // pSize = vien size // vien size must be >= 2 or 3

}
