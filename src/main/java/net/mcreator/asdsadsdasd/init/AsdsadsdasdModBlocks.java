
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.asdsadsdasd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.asdsadsdasd.block.AsdsadBlock;
import net.mcreator.asdsadsdasd.AsdsadsdasdMod;

public class AsdsadsdasdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AsdsadsdasdMod.MODID);
	public static final RegistryObject<Block> ASDSAD = REGISTRY.register("asdsad", () -> new AsdsadBlock());
}
