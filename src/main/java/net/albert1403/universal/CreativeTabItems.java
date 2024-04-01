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
            }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            /*event.accept(DungeonBlocks.mossy_andesite);
            */
        }
    }
}
