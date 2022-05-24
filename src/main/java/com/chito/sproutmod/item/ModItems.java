package com.chito.sproutmod.item;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.item.custom.SporesteelAxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Deferred Register is a list of your items that you create
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SproutMod.MOD_ID);

    // Add items here
    // ROCK
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new SnowballItem(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(16)));

    // SPORESTEEL
    public static final RegistryObject<Item> RAW_SPORESTEEL = ITEMS.register("raw_sporesteel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SPORESTEEL_INGOT = ITEMS.register("sporesteel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));


    // MOOSH ITEMS
    // TODO change to Sporesteel axe
    public static final RegistryObject<Item> MOOSHAXE = ITEMS.register("mooshaxe",
            () -> new SporesteelAxeItem(Tiers.NETHERITE, 1, 1,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
