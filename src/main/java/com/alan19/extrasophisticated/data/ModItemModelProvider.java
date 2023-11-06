package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.p3pp3rf1y.sophisticatedstorage.SophisticatedStorage;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExtraSophisticated.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        ModelFile.UncheckedModelFile chestItemModel = new ModelFile.UncheckedModelFile(new ResourceLocation(SophisticatedStorage.MOD_ID, "item/chest"));
//        basicItem(ModItems.COPPER_CHEST.get()).parent(chestItemModel);
    }
}
