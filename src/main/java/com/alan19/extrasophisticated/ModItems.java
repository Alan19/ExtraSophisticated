package com.alan19.extrasophisticated;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.util.NonNullLazy;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.p3pp3rf1y.sophisticatedstorage.client.render.ChestItemRenderer;
import net.p3pp3rf1y.sophisticatedstorage.item.ChestBlockItem;

import java.util.function.Consumer;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraSophisticated.MODID);
    public static final RegistryObject<BlockItem> COPPER_CHEST = ITEMS.register("copper_chest", () -> new ChestBlockItem(ModBlocks.COPPER_CHEST.get()) {
        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                private final NonNullLazy<BlockEntityWithoutLevelRenderer> ister = NonNullLazy.of(() -> new ExtraSophisticatedChestItemRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels()));

                @Override
                public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                    return ister.get();
                }
            });
        }
    });
}
