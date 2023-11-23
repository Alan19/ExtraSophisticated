package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExtraSophisticatedItemModels extends ItemModelProvider {
    public ExtraSophisticatedItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtraSophisticated.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ExtraSophisticatedBlocks.BASIC_TO_COPPER_TIER_UPGRADE.get());
        basicItem(ExtraSophisticatedBlocks.COPPER_TO_IRON_TIER_UPGRADE.get());
//        basicItem(ExtraSophisticatedBlocks.COPPER_TO_GOLD_TIER_UPGRADE.get());
    }
}
