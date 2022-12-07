package net.albert1403.universal.block;

import net.albert1403.universal.Universal;
import net.albert1403.universal.items.EarthItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class EarthBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Universal.MOD_ID);

    public static final RegistryObject<Block> RAINBOW_WOOL = registerBlock("rainbow_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUTTERCUP = registerBlock("buttercup",
            () -> new FlowerBlock(MobEffects.LUCK, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()),CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> RAINBOW_CARPET = registerBlock("rainbow_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.RED_CARPET).noOcclusion()),CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> POTTED_BUTTERCUP = registerBlockWithoutBlockItem("potted_buttercup",
            () -> new FlowerPotBlock(null, EarthBlocks.BUTTERCUP,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
        }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return EarthItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}