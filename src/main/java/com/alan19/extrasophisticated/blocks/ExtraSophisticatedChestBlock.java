package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlockEntity;
import net.p3pp3rf1y.sophisticatedstorage.block.StorageBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ExtraSophisticatedChestBlock extends ChestBlock {
    public ExtraSophisticatedChestBlock(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier);
    }

    public ExtraSophisticatedChestBlock(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier, float explosionResistance) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier, explosionResistance);
    }

    @Nullable
    @Override
    public ChestBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get().create(pos, state);
    }

    @Override
    protected BlockEntityType<? extends StorageBlockEntity> getBlockEntityType() {
        return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get();
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return level.isClientSide ? createTickerHelper(blockEntityType, (BlockEntityType) ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get(), (l, p, s, be) -> ExtraSophisticatedChestBlockEntity.lidAnimateTick2((ExtraSophisticatedChestBlockEntity) be)) : super.getTicker(level, state, blockEntityType);
    }
}
