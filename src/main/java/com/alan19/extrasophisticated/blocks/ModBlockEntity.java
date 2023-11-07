package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.block.LimitedBarrelBlockEntity;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraSophisticated.MODID);

    public static final RegistryObject<BlockEntityType<ExtraSophisticatedChestBlockEntity>> EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("chest", () -> BlockEntityType.Builder.of(ExtraSophisticatedChestBlockEntity::new, ModBlocks.COPPER_CHEST.get()).build(null));
    public static final RegistryObject<BlockEntityType<ExtraSophisticatedBarrelBlockEntity>> EXTRA_SOPHISTICATED_BARREL_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("barrel", () -> BlockEntityType.Builder.of(ExtraSophisticatedBarrelBlockEntity::new, ModBlocks.COPPER_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimitedBarrelBlockEntity>> EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("limited_barrel", () -> BlockEntityType.Builder.of((pPos, pState) -> new LimitedBarrelBlockEntity(pPos, pState), ModBlocks.LIMITED_COPPER_BARREL_1.get(), ModBlocks.LIMITED_COPPER_BARREL_2.get(), ModBlocks.LIMITED_COPPER_BARREL_3.get(), ModBlocks.LIMITED_COPPER_BARREL_4.get()).build(null));
}
