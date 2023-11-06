package com.alan19.extrasophisticated;

import com.alan19.extrasophisticated.configs.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlock;
import org.jetbrains.annotations.Nullable;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);
    public static final RegistryObject<ChestBlock> COPPER_CHEST = BLOCKS.register("copper_chest", () -> new ChestBlock(Config.SERVER.copperChest.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount) {
        @Nullable
        @Override
        public ExtraSophisticatedChestBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
            return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get().create(pos, state);
        }

        @Override
        protected BlockEntityType<? extends ExtraSophisticatedChestBlockEntity> getBlockEntityType() {
            return ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get();
        }

        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
            return level.isClientSide ? createTickerHelper(blockEntityType, (BlockEntityType) ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get(), (l, p, s, be) -> {
                ExtraSophisticatedChestBlockEntity.lidAnimateTick2((ExtraSophisticatedChestBlockEntity) be);
            }) : super.getTicker(level, state, blockEntityType);
        }
    });
}
