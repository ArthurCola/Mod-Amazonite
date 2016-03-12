package com.arthur.mod.init;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.arthur.mod.World.WorldGen;

public class Structure {
	{
        WorldGen structureGen = new WorldGen();
        GameRegistry.registerWorldGenerator(structureGen, 0);
    }

	public void generate(World world, Random random, BlockPos blockPos) {
		
		
	}

}
