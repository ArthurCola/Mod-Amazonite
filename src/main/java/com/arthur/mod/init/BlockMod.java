package com.arthur.mod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.arthur.mod.Reference;
import com.arthur.mod.Block.Blocks;

public class BlockMod
{
    
	public static Block amazonite, amazoniteblock;

    public static void init()
    {
        amazonite = new Blocks(Material.rock).setUnlocalizedName("amazonite").setCreativeTab(CreativeTabs.tabBlock).setHardness(6);
        amazoniteblock = new Blocks(Material.iron).setUnlocalizedName("amazoniteblock").setCreativeTab(CreativeTabs.tabBlock).setHardness(7);
    }

   

	public static void register()
    {
        GameRegistry.registerBlock(amazonite, amazonite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(amazoniteblock, amazoniteblock.getUnlocalizedName().substring(5));
        GameRegistry.addSmelting(BlockMod.amazonite, new ItemStack(ItemsMod.amazoniteitem, 1), 0.5F);
        GameRegistry.addRecipe(new ItemStack(BlockMod.amazoniteblock, 1), new Object[] {"###", "###", "###", '#', ItemsMod.amazoniteitem});
        GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteitem, 9), new Object[] {"   ", " # ", "   ", '#', BlockMod.amazoniteblock});
        GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteitem, 9), new Object[] {"   ", "#  ", "   ", '#', BlockMod.amazoniteblock});
    }

    public static void registerRenders()
    {
        registerRender(amazonite);
        registerRender(amazoniteblock);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}