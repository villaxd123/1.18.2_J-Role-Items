package net.jorgev96.jroleitems.item;

import net.jorgev96.jroleitems.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JORGE_ROLE_ITEMS_TAB = new CreativeModeTab("jroleitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DIAMOND_COIN.get());
        }
    };

    public static final CreativeModeTab JORGE_ROLE_BLOCKS_TAB = new CreativeModeTab("jroleblockstab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModBlocks.PURPUMETRINE_BLOCK.get()); }
    };

    public static final CreativeModeTab JORGE_ROLE_DECORATIVE_TAB = new CreativeModeTab("jroledecorativetab") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ModBlocks.ANCESTRAL_STAIRS_BLUE.get()); }
    };
}
