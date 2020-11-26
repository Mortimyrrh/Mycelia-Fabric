package com.mortimyrrh.mycelia;

import com.mortimyrrh.mycelia.effects.MycelialResistanceEffect;
import com.mortimyrrh.mycelia.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mycelia implements ModInitializer {

    public static final String MOD_ID = "mycelia";

    public static final StatusEffect MYCELIAL_RESISTANCE = new MycelialResistanceEffect();

    @Override
    public void onInitialize() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("mycelia", "mycelial_resistance"), MYCELIAL_RESISTANCE);
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
