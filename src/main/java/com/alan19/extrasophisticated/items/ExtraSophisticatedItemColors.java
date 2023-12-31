package com.alan19.extrasophisticated.items;

import com.alan19.extrasophisticated.blocks.ExtraSophisticatedBlocks;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.p3pp3rf1y.sophisticatedstorage.item.StorageBlockItem;

public class ExtraSophisticatedItemColors {
    public static void registerItemColorHandlers(RegisterColorHandlersEvent.Item event) {
        event.register((stack, tintIndex) -> {
                    if (tintIndex < 1000 || tintIndex > 1001) {
                        return -1;
                    }
                    if (tintIndex == 1000) {
                        return StorageBlockItem.getMainColorFromStack(stack).orElse(-1);
                    } else {
                        return StorageBlockItem.getAccentColorFromStack(stack).orElse(-1);
                    }
                },
                ExtraSophisticatedBlocks.COPPER.getBarrelsInTier()
        );
    }
}
