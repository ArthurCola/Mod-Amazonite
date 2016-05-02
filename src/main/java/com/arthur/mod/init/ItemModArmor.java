package com.arthur.mod.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.arthur.mod.Reference;

public class ItemModArmor extends ItemArmor
{
	
	    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	    {
	        
	    }

    public ItemModArmor(ArmorMaterial material, int armorType)
    {
        super(material,0 , armorType);
        
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ItemsMod.amazoniteLeggings)
		{
			return Reference.Mod_ID + ":textures/models/armor/armorMod_layer_2.png";
		}
		else if (stack.getItem() == ItemsMod.amazoniteHelmet || stack.getItem() == ItemsMod.amazoniteChestplate || stack.getItem() == ItemsMod.amazoniteBoots);
        return Reference.Mod_ID + ":textures/models/armor/armorMod_layer_1.png";
}

	public boolean getIsRepairable(ItemStack input, ItemStack repair)
	{
		if(repair.getItem() == ItemsMod.amazoniteHelmet || repair.getItem() == ItemsMod.amazoniteitem)
		if(repair.getItem() == ItemsMod.amazoniteChestplate || repair.getItem() == ItemsMod.amazoniteitem)
		if(repair.getItem() == ItemsMod.amazoniteLeggings || repair.getItem() == ItemsMod.amazoniteitem)
		if(repair.getItem() == ItemsMod.amazoniteBoots || repair.getItem() == ItemsMod.amazoniteitem)

		{
			return true;
		}
		return false;
		
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
	    ItemStack boots = player.getEquipmentInSlot(1);
        ItemStack leggings = player.getEquipmentInSlot(2);
        ItemStack chestPlate = player.getEquipmentInSlot(3);
        ItemStack helmet = player.getEquipmentInSlot(4);

        if(boots != null && boots.getItem() == ItemsMod.amazoniteBoots && leggings != null && leggings.getItem() == ItemsMod.amazoniteLeggings && chestPlate != null && chestPlate.getItem() == ItemsMod.amazoniteChestplate && helmet != null && helmet.getItem() == ItemsMod.amazoniteHelmet)
        {
        	
        	player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1, false, false)); 
        	
        }
	
    }
	
	}

