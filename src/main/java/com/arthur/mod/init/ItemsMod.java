package com.arthur.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.arthur.mod.Reference;
import com.arthur.mod.arthur;

public class ItemsMod
{
	private static Item ShovelMod = null;
	public static ToolMaterial toolMod = EnumHelper.addToolMaterial("toolMod", 9, 2060, 10.0F, 3, 15);
    public static ArmorMaterial ItemModArmor = EnumHelper.addArmorMaterial("armorMod", "armorMod", 100, new int[]{4,7, 6, 4}, 11);
    public static ToolMaterial epee = EnumHelper.addToolMaterial("toolMod", 9, 2060, 10.0F, 4, 15);
    
    public static Item amazoniteitem, amazoniteHelmet, amazoniteChestplate, amazoniteLeggings, amazoniteBoots, pickaxeMod, swordMod, Shovel, axeMod;
    
public static void init()
    {  
    amazoniteitem = new Item().setUnlocalizedName("amazoniteitem").setCreativeTab(CreativeTabs.tabMaterials);
    amazoniteHelmet = new ItemModArmor(ItemModArmor, 0).setUnlocalizedName("AmazoniteHelmet").setCreativeTab(CreativeTabs.tabCombat);
    amazoniteChestplate = new ItemModArmor(ItemModArmor, 1).setUnlocalizedName("AmazoniteChestplate").setCreativeTab(CreativeTabs.tabCombat);
    amazoniteLeggings = new ItemModArmor(ItemModArmor, 2).setUnlocalizedName("AmazoniteLeggings").setCreativeTab(CreativeTabs.tabCombat);
    amazoniteBoots = new ItemModArmor(ItemModArmor, 3).setUnlocalizedName("AmazoniteBoots").setCreativeTab(CreativeTabs.tabCombat);
    pickaxeMod = new ItemModPickaxe(toolMod).setUnlocalizedName("pickaxeMod").setCreativeTab(CreativeTabs.tabTools);
    ShovelMod = new ItemModShovel(toolMod).setUnlocalizedName("ShovelMod").setCreativeTab(CreativeTabs.tabTools);
    axeMod = new ItemModAxe(toolMod).setUnlocalizedName("axeMod").setCreativeTab(CreativeTabs.tabTools);
    swordMod = new ItemModSword(epee).setUnlocalizedName("swordMod").setCreativeTab(CreativeTabs.tabCombat);
    }

    public static void register()
    {
       GameRegistry.registerItem(amazoniteitem, "amazoniteitem");
       GameRegistry.registerItem(pickaxeMod, "pickaxeMod");
       GameRegistry.registerItem(swordMod, "swordMod");
       GameRegistry.registerItem(amazoniteHelmet, "AmazoniteHelmet");
       GameRegistry.registerItem(amazoniteChestplate, "AmazoniteChestplate");
       GameRegistry.registerItem(amazoniteLeggings, "AmazoniteLeggings");
       GameRegistry.registerItem(amazoniteBoots, "AmazoniteBoots");
       GameRegistry.registerItem(ShovelMod, "ShovelMod");
       GameRegistry.registerItem(axeMod, "axeMod");
      
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteHelmet, 1), new Object[] {"###", "# #", "   ", '#', ItemsMod.amazoniteitem});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteChestplate, 1), new Object[] {"# #", "###", "###", '#', ItemsMod.amazoniteitem});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteLeggings, 1), new Object[] {"###", "# #", "# #", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteBoots, 1), new Object[] {"# #", "# #", "   ", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.pickaxeMod, 1), new Object[] {"###", " S ", " S ", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.swordMod, 1), new Object[] {" # ", " # ", " S ", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.axeMod, 1), new Object[] {" ##", " S#", " S ", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.ShovelMod, 1), new Object[] {" # ", " S ", " S ", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteHelmet, 1), new Object[] {"   ", "###", "# #", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
       GameRegistry.addRecipe(new ItemStack(ItemsMod.amazoniteBoots, 1), new Object[] {"   ", "# #", "# #", '#', ItemsMod.amazoniteitem, 'S',Items.stick});
    
   
    }
    public static void registerRenders()
    {
        registerRender(amazoniteitem);
        registerRender(swordMod);
        registerRender(pickaxeMod);
        registerRender(amazoniteHelmet);
        registerRender(amazoniteChestplate);
        registerRender(amazoniteLeggings);
        registerRender(amazoniteBoots);
        registerRender(ShovelMod);
        registerRender(axeMod);
    }
    
    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
