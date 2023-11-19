package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import com.alan19.extrasophisticated.blocks.StorageTier;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLocalization extends LanguageProvider {
    public EnglishLocalization(DataGenerator gen) {
        super(gen, ExtraSophisticated.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ExtraSophisticatedBlocks.COPPER);
    }

    private void add(StorageTier tier) {
        String name = tier.getName().substring(0, 1).toUpperCase() + tier.getName().substring(1);
        add(tier.getBarrelBlock().get(), "%s%s" + name + " Barrel");
        add(tier.getChestBlock().get(), "%s%s" + name + " Chest");
        add(tier.getLimitedBarrel1Block().get(), "Limited %s%s" + name + " Barrel I");
        add(tier.getLimitedBarrel2Block().get(), "Limited %s%s" + name + " Barrel II");
        add(tier.getLimitedBarrel3Block().get(), "Limited %s%s" + name + " Barrel III");
        add(tier.getLimitedBarrel4Block().get(), "Limited %s%s" + name + " Barrel IV");
        add(tier.getShulkerBoxBlock().get(), name + " Shulker Box");
        add(ExtraSophisticatedBlocks.BASIC_TO_COPPER_TIER_UPGRADE.get(), "Wood to Copper Tier Upgrade");
        add(ExtraSophisticatedBlocks.COPPER_TO_IRON_TIER_UPGRADE.get(), "Copper to Iron Tier Upgrade");
        add(ExtraSophisticatedBlocks.COPPER_TO_GOLD_TIER_UPGRADE.get(), "Copper to Gold Tier Upgrade");
    }
}
