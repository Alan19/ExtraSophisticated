package com.alan19.extrasophisticated.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.LimitedBarrelBlockEntity;

public class ExtraSophisticatedLimitedBarrelBlockEntity extends LimitedBarrelBlockEntity {
    public ExtraSophisticatedLimitedBarrelBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ExtraSophisticatedBlockEntity.EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY.get();
    }
}
