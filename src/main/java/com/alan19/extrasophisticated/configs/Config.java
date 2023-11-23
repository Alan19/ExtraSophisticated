package com.alan19.extrasophisticated.configs;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static final Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<Server, ForgeConfigSpec> commonSpec = new ForgeConfigSpec.Builder().configure(Server::new);
        SERVER_SPEC = commonSpec.getRight();
        SERVER = commonSpec.getLeft();
    }


    private Config() {
    }

    public static class Server {
        public final StorageTierConfig copper;

        public Server(ForgeConfigSpec.Builder builder) {
            builder.comment("Server Settings").push("server");
            copper = new StorageTierConfig(builder, "Copper", 54, 1, 48);
        }

    }
}
