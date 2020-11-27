package com.mortimyrrh.mycelia.items;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.registry.MyceliaEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class MycelialStewItem extends Item {
    public MycelialStewItem() {
        super(new Item.Settings().recipeRemainder(Items.BOWL)
                .maxCount(1)
                .rarity(Rarity.RARE)
                .food(new FoodComponent.Builder()
                        .hunger(6)
                        .saturationModifier(7)
                        .snack()
                        .alwaysEdible()
                        .statusEffect(new StatusEffectInstance(MyceliaEffects.MYCELIAL_RESISTANCE, (20 * 25)), 1.0f)
                        .build())
                .group(ItemGroup.FOOD));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.mycelia.mycelial_stew.tooltip"));
    }
}