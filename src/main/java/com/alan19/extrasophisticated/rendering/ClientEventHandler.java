package com.alan19.extrasophisticated.rendering;

import com.alan19.extrasophisticated.ExtraSophisticated;
import com.alan19.extrasophisticated.blocks.ModBlockEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.p3pp3rf1y.sophisticatedstorage.client.render.BarrelRenderer;
import net.p3pp3rf1y.sophisticatedstorage.client.render.LimitedBarrelRenderer;

public class ClientEventHandler {
    public static final ModelLayerLocation CHEST_LAYER = new ModelLayerLocation(new ResourceLocation(ExtraSophisticated.MODID, "chest"), "main");

    public static void registerHandlers() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(ClientEventHandler::registerEntityRenderers);
        modBus.addListener(ClientEventHandler::registerLayer);
        modBus.addListener(ClientEventHandler::stitchTextures);
    }

    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CHEST_LAYER, () -> ExtrasSophisticatedChestRenderer.createSingleBodyLayer(true));
    }

    private static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntity.EXTRA_SOPHISTICATED_CHEST_BLOCK_ENTITY.get(), ExtrasSophisticatedChestRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntity.EXTRA_SOPHISTICATED_BARREL_BLOCK_ENTITY.get(), pContext -> new BarrelRenderer<>());
        event.registerBlockEntityRenderer(ModBlockEntity.EXTRA_SOPHISTICATED_LIMITED_BARREL_BLOCK_ENTITY.get(), pContext -> new LimitedBarrelRenderer());
        event.registerBlockEntityRenderer(ModBlockEntity.EXTRA_SOPHISTICATED_SHULKER_BOX_BLOCK_ENTITY.get(), ExtraSophisticatedShulkerBoxRenderer::new);
    }


    private static void stitchTextures(TextureStitchEvent.Pre event) {
        stitchChestTextures(event);
        stitchShulkerBoxTextures(event);
    }

    private static void stitchShulkerBoxTextures(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(Sheets.SHULKER_SHEET)) {
            return;
        }

        event.addSprite(ExtraSophisticatedShulkerBoxRenderer.COPPER_TIER_MATERIAL.texture());
    }

    private static void stitchChestTextures(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(Sheets.CHEST_SHEET)) {
            return;
        }

        // Register chest material textures here
        event.addSprite(ExtrasSophisticatedChestRenderer.COPPER_TIER.texture());
    }
}
