package com.mortimyrrh.mycelia;

import com.mortimyrrh.mycelia.effects.MycelialExsposureDamage;
import com.mortimyrrh.mycelia.registry.MyceliaItems;
import com.mortimyrrh.mycelia.registry.MyceliaEffects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Mycelia implements ModInitializer {

    public static final String MOD_ID = "mycelia";

    // setup creative tab menu
    public static final ItemGroup MYCELIA_GROUP = FabricItemGroupBuilder.create(
            new Identifier("mycelia", "main_tab"))
            .icon(() -> new ItemStack(MyceliaItems.MYCELIAL_STEW))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(MyceliaItems.MYCELIAL_STEW));
            })
            .build();

    @Override
    public void onInitialize() {
        MyceliaItems.registerItems();
        MyceliaEffects.registerEffects();
    }
}
