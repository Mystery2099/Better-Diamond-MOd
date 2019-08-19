package com.mystery2099.betterdiamondmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BetterDiamondBlock extends BlockBase {

	public BetterDiamondBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.5F);
		setResistance(100.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0f);
		//setLightOpacity(1.0F);
		//setBlockUnbreakable();
	}

}
