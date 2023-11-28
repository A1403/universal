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
                    .strength(0.5f)));
    public static final RegistryObject<Block> withered_plant = registerBlock("withered_plant",
            () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)
                    .noOcclusion().noCollission().requiresCorrectToolForDrops()));

    //Modelle
    public static final RegistryObject<Block> charred_planks = registerBlock("charred_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(1f)));
    public static final RegistryObject<Block> cracked_stone = registerBlock("cracked_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> overgrown_stonebricks = registerBlock("overgrown_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> rotten_pumpkin = registerBlock("rotten_pumpkin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)
                    .strength(1f)));
    public static final RegistryObject<Block> cacti_grass = registerBlock("cacti_grass",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> potted_cacti_grass = BLOCKS.register("potted_cacti_grass.json",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), DungeonBlocks.cacti_grass,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> flowering_short_cacti = registerBlock("flowering_short_cacti",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> potted_flowering_short_cacti = BLOCKS.register("potted_flowering_short_cacti",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), DungeonBlocks.flowering_short_cacti,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> short_cacti = registerBlock("short_cacti",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> potted_short_cacti = BLOCKS.register("potted_short_cacti",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), DungeonBlocks.short_cacti,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> short_grass = registerBlock("short_grass",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> potted_short_grass = BLOCKS.register("potted_short_grass",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), DungeonBlocks.short_grass,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> rod_cacti = registerBlock("rod_cacti",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> potted_rod_cacti = BLOCKS.register("potted_rod_cacti",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), DungeonBlocks.rod_cacti,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> dirty_stonebricks = registerBlock("dirty_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> dirty_carved_stonebricks = registerBlock("dirty_carved_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ornament_stonebricks = registerBlock("ornament_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> sandy_cracked_stonebricks = registerBlock("sandy_cracked_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> sandy_carved_stonebricks = registerBlock("sandy_carved_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> sandy_stonebricks = registerBlock("sandy_stonebricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> sandy_dirt = registerBlock("sandy_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)
                    .strength(0.5f)));
    public static final RegistryObject<Block> mossy_terracotta = registerBlock("mossy_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> canyon_terracotta = registerBlock("canyon_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> canyon_terracotta_brown = registerBlock("canyon_terracotta_brown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_cyan = registerBlock("canyon_terracotta_cyan",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> canyon_terracotta_gray = registerBlock("canyon_terracotta_gray",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_green = registerBlock("canyon_terracotta_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_light_blue = registerBlock("canyon_terracotta_light_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_lime = registerBlock("canyon_terracotta_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_orange = registerBlock("canyon_terracotta_orange",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_pink = registerBlock("canyon_terracotta_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_purple = registerBlock("canyon_terracotta_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_red = registerBlock("canyon_terracotta_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_white = registerBlock("canyon_terracotta_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> canyon_terracotta_yellow = registerBlock("canyon_terracotta_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)
                    .strength(1.25f).requiresCorrectToolForDrops()));












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


