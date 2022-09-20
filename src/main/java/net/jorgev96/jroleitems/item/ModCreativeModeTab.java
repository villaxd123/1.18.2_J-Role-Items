package net.jorgev96.jroleitems.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JORGE_ROLE_ITEMS_TAB = new CreativeModeTab("jroleitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DIAMOND_COIN.get());
        }
    };
}
