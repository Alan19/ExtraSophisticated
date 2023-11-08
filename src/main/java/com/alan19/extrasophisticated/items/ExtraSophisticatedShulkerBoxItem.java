package com.alan19.extrasophisticated.items;

import com.alan19.extrasophisticated.rendering.ExtraSophisticatedShulkerBoxItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.util.NonNullLazy;
import net.p3pp3rf1y.sophisticatedstorage.item.ShulkerBoxItem;

import java.util.function.Consumer;

public class ExtraSophisticatedShulkerBoxItem extends ShulkerBoxItem {
    public ExtraSophisticatedShulkerBoxItem(Block block) {
        super(block);
    }

    public ExtraSophisticatedShulkerBoxItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private final NonNullLazy<BlockEntityWithoutLevelRenderer> ister = NonNullLazy.of(() -> new ExtraSophisticatedShulkerBoxItemRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels()));

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return ister.get();
            }
        });
    }
}
