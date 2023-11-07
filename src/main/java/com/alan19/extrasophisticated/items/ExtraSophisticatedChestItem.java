package com.alan19.extrasophisticated.items;

import com.alan19.extrasophisticated.rendering.ExtraSophisticatedChestItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.util.NonNullLazy;
import net.p3pp3rf1y.sophisticatedstorage.item.ChestBlockItem;

import java.util.function.Consumer;

public class ExtraSophisticatedChestItem extends ChestBlockItem {
    public ExtraSophisticatedChestItem(Block block) {
        super(block);
    }

    public ExtraSophisticatedChestItem(Block block, Properties properties) {
        super(block, properties);
    }

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
}
