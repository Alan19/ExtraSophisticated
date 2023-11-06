package com.alan19.extrasophisticated;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.item.ChestBlockItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static final RegistryObject<BlockItem> COPPER_CHEST = ITEMS.register("copper_chest", () -> new ChestBlockItem(ModBlocks.COPPER_CHEST.get()));
}
