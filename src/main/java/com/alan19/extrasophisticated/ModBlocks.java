package com.alan19.extrasophisticated;

import com.alan19.extrasophisticated.configs.Config;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.block.ChestBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);
    public static final RegistryObject<ChestBlock> COPPER_CHEST = BLOCKS.register("copper_chest", () -> new ChestBlock(Config.SERVER.copperChest.inventorySlotCount, Config.SERVER.copperChest.upgradeSlotCount));
}
