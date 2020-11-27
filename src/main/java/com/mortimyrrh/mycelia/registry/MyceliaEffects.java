package com.mortimyrrh.mycelia.registry;

import com.mortimyrrh.mycelia.effects.MycelialDecayEffect;
import com.mortimyrrh.mycelia.effects.MycelialResistanceEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyceliaEffects {
    public static final StatusEffect MYCELIAL_RESISTANCE = new MycelialResistanceEffect();
    public static final StatusEffect MYCELIAL_DECAY      = new MycelialDecayEffect();

    public static void registerEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier("mycelia", "mycelial_resistance"), MYCELIAL_RESISTANCE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("mycelia", "mycelial_decay"),      MYCELIAL_DECAY);

    }

}
