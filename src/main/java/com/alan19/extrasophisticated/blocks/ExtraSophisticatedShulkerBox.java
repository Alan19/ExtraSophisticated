package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.ShulkerBoxBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.StorageBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ExtraSophisticatedShulkerBox extends ShulkerBoxBlock {
    public ExtraSophisticatedShulkerBox(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier);
    }

    public ExtraSophisticatedShulkerBox(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier, float explosionResistance) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier, explosionResistance);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return createTickerHelper(blockEntityType, ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY.get(), (l, pos, s, blockEntity) -> {
            ExtraSophisticatedShulkerBoxBlockEntity.tick(l, pos, s, blockEntity);
            if (!l.isClientSide) {
                StorageBlockEntity.serverTick(l, pos, blockEntity);
            }
        });
    }

    @Override
    protected BlockEntityType<? extends StorageBlockEntity> getBlockEntityType() {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY.get();
    }

    @Override
    public StorageBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY.get().create(pos, state);
    }
}
