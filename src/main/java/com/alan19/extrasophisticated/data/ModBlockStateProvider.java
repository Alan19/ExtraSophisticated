package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.p3pp3rf1y.sophisticatedstorage.SophisticatedStorage;

public class ModBlockStateProvider extends BlockStateProvider {
    private final ExistingFileHelper existingFileHelper;

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtraSophisticated.MODID, existingFileHelper);
        this.existingFileHelper = existingFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile uncheckedChestItemModel = new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "item/chest"));
        ConfiguredModel[] configuredChestModel = ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "block/chest"))).build();
        simpleBlockItem(ModBlocks.COPPER_CHEST.get(), uncheckedChestItemModel);
        getVariantBuilder(ModBlocks.COPPER_CHEST.get()).partialState().setModels(configuredChestModel);
    }
}
