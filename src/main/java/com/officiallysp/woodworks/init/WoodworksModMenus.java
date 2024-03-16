
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.woodworks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.officiallysp.woodworks.world.inventory.WoodworkerGUIMenu;
import com.officiallysp.woodworks.WoodworksMod;

public class WoodworksModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WoodworksMod.MODID);
	public static final RegistryObject<MenuType<WoodworkerGUIMenu>> WOODWORKER_GUI = REGISTRY.register("woodworker_gui", () -> IForgeMenuType.create(WoodworkerGUIMenu::new));
}
