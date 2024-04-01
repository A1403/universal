package net.albert1403.universal;

import com.mojang.logging.LogUtils;
import net.albert1403.universal.block.DungeonBlocks;
import net.albert1403.universal.items.EarthItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
        DungeonBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(DungeonBlocks.cacti_grass.getId(),DungeonBlocks.potted_cacti_grass);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(DungeonBlocks.flowering_short_cacti.getId(),DungeonBlocks.potted_flowering_short_cacti);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(DungeonBlocks.short_cacti.getId(),DungeonBlocks.potted_short_cacti);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(DungeonBlocks.short_grass.getId(),DungeonBlocks.potted_short_grass);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(DungeonBlocks.rod_cacti.getId(),DungeonBlocks.potted_rod_cacti);
        });
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

    }
}

