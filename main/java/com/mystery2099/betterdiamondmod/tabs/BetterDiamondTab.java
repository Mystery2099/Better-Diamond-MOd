package com.mystery2099.betterdiamondmod.tabs;

import com.mystery2099.betterdiamondmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterDiamondTab extends CreativeTabs 
{
	public BetterDiamondTab(String label) { super("betterdiamondtab");
	this.setBackgroundImageName("betterdiamondtab.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.BETTER_DIAMOND);}
}