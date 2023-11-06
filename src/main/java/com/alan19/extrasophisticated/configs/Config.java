package com.alan19.extrasophisticated.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import net.p3pp3rf1y.sophisticatedstorage.Config.Server.LimitedBarrelConfig;
import net.p3pp3rf1y.sophisticatedstorage.Config.Server.StorageConfig;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static final Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    private Config() {
    }


    static {
        final Pair<Server, ForgeConfigSpec> commonSpec = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER_SPEC = commonSpec.getRight();
        SERVER = commonSpec.getLeft();
    }

    public static class Server {
        public final StorageConfig copperBarrel;
        public final LimitedBarrelConfig copperLimitedBarrel1;
        public final LimitedBarrelConfig copperLimitedBarrel2;
        public final LimitedBarrelConfig copperLimitedBarrel3;
        public final LimitedBarrelConfig copperLimitedBarrel4;
        public final StorageConfig copperChest;
        public final StorageConfig copperShulkerBox;

        public Server(ForgeConfigSpec.Builder builder) {
            builder.comment("Server Settings").push("server");
            this.copperBarrel = new StorageConfig(builder, "Copper Barrel", 36, 1);
            this.copperLimitedBarrel1 = new LimitedBarrelConfig(builder, "Limited Copper Barrel I", 64, 2);
            this.copperLimitedBarrel2 = new LimitedBarrelConfig(builder, "Limited Copper Barrel II", 32, 2);
            this.copperLimitedBarrel3 = new LimitedBarrelConfig(builder, "Limited Copper Barrel III", 20, 2);
            this.copperLimitedBarrel4 = new LimitedBarrelConfig(builder, "Limited Copper Barrel IV", 16, 2);
            this.copperChest = new StorageConfig(builder, "Copper Chest", 36, 1);
            this.copperShulkerBox = new StorageConfig(builder, "Copper Shulker Box", 36, 1);
            builder.pop();
        }
    }
}
