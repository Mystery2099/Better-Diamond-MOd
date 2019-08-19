package com.mystery2099.betterdiamondmod;

import com.mystery2099.betterdiamondmod.proxy.CommonProxy;
import com.mystery2099.betterdiamondmod.tabs.BetterDiamondTab;
import com.mystery2099.betterdiamondmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	//Tabs
	public static final CreativeTabs betterdiamondtab = new BetterDiamondTab("betterdiamondtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PosteInit(FMLInitializationEvent event)
	{
		
	}

}
