
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.woodworks.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.officiallysp.woodworks.client.gui.WoodworkerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WoodworksModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WoodworksModMenus.WOODWORKER_GUI.get(), WoodworkerGUIScreen::new);
		});
	}
}
