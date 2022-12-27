package com.tutorial.boson.network;

import com.tutorial.boson.Utils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class NetWorking {
    public static SimpleChannel INSTANCE;
    public static final String VERSION = "1.0";
    private static int ID = 0;

    public static int nextID() {
        return ID++;
    }

    public static void registerMessage() {
        INSTANCE = NetworkRegistry.newSimpleChannel(
                new ResourceLocation(Utils.MOD_ID, "first_networking"),
                () -> VERSION,
                (version) -> version.equals(VERSION),
                (version) -> version.equals(VERSION)
        );
        INSTANCE.messageBuilder(SendPack.class, nextID())
                .encoder(SendPack::toBytes)
                .decoder(SendPack::new)
                .consumer(SendPack::handler)
                .add();
    }
}
