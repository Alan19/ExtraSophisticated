package com.alan19.extrasophisticated.items;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.item.BarrelBlockItem;
import net.p3pp3rf1y.sophisticatedstorage.item.ShulkerBoxItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static final RegistryObject<BlockItem> COPPER_CHEST = ITEMS.register("copper_chest", () -> new ExtraSophisticatedChestItem(ModBlocks.COPPER_CHEST.get()));
    public static final RegistryObject<BlockItem> COPPER_BARREL = ITEMS.register("copper_barrel", () -> new BarrelBlockItem(ModBlocks.COPPER_BARREL.get()));
    public static final RegistryObject<BlockItem> LIMITED_COPPER_BARREL_1 = ITEMS.register("limited_copper_barrel_1", () -> new BarrelBlockItem(ModBlocks.LIMITED_COPPER_BARREL_1.get()));
    public static final RegistryObject<BlockItem> LIMITED_COPPER_BARREL_2 = ITEMS.register("limited_copper_barrel_2", () -> new BarrelBlockItem(ModBlocks.LIMITED_COPPER_BARREL_2.get()));
    public static final RegistryObject<BlockItem> LIMITED_COPPER_BARREL_3 = ITEMS.register("limited_copper_barrel_3", () -> new BarrelBlockItem(ModBlocks.LIMITED_COPPER_BARREL_3.get()));
    public static final RegistryObject<BlockItem> LIMITED_COPPER_BARREL_4 = ITEMS.register("limited_copper_barrel_4", () -> new BarrelBlockItem(ModBlocks.LIMITED_COPPER_BARREL_4.get()));
    public static final RegistryObject<BlockItem> COPPER_SHULKER_BOX = ITEMS.register("copper_shulker_box", () -> new ExtraSophisticatedShulkerBoxItem(ModBlocks.COPPER_SHULKER_BOX.get()));

}
