package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.p3pp3rf1y.sophisticatedstorage.SophisticatedStorage;
import net.p3pp3rf1y.sophisticatedstorage.block.BarrelBlock;

public class ExtraSophisticatedBlockStateProvider extends BlockStateProvider {
    private final ExistingFileHelper existingFileHelper;

    public ExtraSophisticatedBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtraSophisticated.MODID, existingFileHelper);
        this.existingFileHelper = existingFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile uncheckedChestItemModel = new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "item/chest"));
        ConfiguredModel[] configuredChestModel = ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "block/chest"))).build();
        simpleBlockItem(ExtraSophisticatedBlocks.COPPER.getChestBlock().get(), uncheckedChestItemModel);
        getVariantBuilder(ExtraSophisticatedBlocks.COPPER.getChestBlock().get()).partialState().setModels(configuredChestModel);

        dynamicBlockItem(ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get(), ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ExtraSophisticatedBlocks.COPPER.getLimitedBarrel1Block().get(), ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ExtraSophisticatedBlocks.COPPER.getLimitedBarrel2Block().get(), ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ExtraSophisticatedBlocks.COPPER.getLimitedBarrel3Block().get(), ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ExtraSophisticatedBlocks.COPPER.getLimitedBarrel4Block().get(), ExtraSophisticatedBlocks.COPPER.getBarrelBlock().get());
        ModelFile.UncheckedModelFile uncheckedShulkerBoxItemModel = new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "item/shulker_box"));
        ConfiguredModel[] configuredShulkerBoxModel = ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "block/shulker_box"))).build();
        simpleBlockItem(ExtraSophisticatedBlocks.COPPER.getShulkerBoxBlock().get(), uncheckedShulkerBoxItemModel);
        getVariantBuilder(ExtraSophisticatedBlocks.COPPER.getShulkerBoxBlock().get()).partialState().setModels(configuredShulkerBoxModel);

    }

    private void dynamicBlockItem(Block blockItem, BarrelBlock barrel) {
        ResourceLocation key = ForgeRegistries.BLOCKS.getKey(barrel);
        simpleBlockItem(blockItem, new ModelFile.UncheckedModelFile(new ResourceLocation(key.getNamespace(), "block/" + key.getPath())));
    }
}
