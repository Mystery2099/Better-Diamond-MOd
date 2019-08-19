package com.mystery2099.betterdiamondmod.init;

import java.util.ArrayList;
import java.util.List;

import com.mystery2099.betterdiamondmod.blocks.BetterDiamondBlock;
import com.mystery2099.betterdiamondmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BETTER_DIAMOND_BLOCK = new BetterDiamondBlock("better_diamond_block", Material.IRON);
	
}
