package com.mortimyrrh.mycelia;

import com.mortimyrrh.mycelia.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.mixin.biome.VanillaLayeredBiomeSourceAccessor;

public class Mycelia implements ModInitializer {

    public static final String MOD_ID = "mycelia";

    @Override
    public void onInitialize() {
        MyceliaItems.registerItems();
        MyceliaEffects.registerEffects();
        MyceliaSounds.registerSounds();
        MyceliaDimensions.registerDimensions();

        VanillaLayeredBiomeSourceAccessor.getBIOMES();
    }
}
