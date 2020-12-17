package com.mortimyrrh.mycelia.registry;

import com.mortimyrrh.mycelia.dimension.MycelialNetworkGen;
import com.mortimyrrh.mycelia.dimension.biome.MycelialPlanesBiome;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class MyceliaDimensions {
    public static final RegistryKey<World> MYCELIAL_NETWORK_WORLD = RegistryKey.of(Registry.DIMENSION, new Identifier("mycelial_network_world", "mycelial_network"));
    
    public static void registerDimensions() {
        Registry.register(Registry.CHUNK_GENERATOR, new Identifier("mycelia", "mycelial_network"), MycelialNetworkGen.CODEC);

        MycelialPlanesBiome.registerBiome();
    }

}
