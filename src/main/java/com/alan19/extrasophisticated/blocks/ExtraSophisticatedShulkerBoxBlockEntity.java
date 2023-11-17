package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.ShulkerBoxBlockEntity;

public class ExtraSophisticatedShulkerBoxBlockEntity extends ShulkerBoxBlockEntity {
    public ExtraSophisticatedShulkerBoxBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY.get();
    }
}
