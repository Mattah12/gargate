package com.slamdance353.gargatemod.init;


import com.slamdance353.gargatemod.item.ItemEyeOfOdin;
import com.slamdance353.gargatemod.item.ItemGargate;
import com.slamdance353.gargatemod.item.ItemGrimArca;
import com.slamdance353.gargatemod.item.ItemPhoenixGate;
import com.slamdance353.gargatemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemGargate phoenixGate = new ItemPhoenixGate();
    public static final ItemGargate grimArca = new ItemGrimArca();
    public static final ItemGargate eyeOdin = new ItemEyeOfOdin();
    public static void init ()
    {
        GameRegistry.registerItem(phoenixGate, "phoenixGate");
        GameRegistry.registerItem(grimArca, "grimArca");
        GameRegistry.registerItem(eyeOdin, "eyeOdin");
    }

}
