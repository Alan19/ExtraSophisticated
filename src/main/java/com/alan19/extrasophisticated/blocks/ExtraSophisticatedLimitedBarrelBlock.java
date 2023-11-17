package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.LimitedBarrelBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.StorageBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ExtraSophisticatedLimitedBarrelBlock extends LimitedBarrelBlock {
    public ExtraSophisticatedLimitedBarrelBlock(int numberOfInventorySlots, Supplier<Integer> getBaseStackSizeMultiplier, Supplier<Integer> numberOfUpgradeSlotsSupplier, Properties properties) {
        super(numberOfInventorySlots, getBaseStackSizeMultiplier, numberOfUpgradeSlotsSupplier, properties);
    }

    @Nullable
    @Override
    public StorageBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY.get().create(pos, state);
    }

    @Override
    protected BlockEntityType<? extends StorageBlockEntity> getBlockEntityType() {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY.get();
    }
}
