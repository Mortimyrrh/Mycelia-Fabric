package com.mortimyrrh.mycelia;

import com.mortimyrrh.mycelia.dimension.MycelialPlanesGen;
import com.mortimyrrh.mycelia.registry.MyceliaDimensions;
import com.mortimyrrh.mycelia.registry.MyceliaItems;
import com.mortimyrrh.mycelia.registry.MyceliaEffects;
import com.mortimyrrh.mycelia.registry.MyceliaSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class Mycelia implements ModInitializer {

    public static final String MOD_ID = "mycelia";

    @Override
    public void onInitialize() {
        MyceliaItems.registerItems();
        MyceliaEffects.registerEffects();
        MyceliaSounds.registerSounds();
        MyceliaDimensions.registerChunkGens();
    }
}
