package com.chito.sproutmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    // TODO Check client if ingots repair tools
    public static final ForgeTier SPORESTEEL = new ForgeTier(4, 4062, 9.0F,
            5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.SPORESTEEL_INGOT.get()));
}
