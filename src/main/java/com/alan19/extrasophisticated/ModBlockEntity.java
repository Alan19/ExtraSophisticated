package com.alan19.extrasophisticated;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlockEntity;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraSophisticated.MODID);

    public static final RegistryObject<BlockEntityType<ChestBlockEntity>> CHESTS = BLOCK_ENTITY_TYPES.register("chest", () -> BlockEntityType.Builder.of(ChestBlockEntity::new, new Block[]{ModBlocks.COPPER_CHEST.get()}).build(null));
}
