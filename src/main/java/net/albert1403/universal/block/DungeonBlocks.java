package net.albert1403.universal.block;

import net.albert1403.universal.Universal;
import net.albert1403.universal.items.EarthItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class DungeonBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Universal.MOD_ID);

    public static final RegistryObject<Block> chiseled_stone = registerBlock("chiseled_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> dirty_cobblestone = registerBlock("dirty_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> dirty_stonefloor = registerBlock("dirty_stonefloor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> egg_growth = registerBlock("egg_growth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SCULK)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> spider_egg = registerBlock("spider_egg",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNIFFER_EGG)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> empty_bookshelf = registerBlock("empty_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)
                    .strength(1.5f)));
    public static final RegistryObject<Block> encarved_stone_bricks = registerBlock("encarved_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> encarved_stone = registerBlock("encarved_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> mossy_andesite = registerBlock("mossy_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> mossy_carved_stone_bricks = registerBlock("mossy_carved_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> mossy_coarse_dirt = registerBlock("mossy_coarse_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)));
    public static final RegistryObject<Block> mossy_cracked_stone_bricks = registerBlock("mossy_cracked_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> mossy_dirt = registerBlock("mossy_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)
                    .strength(6f)));
    public static final RegistryObject<Block> mossy_smooth_andesite = registerBlock("mossy_smooth_andesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> mossy_stone = registerBlock("mossy_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> stone_pillar = registerBlock("stone_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> old_bookshelf = registerBlock("old_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)
                    .strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> rotten_planks = registerBlock("rotten_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1f)));
    public static final RegistryObject<Block> stone_path = registerBlock("stone_path",
            () -> new StonePath(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.STONE)));
    public static final RegistryObject<Block> charred_dirt = registerBlock("charred_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)
                    .strength(6f)));
    public static final RegistryObject<Block> withered_plant = registerBlock("withered_plant",
            () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)
                    .noOcclusion().noCollission().requiresCorrectToolForDrops()));

    //Modelle + Inventar
    public static final RegistryObject<Block> charred_planks = registerBlock("charred_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1f)));
    public static final RegistryObject<Block> cracked_stone = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> overgrown_stone_bricks = registerBlock("overgrown_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> rotten_pumpkin = registerBlock("rotten_pumpkin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)
                    .strength(1f)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return EarthItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}