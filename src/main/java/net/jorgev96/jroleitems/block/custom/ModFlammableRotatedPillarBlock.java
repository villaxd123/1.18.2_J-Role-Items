package net.jorgev96.jroleitems.block.custom;

import net.jorgev96.jroleitems.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState (BlockState state,
                                            UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModBlocks.ANCESTRAL_LOG_BLUE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_LOG_BLUE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ANCESTRAL_WOOD_BLUE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_WOOD_BLUE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ANCESTRAL_LOG_ORANGE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_LOG_ORANGE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ANCESTRAL_WOOD_ORANGE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_WOOD_ORANGE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ANCESTRAL_LOG_PURPLE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_LOG_PURPLE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.ANCESTRAL_WOOD_PURPLE.get())) {
                return ModBlocks.STRIPPED_ANCESTRAL_WOOD_PURPLE.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
