package com.mortimyrrh.mycelia.effects;

import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.StructurePieceWithDimensions;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

import java.awt.*;

public class MycelialResistanceEffect extends StatusEffect
{
    public MycelialResistanceEffect()
    {
        super(StatusEffectType.BENEFICIAL,0x00FFFF);
    }

    // This method is called every tick to check weather it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier)
    {
        if (entity instanceof PlayerEntity)
        {

        }
    }
}
