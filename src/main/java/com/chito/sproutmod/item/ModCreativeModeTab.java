package com.chito.sproutmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab SPROUT_TAB = new CreativeModeTab("sprout_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.RED_MUSHROOM);
        }
    };
}
