package com.slamdance353.gargatemod.init;

import com.slamdance353.gargatemod.block.BlockClawedStone;
import com.slamdance353.gargatemod.block.BlockGargate;
import com.slamdance353.gargatemod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
   public static final BlockGargate clawedStone = new BlockClawedStone();

    public static void init ()
    {
        GameRegistry.registerBlock(clawedStone, "clawedStone");
    }
}
