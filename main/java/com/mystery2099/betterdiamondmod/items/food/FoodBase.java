package com.mystery2099.betterdiamondmod.items.food;

import com.mystery2099.betterdiamondmod.Main;
import com.mystery2099.betterdiamondmod.init.ModItems;
import com.mystery2099.betterdiamondmod.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	
	public FoodBase(String name, int ammount, float saturation, boolean isAnimalFood)
	{
		super(ammount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.betterdiamondtab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
}
