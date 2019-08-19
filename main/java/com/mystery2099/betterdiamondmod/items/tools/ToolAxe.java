package com.mystery2099.betterdiamondmod.items.tools;

import com.mystery2099.betterdiamondmod.Main;
import com.mystery2099.betterdiamondmod.init.ModItems;
import com.mystery2099.betterdiamondmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 9.0F, -3.5F);
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
