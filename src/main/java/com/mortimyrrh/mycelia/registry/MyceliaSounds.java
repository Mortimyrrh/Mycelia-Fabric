package com.mortimyrrh.mycelia.registry;

import com.mortimyrrh.mycelia.Mycelia;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyceliaSounds {

    public static final Identifier PORTAL_SOUND_ID = new Identifier("mycelia:portal1");
    public static SoundEvent PORTAL_SOUND_EVENT = new SoundEvent(PORTAL_SOUND_ID);

    public static void registerSounds()
    {
        Registry.register(Registry.SOUND_EVENT, MyceliaSounds.PORTAL_SOUND_ID, PORTAL_SOUND_EVENT);
    }
}
