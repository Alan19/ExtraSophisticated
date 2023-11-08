package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlockEntity;

public class ExtraSophisticatedChestBlockEntity extends ChestBlockEntity {

    public ExtraSophisticatedChestBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get();
    }
}
