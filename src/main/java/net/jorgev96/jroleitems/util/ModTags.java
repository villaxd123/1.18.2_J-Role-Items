package net.jorgev96.jroleitems.util;

import net.jorgev96.jroleitems.JRoleItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_STORAGE = forgeTag("chests/ancient_storage");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(JRoleItems.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PURPUMETRINE_GEMS = forgeTag("gems/purpumetrine");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(JRoleItems.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
