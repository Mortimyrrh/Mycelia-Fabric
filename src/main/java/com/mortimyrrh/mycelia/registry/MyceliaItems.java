package com.mortimyrrh.mycelia.registry;

import com.mortimyrrh.mycelia.Mycelia;
import com.mortimyrrh.mycelia.items.MycelialStewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyceliaItems {

    public static final MycelialStewItem MYCELIAL_STEW = new MycelialStewItem();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Mycelia.MOD_ID, "mycelial_stew"), MYCELIAL_STEW);
    }
}
