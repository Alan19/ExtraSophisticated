package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import com.alan19.extrasophisticated.blocks.StorageTier;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.data.CopyStorageDataFunction;

public class ExtraSophisticatedBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        add(ExtraSophisticatedBlocks.COPPER);
    }

    private void add(StorageTier tier) {
        for (Block block : tier.getBlocksInTier()) {
            add(block, getStorage(block.asItem()));
        }
    }

    private static LootTable.Builder getStorage(Item storageItem) {
        LootPoolEntryContainer.Builder<?> entry = LootItem.lootTableItem(storageItem);
        LootPool.Builder pool = LootPool.lootPool().name("main").setRolls(ConstantValue.exactly(1)).add(entry)
                .apply(CopyNameFunction.copyName(CopyNameFunction.NameSource.BLOCK_ENTITY))
                .apply(CopyStorageDataFunction.builder());
        return LootTable.lootTable().withPool(pool);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ExtraSophisticatedBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
    }
}
