
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lightninglotad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import lightninglotad.block.RubyOreBlock;
import lightninglotad.block.RubyBlockBlock;
import lightninglotad.block.DerpositystoneBlock;
import lightninglotad.block.DerposityoreBlock;
import lightninglotad.block.DerposityCobblestoneBlock;
import lightninglotad.block.DerposityBlockBlock;

import lightninglotad.LightninglotadMod;

public class LightninglotadModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LightninglotadMod.MODID);
	public static final RegistryObject<Block> DERPOSITYSTONE = REGISTRY.register("derpositystone", () -> new DerpositystoneBlock());
	public static final RegistryObject<Block> DERPOSITY_COBBLESTONE = REGISTRY.register("derposity_cobblestone", () -> new DerposityCobblestoneBlock());
	public static final RegistryObject<Block> DERPOSITYORE = REGISTRY.register("derposityore", () -> new DerposityoreBlock());
	public static final RegistryObject<Block> DERPOSITY_BLOCK = REGISTRY.register("derposity_block", () -> new DerposityBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
}
