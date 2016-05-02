package com.arthur.mod.Structure;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.arthur.mod.init.BlockMod;

public class Structure1 
{

	 public boolean genrate(World world, Random random, BlockPos pos)
	    {
	        int x = pos.getX();
	        int y = pos.getY();
	        int z = pos.getZ();
	        
	        if(world.getBlockState(new BlockPos(x, y-1, z)) == Blocks.grass.getDefaultState() && world.isAirBlock(new BlockPos(x, y+7, z)))
	        {
	            world.setBlockState(new BlockPos(x, y, z), BlockMod.amazoniteblock.getDefaultState());
	            
	            //x
	            world.setBlockState(new BlockPos(x, y, z), Blocks.cobblestone.getDefaultState());
	            world.setBlockState(new BlockPos(x+1, y, z), Blocks.cobblestone.getDefaultState());
	            
	            world.setBlockState(new BlockPos(x, y, z), Blocks.cobblestone.getDefaultState());

	            
	            world.setBlockState(new BlockPos(x+1, y, z-1), Blocks.cobblestone.getDefaultState());
	            
	            
	            world.setBlockState(new BlockPos(x-1, y, z-1), Blocks.cobblestone.getDefaultState());
	            
	            return true;
	        }
	        
	        return false;
	    }

}
