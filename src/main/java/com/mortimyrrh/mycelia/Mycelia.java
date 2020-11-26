package com.mortimyrrh.mycelia;

import com.mortimyrrh.mycelia.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Mycelia implements ModInitializer {

    public static final String MOD_ID = "mycelia";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }

    public static final ItemGroup MYCELIA_GROUP = FabricItemGroupBuilder.create(
            new Identifier("mycelia", "main_tab"))
            .icon(() -> new ItemStack(ModItems.MYCELIAL_STEW))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.MYCELIAL_STEW));
            })
            .build();
}
