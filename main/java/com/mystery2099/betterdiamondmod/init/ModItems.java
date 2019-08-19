package com.mystery2099.betterdiamondmod.init;

import java.util.ArrayList;
import java.util.List;

import com.mystery2099.betterdiamondmod.items.ItemBase;
import com.mystery2099.betterdiamondmod.items.armor.ArmorBase;
import com.mystery2099.betterdiamondmod.items.food.FoodBase;
import com.mystery2099.betterdiamondmod.items.food.FoodEffectBase;
import com.mystery2099.betterdiamondmod.items.tools.ToolAxe;
import com.mystery2099.betterdiamondmod.items.tools.ToolHoe;
import com.mystery2099.betterdiamondmod.items.tools.ToolPickaxe;
import com.mystery2099.betterdiamondmod.items.tools.ToolSpade;
import com.mystery2099.betterdiamondmod.items.tools.ToolSword;
import com.mystery2099.betterdiamondmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_BETTER_DIAMOND = EnumHelper.addToolMaterial("material_better_diamond", 3, 6244, 17.0F, 15.0F, 44);
	public static final ArmorMaterial ARMOR_MATERIAL_BETTER_DIAMOND = EnumHelper.addArmorMaterial("armor_material_better_diamond", Reference.MOD_ID + ":better_diamond", 15, new int[] {6, 12, 16, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Items
	public static final Item BETTER_DIAMOND = new ItemBase("better_diamond");
	public static final Item DIAMOND_CHIP = new ItemBase("diamond_chip");
	
	//Tools
	public static final ItemSword BETTER_DIAMOND_SWORD = new ToolSword("better_diamond_sword", MATERIAL_BETTER_DIAMOND);
	public static final ItemSpade BETTER_DIAMOND_SHOVEL = new ToolSpade("better_diamond_shovel", MATERIAL_BETTER_DIAMOND);
	public static final ItemPickaxe BETTER_DIAMOND_PICKAXE = new ToolPickaxe("better_diamond_pickaxe", MATERIAL_BETTER_DIAMOND);
	public static final ItemAxe BETTER_DIAMOND_AXE = new ToolAxe("better_diamond_axe", MATERIAL_BETTER_DIAMOND);
	public static final ItemHoe BETTER_DIAMOND_HOE = new ToolHoe("better_diamond_hoe", MATERIAL_BETTER_DIAMOND);
	
	//Armor
	public static final Item BETTER_DIAMOND_HELMET = new ArmorBase("better_diamond_helmet", ARMOR_MATERIAL_BETTER_DIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static final Item BETTER_DIAMOND_CHESTPLATE = new ArmorBase("better_diamond_chestplate", ARMOR_MATERIAL_BETTER_DIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static final Item BETTER_DIAMOND_LEGGINGSS = new ArmorBase("better_diamond_leggings", ARMOR_MATERIAL_BETTER_DIAMOND, 2, EntityEquipmentSlot.LEGS);
	public static final Item BETTER_DIAMOND_BOOTS = new ArmorBase("better_diamond_boots", ARMOR_MATERIAL_BETTER_DIAMOND, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item DIAMOND_APPLE = new FoodBase("diamond_apple", 12, 12.6F, false);
	public static final Item DIAMOND_APPLE_TWO = new FoodEffectBase("diamond_apple_two", 12, 12.6F, false, new PotionEffect(MobEffects.ABSORPTION, 5*(60*20), 10, false, false));
}
