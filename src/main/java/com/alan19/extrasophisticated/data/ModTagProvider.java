package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModTagProvider extends BlockTagsProvider {
    public ModTagProvider(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, ExtraSophisticated.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Blocks.CHESTS).add(ModBlocks.COPPER_CHEST.get());
    }
}
