package com.alan19.extrasophisticated.mixin;

import com.google.common.cache.LoadingCache;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.world.item.BlockItem;
import net.p3pp3rf1y.sophisticatedstorage.block.ShulkerBoxBlockEntity;
import net.p3pp3rf1y.sophisticatedstorage.client.render.ShulkerBoxItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ShulkerBoxItemRenderer.class)
public interface ShulkerBoxItemRendererAccessor {
    @Accessor
    LoadingCache<BlockItem, ShulkerBoxBlockEntity> getShulkerBoxBlockEntities();

    @Accessor
    BlockEntityRenderDispatcher getBlockEntityRenderDispatcher();
}
