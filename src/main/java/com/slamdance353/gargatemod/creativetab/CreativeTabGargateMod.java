package com.slamdance353.gargatemod.creativetab;

import com.slamdance353.gargatemod.init.ModItems;
import com.slamdance353.gargatemod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabGargateMod
{
    public static final CreativeTabs GARGATE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.phoenixGate;
        }

    };
}
