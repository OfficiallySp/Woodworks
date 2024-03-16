
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.woodworks.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.officiallysp.woodworks.WoodworksMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WoodworksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodworksMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(WoodworksModBlocks.MAPLE_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(WoodworksModBlocks.MAPLE_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_LEAVES.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(WoodworksModItems.MANGO.get());
		}
	}
}
