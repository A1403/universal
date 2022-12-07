package net.albert1403.universal;

import com.mojang.logging.LogUtils;
import net.albert1403.universal.block.EarthBlocks;
import net.albert1403.universal.block.StoryModeBlocks;
import net.albert1403.universal.items.EarthItems;
import net.albert1403.universal.items.StoryModeItems;
import net.albert1403.universal.mobs.Entities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.PigRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(Universal.MOD_ID)
public class Universal
{
    public static final String MOD_ID = "universal";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Universal()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EarthItems.register(modEventBus);
        StoryModeItems.register(modEventBus);
        EarthBlocks.register(modEventBus);
        StoryModeBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EarthBlocks.BUTTERCUP.getId(), EarthBlocks.POTTED_BUTTERCUP);
        });
        }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(EarthBlocks.BUTTERCUP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(EarthBlocks.POTTED_BUTTERCUP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(EarthBlocks.RAINBOW_CARPET.get(), RenderType.cutout());

        }
        @SubscribeEvent
        public static void entityRenderer(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(Entities.DRIED_MUDDY_PIG.get(), new PigRenderer());
        }
    }
}

