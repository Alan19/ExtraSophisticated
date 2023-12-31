package com.alan19.extrasophisticated;

import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlockEntity;
import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import com.alan19.extrasophisticated.configs.Config;
import com.alan19.extrasophisticated.rendering.ClientEventHandler;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtraSophisticated.MODID)
public class ExtraSophisticated {

    public static final String MODID = "extrasophisticated";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtraSophisticated() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ExtraSophisticatedBlocks.BLOCKS.register(modEventBus);
        ExtraSophisticatedBlocks.ITEMS.register(modEventBus);
        ExtraSophisticatedBlockEntity.BLOCK_ENTITY_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            ClientEventHandler.registerHandlers();
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
