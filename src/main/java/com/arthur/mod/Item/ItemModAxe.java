package com.arthur.mod.Item;

import com.arthur.mod.init.ItemsMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemModAxe extends ItemAxe
{
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ItemsMod.axeMod || repair.getItem() == ItemsMod.amazoniteitem)
		{
			return true;
		}
		return false;
	}

    public ItemModAxe(ToolMaterial material)
    {
        super(material);
    }
}