package com.slamdance353.gargatemod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init ()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.eyeOdin), "ccc", "aba", "ccc", 'a', new ItemStack(Items.ender_pearl), 'b', new ItemStack(ModItems.grimArca), 'c', "ingotGold"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.phoenixGate), new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack (Items.diamond),new ItemStack(Items.ender_pearl), new ItemStack(ModItems.grimArca),new ItemStack(ModItems.eyeOdin));
    }
}
