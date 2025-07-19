package com.bb8nr2d2.liquidslib.util;

import com.bb8nr2d2.liquidslib.LiquidsLib;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(LiquidsLib.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ROCKS = createTag("rocks");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(LiquidsLib.MODID, name));
        }
    }
}
