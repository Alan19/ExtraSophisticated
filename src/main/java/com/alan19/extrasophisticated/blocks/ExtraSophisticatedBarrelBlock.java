package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.p3pp3rf1y.sophisticatedstorage.block.BarrelBlock;
import net.p3pp3rf1y.sophisticatedstorage.block.StorageBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.Supplier;

public class ExtraSophisticatedBarrelBlock extends BarrelBlock {
    public ExtraSophisticatedBarrelBlock(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier, Properties properties) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier, properties);
    }

    public ExtraSophisticatedBarrelBlock(Supplier<Integer> numberOfInventorySlotsSupplier, Supplier<Integer> numberOfUpgradeSlotsSupplier, Properties properties, Function<StateDefinition<Block, BlockState>, BlockState> getDefaultState) {
        super(numberOfInventorySlotsSupplier, numberOfUpgradeSlotsSupplier, properties, getDefaultState);
    }

    @Nullable
    @Override
    public StorageBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntity.EXTRA_SOPHISTICATED_BARREL_BLOCK_ENTITY.get().create(pos, state);
    }

    @Override
    protected BlockEntityType<? extends StorageBlockEntity> getBlockEntityType() {
        return ModBlockEntity.EXTRA_SOPHISTICATED_BARREL_BLOCK_ENTITY.get();
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return !level.isClientSide && Boolean.TRUE.equals(state.getValue(TICKING)) ? createTickerHelper(blockEntityType, this.getBlockEntityType(), (l, blockPos, blockState, storageBlockEntity) -> StorageBlockEntity.serverTick(l, blockPos, storageBlockEntity)) : null;
    }
}
