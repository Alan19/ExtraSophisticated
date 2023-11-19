package com.alan19.extrasophisticated.data;

import net.minecraft.world.level.block.Block;

public record SophisticatedStorageTierRecord(
        Block chestItem,
        Block barrelItem,
        Block limitedBarrel1,
        Block limitedBarrel2,
        Block limitedBarrel3,
        Block limitedBarrel4,
        Block shulkerBoxItem
) implements IStorageTier{
    public Block[] getBlocksInTier() {
        return new Block[]{chestItem, barrelItem, limitedBarrel1, limitedBarrel2, limitedBarrel3, limitedBarrel4, shulkerBoxItem};
    }
}
