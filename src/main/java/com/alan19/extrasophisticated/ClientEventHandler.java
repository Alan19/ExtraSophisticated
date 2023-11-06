package com.alan19.extrasophisticated;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.p3pp3rf1y.sophisticatedstorage.client.render.ChestDynamicModel;

public class ClientEventHandler {
    public static final ModelLayerLocation CHEST_LAYER = new ModelLayerLocation(new ResourceLocation(ExtraSophisticated.MODID, "chest"), "main");

    public static void registerHandlers() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(ClientEventHandler::registerEntityRenderers);
        modBus.addListener(ClientEventHandler::registerLayer);
        modBus.addListener(ClientEventHandler::onModelRegistry);
        modBus.addListener(ClientEventHandler::stitchTextures);
    }

    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CHEST_LAYER, () -> ExtrasSophisticatedChestRenderer.createSingleBodyLayer(true));
    }

    private static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get(), ExtrasSophisticatedChestRenderer::new);
    }

    private static void onModelRegistry(ModelEvent.RegisterGeometryLoaders event) {
//        event.register("barrel", BarrelDynamicModel.Loader.INSTANCE);
//        event.register("limited_barrel", LimitedBarrelDynamicModel.Loader.INSTANCE);
        event.register("chest", ChestDynamicModel.Loader.INSTANCE);
//        event.register("shulker_box", ShulkerBoxDynamicModel.Loader.INSTANCE);
//        event.register("simple_composite", SimpleCompositeModel.Loader.INSTANCE);
    }

    private static void stitchTextures(TextureStitchEvent.Pre event) {
        stitchBlockAtlasTextures(event);
        stitchChestTextures(event);
//        stitchShulkerBoxTextures(event);
    }

    private static void stitchChestTextures(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(Sheets.CHEST_SHEET)) {
            return;
        }

        // Register chest material textures here
        event.addSprite(ExtrasSophisticatedChestRenderer.COPPER_TIER.texture());
    }

    private static void stitchBlockAtlasTextures(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(InventoryMenu.BLOCK_ATLAS)) {
            return;
        }

        ChestDynamicModel.getWoodBreakTextures().forEach(event::addSprite);
        event.addSprite(ChestDynamicModel.TINTABLE_BREAK_TEXTURE);
//        event.addSprite(ShulkerBoxDynamicModel.TINTABLE_BREAK_TEXTURE);
//        event.addSprite(ShulkerBoxDynamicModel.MAIN_BREAK_TEXTURE);
    }
}
