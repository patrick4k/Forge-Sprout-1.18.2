package com.chito.sproutmod.item;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.item.custom.MooshaxeItem;
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
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new SnowballItem(new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(16)));

    public static final RegistryObject<Item> MOOSHAXE = ITEMS.register("mooshaxe",
            () -> new MooshaxeItem(Tiers.NETHERITE, 1, 1,
                    new Item.Properties().tab(ModCreativeModeTab.SPROUT_TAB).stacksTo(1).durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
