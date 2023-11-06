package com.alan19.extrasophisticated;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestLidController;
import net.minecraft.world.level.block.state.BlockState;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlockEntity;

public class ExtraSophisticatedChestBlockEntity extends ChestBlockEntity {
    private final ChestLidController chestLidController = new ChestLidController();

    public ExtraSophisticatedChestBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get();
    }

    public static void lidAnimateTick2(ExtraSophisticatedChestBlockEntity extraSophisticatedChestBlockEntity) {
        extraSophisticatedChestBlockEntity.chestLidController.tickLid();
    }
}
