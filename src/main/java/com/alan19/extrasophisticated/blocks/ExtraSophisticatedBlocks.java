package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.configs.Config;
import com.alan19.extrasophisticated.items.ExtraSophisticatedStorageTierUpgradeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraSophisticatedBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static RegistryObject<ExtraSophisticatedStorageTierUpgradeItem> WOOD_TO_COPPER_TIER_UPGRADE = ITEMS.register("wood_to_copper_tier_upgrade", () -> new ExtraSophisticatedStorageTierUpgradeItem(ExtraSophisticatedStorageTierUpgradeItem.TierUpgrade.BASIC_TO_COPPER));

    public static final StorageTier COPPER = new StorageTier("copper", Config.SERVER.copper, BLOCKS, ITEMS);
}
