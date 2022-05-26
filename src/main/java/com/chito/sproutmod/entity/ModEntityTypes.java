package com.chito.sproutmod.entity;

import com.chito.sproutmod.SproutMod;
import com.chito.sproutmod.entity.custom.FrogEntity;
import com.chito.sproutmod.entity.custom.MisanthropeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITIES, SproutMod.MOD_ID);

    // MISANTHROPE
    public static final RegistryObject<EntityType<MisanthropeEntity>> MISANTHROPE =
            ENTITY_TYPE.register("misanthrope",
            () -> EntityType.Builder.of(MisanthropeEntity::new, MobCategory.MONSTER)
                    .sized(0.5f, 4.0f)
                    .build(new ResourceLocation(SproutMod.MOD_ID, "misanthrope").toString()));

    // FROG
    public static final RegistryObject<EntityType<FrogEntity>> FROG =
            ENTITY_TYPE.register("frog",
                    () -> EntityType.Builder.of(FrogEntity::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(SproutMod.MOD_ID, "frog").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPE.register((eventBus));
    }

}
