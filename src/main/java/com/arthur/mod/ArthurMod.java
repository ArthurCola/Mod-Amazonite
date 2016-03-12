package com.arthur.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.arthur.mod.World.WorldRegister;
import com.arthur.mod.init.BlockMod;
import com.arthur.mod.init.ItemsMod;
import com.arthur.mod.proxy.CommonProxy;

@Mod(modid = Reference.Mod_ID, name = Reference.Mod_NAME, version = Reference.VERSION)

public class ArthurMod
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemsMod.init();
        ItemsMod.register();
        BlockMod.init();
        BlockMod.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        WorldRegister.MainRegistry();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}