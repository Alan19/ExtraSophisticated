package com.alan19.extrasophisticated.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import net.p3pp3rf1y.sophisticatedstorage.Config;

public class StorageTierConfig {
    private final Config.Server.StorageConfig barrel;
    private final Config.Server.LimitedBarrelConfig limitedBarrel1;
    private final Config.Server.LimitedBarrelConfig limitedBarrel2;
    private final Config.Server.LimitedBarrelConfig limitedBarrel3;
    private final Config.Server.LimitedBarrelConfig limitedBarrel4;
    private final Config.Server.StorageConfig chest;
    private final Config.Server.StorageConfig shulkerBox;

    public StorageTierConfig(ForgeConfigSpec.Builder builder, String name, int inventorySlots, int upgradeSlots, int slotMultiplier) {
        this.barrel = new Config.Server.StorageConfig(builder, "%s Barrel".formatted(name), inventorySlots, upgradeSlots);
        this.limitedBarrel1 = new Config.Server.LimitedBarrelConfig(builder, "Limited %s Barrel I".formatted(name), slotMultiplier, upgradeSlots);
        this.limitedBarrel2 = new Config.Server.LimitedBarrelConfig(builder, "Limited %s Barrel II".formatted(name), (int) (slotMultiplier * .5), upgradeSlots);
        this.limitedBarrel3 = new Config.Server.LimitedBarrelConfig(builder, "Limited %s Barrel III".formatted(name), (int) (slotMultiplier * .3125), upgradeSlots);
        this.limitedBarrel4 = new Config.Server.LimitedBarrelConfig(builder, "Limited %s Barrel IV".formatted(name), (int) (slotMultiplier * .25), upgradeSlots);
        this.chest = new Config.Server.StorageConfig(builder, "%s Chest".formatted(name), inventorySlots, upgradeSlots);
        this.shulkerBox = new Config.Server.StorageConfig(builder, "%s Shulker Box".formatted(name), inventorySlots, upgradeSlots);
    }

    public Config.Server.StorageConfig getBarrel() {
        return barrel;
    }

    public Config.Server.LimitedBarrelConfig getLimitedBarrel1() {
        return limitedBarrel1;
    }

    public Config.Server.LimitedBarrelConfig getLimitedBarrel2() {
        return limitedBarrel2;
    }

    public Config.Server.LimitedBarrelConfig getLimitedBarrel3() {
        return limitedBarrel3;
    }

    public Config.Server.LimitedBarrelConfig getLimitedBarrel4() {
        return limitedBarrel4;
    }

    public Config.Server.StorageConfig getChest() {
        return chest;
    }

    public Config.Server.StorageConfig getShulkerBox() {
        return shulkerBox;
    }
}
