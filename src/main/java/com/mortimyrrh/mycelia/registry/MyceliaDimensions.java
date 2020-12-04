package com.mortimyrrh.mycelia.registry;

import com.mortimyrrh.mycelia.dimension.MycelialPlanesGen;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class MyceliaDimensions {
    public static final RegistryKey<World> MYCELIAL_NETWORK_WORLD = RegistryKey.of(Registry.DIMENSION, new Identifier("mycelial_network_world", "mycelial_network"));

    public static void registerChunkGens() {
        Registry.register(Registry.CHUNK_GENERATOR, new Identifier("mycelia", "mycelial_network"), MycelialPlanesGen.CODEC);
    }
}
