
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.woodworks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.officiallysp.woodworks.block.entity.WoodworkerBlockEntity;
import com.officiallysp.woodworks.WoodworksMod;

public class WoodworksModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WoodworksMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WOODWORKER = register("woodworker", WoodworksModBlocks.WOODWORKER, WoodworkerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
