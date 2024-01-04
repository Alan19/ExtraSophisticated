package com.alan19.extrasophisticated.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatherModData {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeClient(), new ExtraSophisticatedBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new ExtraSophisticatedTagProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new EnglishLocalization(generator));
        generator.addProvider(event.includeServer(), new ExtraSophisticatedRecipeProvider(generator));
        generator.addProvider(event.includeClient(), new ExtraSophisticatedItemModels(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new ExtraSophisticatedLootTables(generator));
    }
}
