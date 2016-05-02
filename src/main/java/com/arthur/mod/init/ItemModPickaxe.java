package com.arthur.mod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemModPickaxe extends ItemPickaxe
{

	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ItemsMod.pickaxeMod || repair.getItem() == ItemsMod.amazoniteitem)
		{
			return true;
		}
		return false;
	}
	
    public ItemModPickaxe(ToolMaterial material)
    {
        super(material);
    }

}


