package com.alan19.extrasophisticated.items;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.item.BarrelBlockItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static final RegistryObject<BlockItem> COPPER_CHEST = ITEMS.register("copper_chest", () -> new ExtraSophisticatedChestItem(ModBlocks.COPPER_CHEST.get()));
    public static final RegistryObject<BlockItem> COPPER_BARREL = ITEMS.register("copper_barrel", () -> new BarrelBlockItem(ModBlocks.COPPER_BARREL.get()));
}
