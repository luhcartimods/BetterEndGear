package net.luhcarti.betterendgear.util;

import net.luhcarti.betterendgear.BetterEndGear;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ENDER_TOOL = tag("needs_ender_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BetterEndGear.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BetterEndGear.MOD_ID, name));
        }
    }
}
