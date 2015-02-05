package com.slamdance353.gargatemod.init;


import com.slamdance353.gargatemod.item.ItemGargate;
import com.slamdance353.gargatemod.item.ItemPhoenixGate;
import com.slamdance353.gargatemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemGargate phoenixGate = new ItemPhoenixGate();

    public static void init ()
    {
        GameRegistry.registerItem(phoenixGate, "The Phoenix Gate");
    }
}
