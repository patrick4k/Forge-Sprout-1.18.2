package com.chito.sproutmod.item;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.item.custom.*;
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

    // SPORESTEEL ITEMS
    // TODO Balance modifiers
    public static final RegistryObject<Item> SPORESTEEL_SWORD = ITEMS.register("sporesteel_sword",
            () -> new SporesteelSwordItem(ModTiers.SPORESTEEL, 3, -1.5F,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));
    public static final RegistryObject<Item> SPORESTEEL_SHOVEL= ITEMS.register("sporesteel_shovel",
            () -> new SporesteelShovelItem(ModTiers.SPORESTEEL, 1.5F, -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));
    public static final RegistryObject<Item> SPORESTEEL_PICKAXE = ITEMS.register("sporesteel_pickaxe",
            () -> new SporesteelPickaxeItem(ModTiers.SPORESTEEL, 1, -2.5F,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));
    public static final RegistryObject<Item> SPORESTEEL_AXE = ITEMS.register("sporesteel_axe",
            () -> new SporesteelAxeItem(ModTiers.SPORESTEEL, 6.0F, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));
    public static final RegistryObject<Item> SPORESTEEL_HOE = ITEMS.register("sporesteel_hoe",
            () -> new SporesteelHoeItem(ModTiers.SPORESTEEL, 3, -2.5F,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));

    // GEMS
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    public static final RegistryObject<Item> UNCUT_MOONSTONE = ITEMS.register("uncut_moonstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    public static final RegistryObject<Item> LIFE_EMERALD = ITEMS.register("life_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    // TODO add uncut textures
    public static final RegistryObject<Item> UNCUT_LIFE_EMERALD = ITEMS.register("uncut_life_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    public static final RegistryObject<Item> LOVE_VESSEL = ITEMS.register("love_vessel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));
    // TODO add uncut textures
    public static final RegistryObject<Item> UNCUT_LOVE_VESSEL = ITEMS.register("uncut_love_vessel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
