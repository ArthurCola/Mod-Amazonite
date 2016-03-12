package com.arthur.mod.proxy;

import com.arthur.mod.init.BlockMod;
import com.arthur.mod.init.ItemsMod;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {   
       ItemsMod.registerRenders();
       BlockMod.registerRenders();
       
    }
}
