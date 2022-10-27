package net.jorgev96.jroleitems.block;

import net.jorgev96.jroleitems.JRoleItems;
import net.jorgev96.jroleitems.item.ModCreativeModeTab;
import net.jorgev96.jroleitems.item.ModItems;
import net.jorgev96.jroleitems.block.custom.ModFlammableRotatedPillarBlock;
import net.jorgev96.jroleitems.world.feature.tree.AncestralTreeBlueGrower;
import net.jorgev96.jroleitems.world.feature.tree.AncestralTreeOrangeGrower;
import net.jorgev96.jroleitems.world.feature.tree.AncestralTreePurpleGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ORANGE_TILE_BLOCK = registerBlock("orange_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> MAGENTA_TILE_BLOCK = registerBlock("magenta_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> LIGHTBLUE_TILE_BLOCK = registerBlock("lightblue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> YELLOW_TILE_BLOCK = registerBlock("yellow_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> LIME_TILE_BLOCK = registerBlock("lime_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> PINK_TILE_BLOCK = registerBlock("pink_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> GRAY_TILE_BLOCK = registerBlock("gray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> LIGHTGRAY_TILE_BLOCK = registerBlock("lightgray_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> CYAN_TILE_BLOCK = registerBlock("cyan_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> PURPLE_TILE_BLOCK = registerBlock("purple_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> BLUE_TILE_BLOCK = registerBlock("blue_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> BROWN_TILE_BLOCK = registerBlock("brown_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> GREEN_TILE_BLOCK = registerBlock("green_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> RED_TILE_BLOCK = registerBlock("red_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> BLACK_TILE_BLOCK = registerBlock("black_tile_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> PURPUMETRINE_BLOCK = registerBlock("purpumetrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> RAW_PURPUMETRINE_BLOCK = registerBlock("raw_purpumetrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> PURPUMETRINE_ORE = registerBlock("purpumetrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PURPUMETRINE_ORE = registerBlock("deepslate_purpumetrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LOG_BLUE = registerBlock("ancestral_log_blue",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WOOD_BLUE = registerBlock("ancestral_wood_blue",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_LOG_BLUE = registerBlock("stripped_ancestral_log_blue",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_WOOD_BLUE = registerBlock("stripped_ancestral_wood_blue",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PLANKS_BLUE = registerBlock("ancestral_planks_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SAPLING_BLUE = registerBlock("ancestral_sapling_blue",
            () -> new SaplingBlock(new AncestralTreeBlueGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LEAVES_BLUE = registerBlock("ancestral_leaves_blue",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LOG_ORANGE = registerBlock("ancestral_log_orange",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WOOD_ORANGE = registerBlock("ancestral_wood_orange",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_LOG_ORANGE = registerBlock("stripped_ancestral_log_orange",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_WOOD_ORANGE = registerBlock("stripped_ancestral_wood_orange",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PLANKS_ORANGE = registerBlock("ancestral_planks_orange",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SAPLING_ORANGE = registerBlock("ancestral_sapling_orange",
            () -> new SaplingBlock(new AncestralTreeOrangeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LEAVES_ORANGE = registerBlock("ancestral_leaves_orange",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LOG_PURPLE = registerBlock("ancestral_log_purple",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WOOD_PURPLE = registerBlock("ancestral_wood_purple",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_LOG_PURPLE = registerBlock("stripped_ancestral_log_purple",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_ANCESTRAL_WOOD_PURPLE = registerBlock("stripped_ancestral_wood_purple",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PLANKS_PURPLE = registerBlock("ancestral_planks_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.JORGE_ROLE_BLOCKS_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SAPLING_PURPLE = registerBlock("ancestral_sapling_purple",
            () -> new SaplingBlock(new AncestralTreePurpleGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_LEAVES_PURPLE = registerBlock("ancestral_leaves_purple",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_STAIRS_BLUE = registerBlock("ancestral_stairs_blue",
            () -> new StairBlock(() -> ModBlocks.ANCESTRAL_PLANKS_BLUE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SLAB_BLUE = registerBlock("ancestral_slab_blue",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_BLUE = registerBlock("ancestral_fence_blue",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_GATE_BLUE = registerBlock("ancestral_fence_gate_blue",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WALL_BLUE = registerBlock("ancestral_wall_blue",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_BUTTON_BLUE = registerBlock("ancestral_button_blue",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noCollission()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PRESSURE_PLATE_BLUE = registerBlock("ancestral_pressure_plate_blue",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_DOOR_BLUE = registerBlock("ancestral_door_blue",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_TRAPDOOR_BLUE = registerBlock("ancestral_trapdoor_blue",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_STAIRS_ORANGE = registerBlock("ancestral_stairs_orange",
            () -> new StairBlock(() -> ModBlocks.ANCESTRAL_PLANKS_ORANGE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SLAB_ORANGE = registerBlock("ancestral_slab_orange",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_ORANGE = registerBlock("ancestral_fence_orange",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_GATE_ORANGE = registerBlock("ancestral_fence_gate_orange",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WALL_ORANGE = registerBlock("ancestral_wall_orange",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_BUTTON_ORANGE = registerBlock("ancestral_button_orange",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noCollission()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PRESSURE_ORANGE = registerBlock("ancestral_pressure_plate_orange",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_DOOR_ORANGE = registerBlock("ancestral_door_orange",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_TRAPDOOR_ORANGE = registerBlock("ancestral_trapdoor_orange",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_STAIRS_PURPLE = registerBlock("ancestral_stairs_purple",
            () -> new StairBlock(() -> ModBlocks.ANCESTRAL_PLANKS_PURPLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_SLAB_PURPLE = registerBlock("ancestral_slab_purple",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_PURPLE = registerBlock("ancestral_fence_purple",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_FENCE_GATE_PURPLE = registerBlock("ancestral_fence_gate_purple",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_WALL_PURPLE = registerBlock("ancestral_wall_purple",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_BUTTON_PURPLE = registerBlock("ancestral_button_purple",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noCollission()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_PRESSURE_PURPLE = registerBlock("ancestral_pressure_plate_purple",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_DOOR_PURPLE = registerBlock("ancestral_door_purple",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

    public static final RegistryObject<Block> ANCESTRAL_TRAPDOOR_PURPLE = registerBlock("ancestral_trapdoor_purple",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.JORGE_ROLE_DECORATIVE_TAB);

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
