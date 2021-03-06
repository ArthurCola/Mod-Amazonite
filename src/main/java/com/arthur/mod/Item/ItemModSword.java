package com.arthur.mod.Item;

import com.arthur.mod.init.ItemsMod;
import com.google.common.collect.Multimap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModSword extends ItemSword
{
    public ItemModSword(ToolMaterial material)
    {
        super(material);
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer)entity;
            ItemStack equipped = player.getCurrentEquippedItem();

            if(equipped == stack)
            {
                player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100));
            }
        }
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsMod.swordMod || repair.getItem() == ItemsMod.amazoniteitem)
        {
            return true;
        }
        return false;
    }
    
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", 8.0F, 0));
        return multimap;
    }
}