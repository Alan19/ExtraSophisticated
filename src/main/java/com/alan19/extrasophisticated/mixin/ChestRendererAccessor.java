package com.alan19.extrasophisticated.mixin;

import com.alan19.extrasophisticated.ModBlocks;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.Block;
import net.p3pp3rf1y.sophisticatedstorage.client.StorageTextureManager;
import net.p3pp3rf1y.sophisticatedstorage.client.render.ChestRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(ChestRenderer.class)
public class ChestRendererAccessor {
    @Inject(at = @At("TAIL"), method = "getTierMaterial", cancellable = true, remap = false)
    private void getTierMaterial(Map<StorageTextureManager.ChestMaterial, Material> chestMaterials, Block block, CallbackInfoReturnable<Material> cir) {
        if (block == ModBlocks.COPPER_CHEST.get()) {
            cir.setReturnValue(chestMaterials.get(StorageTextureManager.ChestMaterial.IRON_TIER));
        }
    }

}
