package com.mortimyrrh.mycelia.items;

import com.mortimyrrh.mycelia.registry.MyceliaEffects;
import com.mortimyrrh.mycelia.registry.MyceliaSounds;
import net.minecraft.block.AirBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import java.util.List;
import java.util.Objects;

public class MycelialStewItem extends Item {
    public MycelialStewItem() {
        super(new Item.Settings()
                .recipeRemainder(Items.BOWL)
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

    private BlockPos getNewTeleportPosNearEntity (LivingEntity entity)
    {
        BlockPos blockPos = new BlockPos( // MEMORY LEAK!!!!!! (never call delete)
                entity.getX() + (Math.random() * 30) - 15,
                entity.getY() + (Math.random() * 5) + 2,
                entity.getZ() + (Math.random() * 30) - 15
        );

        // return null if its not a safe place to travel to else return the block.

        // replace false with safe to teleport logic
        // !Objects.requireNonNull(entity.world.getBlockEntity(blockPos)).getCachedState().isAir() &&
        // !Objects.requireNonNull(entity.world.getBlockEntity(blockPos.add(0, 1, 0))).getCachedState().isAir()

        if (false) {
            return entity.getBlockPos();
        } else {
            return blockPos;
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity)
    {
        entity.playSound(MyceliaSounds.PORTAL_SOUND_EVENT, 1.0F, 1.0F);

        if(!entity.world.getDimension().equals(DimensionType.THE_NETHER_ID))
        {
            BlockPos blockPos = getNewTeleportPosNearEntity(entity);

            if(false) {
                // couldn't find safe block to teleport to.
            } else {
                // safe to teleport
                ((PlayerEntity) entity).teleport(
                        blockPos.getX(),
                        blockPos.getY(),
                        blockPos.getZ()
                );
            }
        }

        return this.isFood() ? entity.eatFood(world, stack) : stack;
    }
}