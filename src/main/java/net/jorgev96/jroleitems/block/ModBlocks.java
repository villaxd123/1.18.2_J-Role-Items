package net.jorgev96.jroleitems.block;

import net.jorgev96.jroleitems.JRoleItems;
import net.jorgev96.jroleitems.item.ModCreativeModeTab;
import net.jorgev96.jroleitems.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JRoleItems.MOD_ID);

    public static final RegistryObject<Block> WHITE_TILE_BLOCK = registerblock("white_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> ORANGE_TILE_BLOCK = registerblock("orange_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> MAGENTA_TILE_BLOCK = registerblock("magenta_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIGHTBLUE_TILE_BLOCK = registerblock("lightblue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> YELLOW_TILE_BLOCK = registerblock("yellow_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIME_TILE_BLOCK = registerblock("lime_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PINK_TILE_BLOCK = registerblock("pink_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> GRAY_TILE_BLOCK = registerblock("gray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIGHTGRAY_TILE_BLOCK = registerblock("lightgray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> CYAN_TILE_BLOCK = registerblock("cyan_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PURPLE_TILE_BLOCK = registerblock("purple_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BLUE_TILE_BLOCK = registerblock("blue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BROWN_TILE_BLOCK = registerblock("brown_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> GREEN_TILE_BLOCK = registerblock("green_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> RED_TILE_BLOCK = registerblock("red_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BLACK_TILE_BLOCK = registerblock("black_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    private static <T extends Block> RegistryObject<T> registerblock(String name,
                                                                     Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
