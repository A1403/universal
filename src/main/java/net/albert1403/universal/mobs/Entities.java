package net.albert1403.universal.mobs;

import net.albert1403.universal.Universal;
import net.albert1403.universal.mobs.earth.DriedMuddyPig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Entities {

    private Entities(){}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Universal.MOD_ID);

    public static final RegistryObject<EntityType<DriedMuddyPig>> DRIED_MUDDY_PIG = ENTITIES.register("dried_muddy_pig",
            () -> EntityType.Builder.of(DriedMuddyPig::new, MobCategory.CREATURE).sized(0.9f,0.9f)
                    .build(new ResourceLocation(Universal.MOD_ID, "dried_muddy_pig").toString()));
}