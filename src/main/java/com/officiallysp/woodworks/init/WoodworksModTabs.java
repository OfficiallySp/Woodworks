
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
			tabData.accept(WoodworksModBlocks.BEECH_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.STRIPPED_WILLOW_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_BUTTON.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_WOOD.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_LOG.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_PLANKS.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_STAIRS.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_SLAB.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_FENCE.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_FENCE_GATE.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_PRESSURE_PLATE.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(WoodworksModBlocks.WOODWORKER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(WoodworksModBlocks.MAPLE_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.PINE_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.CEDAR_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.PALM_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.MANGO_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.RUBBER_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.WILLOW_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.JOSHUA_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.BAOBAB_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.CACTUS_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.MAHOGANY_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.TEAK_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.KAPOK_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.MAPLE_FALL_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.BEECH_FALL_LEAVES.get().asItem());
			tabData.accept(WoodworksModBlocks.ASPEN_FALL_LEAVES.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(WoodworksModItems.MANGO.get());
		}
	}
}
