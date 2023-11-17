package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraSophisticatedBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraSophisticated.MODID);

    public static final RegistryObject<BlockEntityType<ExtraSophisticatedChestBlockEntity>> EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("chest", () -> BlockEntityType.Builder.of(ExtraSophisticatedChestBlockEntity::new, ExtraSophisticatedBlocks.COPPER.getChestBlock().get()).build(null));
    public static final RegistryObject<BlockEntityType<ExtraSophisticatedBarrelBlockEntity>> EXTRA_SOPHISTICATED_BARREL_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("barrel", () -> BlockEntityType.Builder.of(ExtraSophisticatedBarrelBlockEntity::new, ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get()).build(null));
    public static final RegistryObject<BlockEntityType<ExtraSophisticatedLimitedBarrelBlockEntity>> EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("limited_barrel", () -> BlockEntityType.Builder.of(ExtraSophisticatedLimitedBarrelBlockEntity::new, ExtraSophisticatedBlocks.COPPER.getLimitedBarrelBlocks()).build(null));
    public static final RegistryObject<BlockEntityType<ExtraSophisticatedShulkerBoxBlockEntity>> EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("shulker_box", () -> BlockEntityType.Builder.of(ExtraSophisticatedShulkerBoxBlockEntity::new, ExtraSophisticatedBlocks.COPPER.getShulkerBoxBlock().get()).build(null));
}
