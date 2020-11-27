package com.mortimyrrh.mycelia.effects;

import net.minecraft.entity.damage.DamageSource;

public class MycelialExsposureDamage extends DamageSource {
    public MycelialExsposureDamage(String name) {
        super(name);
        bypassesArmor();
        setUsesMagic();
        setScaledWithDifficulty();
    }
}
