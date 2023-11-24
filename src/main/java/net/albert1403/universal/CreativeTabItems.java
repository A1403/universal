package net.albert1403.universal;

import net.albert1403.universal.block.DungeonBlocks;
import net.albert1403.universal.items.EarthItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Universal.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class CreativeTabItems {

    @SubscribeEvent

    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(DungeonBlocks.stone_path);
            event.accept(DungeonBlocks.encarved_stone);
            event.accept(DungeonBlocks.dirty_stonefloor);
            event.accept(DungeonBlocks.dirty_cobblestone);
            event.accept(DungeonBlocks.chiseled_stone);
            event.accept(DungeonBlocks.empty_bookshelf);
            event.accept(DungeonBlocks.encarved_stone_bricks);
            event.accept(DungeonBlocks.mossy_carved_stone_bricks);
            event.accept(DungeonBlocks.mossy_cracked_stone_bricks);
            event.accept(DungeonBlocks.mossy_smooth_andesite);
            event.accept(DungeonBlocks.old_bookshelf);
            event.accept(DungeonBlocks.rotten_planks);
            event.accept(DungeonBlocks.stone_pillar);
            event.accept(DungeonBlocks.charred_dirt);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(DungeonBlocks.spider_egg);
            event.accept(DungeonBlocks.mossy_stone);
            event.accept(DungeonBlocks.mossy_dirt);
            event.accept(DungeonBlocks.egg_growth);
            event.accept(DungeonBlocks.mossy_coarse_dirt);
            event.accept(DungeonBlocks.mossy_andesite);
            event.accept(DungeonBlocks.withered_plant);
        }
    }
}
