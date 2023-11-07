package com.alan19.extrasophisticated.data;

import com.alan19.extrasophisticated.ExtraSophisticated;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

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
