package net.jorgev96.jroleitems.block;

import net.jorgev96.jroleitems.JRoleItems;
import net.jorgev96.jroleitems.item.ModCreativeModeTab;
import net.jorgev96.jroleitems.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JRoleItems.MOD_ID);

    public static final RegistryObject<Block> WHITE_TILE_BLOCK = registerBlock("white_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> ORANGE_TILE_BLOCK = registerBlock("orange_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> MAGENTA_TILE_BLOCK = registerBlock("magenta_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIGHTBLUE_TILE_BLOCK = registerBlock("lightblue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> YELLOW_TILE_BLOCK = registerBlock("yellow_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIME_TILE_BLOCK = registerBlock("lime_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PINK_TILE_BLOCK = registerBlock("pink_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> GRAY_TILE_BLOCK = registerBlock("gray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> LIGHTGRAY_TILE_BLOCK = registerBlock("lightgray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> CYAN_TILE_BLOCK = registerBlock("cyan_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PURPLE_TILE_BLOCK = registerBlock("purple_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BLUE_TILE_BLOCK = registerBlock("blue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BROWN_TILE_BLOCK = registerBlock("brown_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> GREEN_TILE_BLOCK = registerBlock("green_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> RED_TILE_BLOCK = registerBlock("red_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> BLACK_TILE_BLOCK = registerBlock("black_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PURPUMETRINE_BLOCK = registerBlock("purpumetrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> RAW_PURPUMETRINE_BLOCK = registerBlock("raw_purpumetrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> PURPUMETRINE_ORE = registerBlock("purpumetrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PURPUMETRINE_ORE = registerBlock("deepslate_purpumetrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name,
                                                                     Supplier<T> block,
                                                                     CreativeModeTab tab,
                                                                     String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab,
                                                                            String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name,
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
