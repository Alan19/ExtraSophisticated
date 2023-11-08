package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlocks;
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
import net.p3pp3rf1y.sophisticatedstorage.block.LimitedBarrelBlock;
import net.p3pp3rf1y.sophisticatedstorage.item.BarrelBlockItem;

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
        simpleBlockItem(ModBlocks.COPPER.getChestBlock().get(), uncheckedChestItemModel);
        getVariantBuilder(ModBlocks.COPPER.getChestBlock().get()).partialState().setModels(configuredChestModel);

        dynamicBlockItem(ModBlocks.COPPER.getBarrelBlock().get(), ModBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ModBlocks.COPPER.getLimitedBarrel1Block().get(), ModBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ModBlocks.COPPER.getLimitedBarrel2Block().get(), ModBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ModBlocks.COPPER.getLimitedBarrel3Block().get(), ModBlocks.COPPER.getBarrelBlock().get());
        dynamicBlockItem(ModBlocks.COPPER.getLimitedBarrel4Block().get(), ModBlocks.COPPER.getBarrelBlock().get());
        ModelFile.UncheckedModelFile uncheckedShulkerBoxItemModel = new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "item/shulker_box"));
        ConfiguredModel[] configuredShulkerBoxModel = ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "block/shulker_box"))).build();
        simpleBlockItem(ModBlocks.COPPER.getShulkerBoxBlock().get(), uncheckedShulkerBoxItemModel);
        getVariantBuilder(ModBlocks.COPPER.getShulkerBoxBlock().get()).partialState().setModels(configuredShulkerBoxModel);

    }

    private void dynamicBlockItem(Block blockItem, BarrelBlock barrel) {
        ResourceLocation key = ForgeRegistries.BLOCKS.getKey(barrel);
        simpleBlockItem(blockItem, new ModelFile.UncheckedModelFile(new ResourceLocation(key.getNamespace(), "block/" + key.getPath())));
    }
}
