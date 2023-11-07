package com.alan19.extrasophisticated;

import com.alan19.extrasophisticated.blocks.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtraSophisticated.MODID);

    public static final RegistryObject<BlockEntityType<ExtraSophisticatedChestBlockEntity>> EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("chest", () -> BlockEntityType.Builder.of(ExtraSophisticatedChestBlockEntity::new, ModBlocks.COPPER_CHEST.get()).build(null));
}
