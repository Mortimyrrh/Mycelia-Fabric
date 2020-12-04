package com.mortimyrrh.mycelia.gui;

import com.mortimyrrh.mycelia.registry.MyceliaItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MyceliaCreativeTab {

    // setup creative tab menu
    public static final ItemGroup MYCELIA_GROUP = FabricItemGroupBuilder.create(
            new Identifier("mycelia", "main_tab"))
            .icon(() -> new ItemStack(MyceliaItems.MYCELIAL_STEW))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(MyceliaItems.MYCELIAL_STEW));
            })
            .build();
}
