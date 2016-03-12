package com.arthur.mod.Item;

import com.arthur.mod.init.ItemsMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemModShovel extends ItemSpade
{
    public ItemModShovel(ToolMaterial material)
    {
        super(material);
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsMod.Shovel || repair.getItem() == ItemsMod.amazoniteitem)
        {
            return true;
        }
        return false;
    }
}