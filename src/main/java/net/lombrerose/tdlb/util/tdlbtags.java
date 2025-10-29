package net.lombrerose.tdlb.util;

import net.lombrerose.tdlb.TaDaronneLaB;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class tdlbtags {
    public static class Blocks{
        private static TagKey<Block> createTag (String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TaDaronneLaB.MOD_ID, name));
        }
    }
}
