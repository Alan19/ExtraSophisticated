package com.alan19.extrasophisticated.blocks;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.configs.Config;
import com.alan19.extrasophisticated.items.ExtraSophisticatedStorageTierUpgradeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExtraSophisticatedBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtraSophisticated.MODID);

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static RegistryObject<ExtraSophisticatedStorageTierUpgradeItem> BASIC_TO_COPPER_TIER_UPGRADE = ITEMS.register("basic_to_copper_tier_upgrade", () -> new ExtraSophisticatedStorageTierUpgradeItem(ExtraSophisticatedStorageTierUpgradeItem.TierUpgrade.BASIC_TO_COPPER));
    public static RegistryObject<ExtraSophisticatedStorageTierUpgradeItem> COPPER_TO_IRON_TIER_UPGRADE = ITEMS.register("copper_to_iron_tier_upgrade", () -> new ExtraSophisticatedStorageTierUpgradeItem(ExtraSophisticatedStorageTierUpgradeItem.TierUpgrade.COPPER_TO_IRON));
//    public static RegistryObject<ExtraSophisticatedStorageTierUpgradeItem> COPPER_TO_GOLD_TIER_UPGRADE = ITEMS.register("copper_to_gold_tier_upgrade", () -> new ExtraSophisticatedStorageTierUpgradeItem(ExtraSophisticatedStorageTierUpgradeItem.TierUpgrade.COPPER_TO_GOLD));

    public static final StorageTier COPPER = new StorageTier("copper", Config.SERVER.copper, BLOCKS, ITEMS, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
}
