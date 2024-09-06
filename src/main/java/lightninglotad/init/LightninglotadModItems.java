
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lightninglotad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import lightninglotad.item.WoodBattleaxeItem;
import lightninglotad.item.StoneBattleaxeItem;
import lightninglotad.item.RubySwordItem;
import lightninglotad.item.RubyShovelItem;
import lightninglotad.item.RubyPickaxeItem;
import lightninglotad.item.RubyItem;
import lightninglotad.item.RubyHoeItem;
import lightninglotad.item.RubyBattleaxeItem;
import lightninglotad.item.RubyAxeItem;
import lightninglotad.item.RubyArmorItem;
import lightninglotad.item.RefinedRubyItem;
import lightninglotad.item.RawLotadItem;
import lightninglotad.item.PurplederpositystickItem;
import lightninglotad.item.NetheriteBattleaxeItem;
import lightninglotad.item.IronBattleaxeItem;
import lightninglotad.item.GoldBattleaxeItem;
import lightninglotad.item.EmeraldSwordItem;
import lightninglotad.item.EmeraldShovelItem;
import lightninglotad.item.EmeraldPickaxeItem;
import lightninglotad.item.EmeraldHoeItem;
import lightninglotad.item.EmeraldBattleaxeItem;
import lightninglotad.item.EmeraldAxeItem;
import lightninglotad.item.EmeraldArmorItem;
import lightninglotad.item.DiamondBattleaxeItem;
import lightninglotad.item.DerposityswordItem;
import lightninglotad.item.DerpositystickItem;
import lightninglotad.item.DerposityshovelItem;
import lightninglotad.item.DerpositypickaxeItem;
import lightninglotad.item.DerposityhoeItem;
import lightninglotad.item.DerpositygemItem;
import lightninglotad.item.DerpositybattleaxeItem;
import lightninglotad.item.DerposityaxeItem;
import lightninglotad.item.DerposityItem;
import lightninglotad.item.DerposityBattleaxeOPItem;
import lightninglotad.item.DanesSwordItem;
import lightninglotad.item.DaneGemItem;
import lightninglotad.item.CookedLotadItem;

import lightninglotad.LightninglotadMod;

public class LightninglotadModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LightninglotadMod.MODID);
	public static final RegistryObject<Item> DERPOSITYSWORD = REGISTRY.register("derpositysword", () -> new DerposityswordItem());
	public static final RegistryObject<Item> DERPOSITYPICKAXE = REGISTRY.register("derpositypickaxe", () -> new DerpositypickaxeItem());
	public static final RegistryObject<Item> DERPOSITYAXE = REGISTRY.register("derposityaxe", () -> new DerposityaxeItem());
	public static final RegistryObject<Item> DERPOSITYSHOVEL = REGISTRY.register("derposityshovel", () -> new DerposityshovelItem());
	public static final RegistryObject<Item> DERPOSITYHOE = REGISTRY.register("derposityhoe", () -> new DerposityhoeItem());
	public static final RegistryObject<Item> DANES_SWORD = REGISTRY.register("danes_sword", () -> new DanesSwordItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> EMERALD_PICKAXE = REGISTRY.register("emerald_pickaxe", () -> new EmeraldPickaxeItem());
	public static final RegistryObject<Item> EMERALD_AXE = REGISTRY.register("emerald_axe", () -> new EmeraldAxeItem());
	public static final RegistryObject<Item> EMERALD_SHOVEL = REGISTRY.register("emerald_shovel", () -> new EmeraldShovelItem());
	public static final RegistryObject<Item> EMERALD_HOE = REGISTRY.register("emerald_hoe", () -> new EmeraldHoeItem());
	public static final RegistryObject<Item> DERPOSITY_HELMET = REGISTRY.register("derposity_helmet", () -> new DerposityItem.Helmet());
	public static final RegistryObject<Item> DERPOSITY_CHESTPLATE = REGISTRY.register("derposity_chestplate", () -> new DerposityItem.Chestplate());
	public static final RegistryObject<Item> DERPOSITY_LEGGINGS = REGISTRY.register("derposity_leggings", () -> new DerposityItem.Leggings());
	public static final RegistryObject<Item> DERPOSITY_BOOTS = REGISTRY.register("derposity_boots", () -> new DerposityItem.Boots());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> EMERALD_ARMOR_HELMET = REGISTRY.register("emerald_armor_helmet", () -> new EmeraldArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_ARMOR_CHESTPLATE = REGISTRY.register("emerald_armor_chestplate", () -> new EmeraldArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_ARMOR_LEGGINGS = REGISTRY.register("emerald_armor_leggings", () -> new EmeraldArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_ARMOR_BOOTS = REGISTRY.register("emerald_armor_boots", () -> new EmeraldArmorItem.Boots());
	public static final RegistryObject<Item> WOOD_BATTLEAXE = REGISTRY.register("wood_battleaxe", () -> new WoodBattleaxeItem());
	public static final RegistryObject<Item> STONE_BATTLEAXE = REGISTRY.register("stone_battleaxe", () -> new StoneBattleaxeItem());
	public static final RegistryObject<Item> IRON_BATTLEAXE = REGISTRY.register("iron_battleaxe", () -> new IronBattleaxeItem());
	public static final RegistryObject<Item> GOLD_BATTLEAXE = REGISTRY.register("gold_battleaxe", () -> new GoldBattleaxeItem());
	public static final RegistryObject<Item> DIAMOND_BATTLEAXE = REGISTRY.register("diamond_battleaxe", () -> new DiamondBattleaxeItem());
	public static final RegistryObject<Item> NETHERITE_BATTLEAXE = REGISTRY.register("netherite_battleaxe", () -> new NetheriteBattleaxeItem());
	public static final RegistryObject<Item> RUBY_BATTLEAXE = REGISTRY.register("ruby_battleaxe", () -> new RubyBattleaxeItem());
	public static final RegistryObject<Item> EMERALD_BATTLEAXE = REGISTRY.register("emerald_battleaxe", () -> new EmeraldBattleaxeItem());
	public static final RegistryObject<Item> DERPOSITYBATTLEAXE = REGISTRY.register("derpositybattleaxe", () -> new DerpositybattleaxeItem());
	public static final RegistryObject<Item> DERPOSITYGEM = REGISTRY.register("derpositygem", () -> new DerpositygemItem());
	public static final RegistryObject<Item> DANE_GEM = REGISTRY.register("dane_gem", () -> new DaneGemItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> REFINED_RUBY = REGISTRY.register("refined_ruby", () -> new RefinedRubyItem());
	public static final RegistryObject<Item> DERPOSITYSTONE = block(LightninglotadModBlocks.DERPOSITYSTONE);
	public static final RegistryObject<Item> DERPOSITY_COBBLESTONE = block(LightninglotadModBlocks.DERPOSITY_COBBLESTONE);
	public static final RegistryObject<Item> DERPOSITYORE = block(LightninglotadModBlocks.DERPOSITYORE);
	public static final RegistryObject<Item> DERPOSITY_BLOCK = block(LightninglotadModBlocks.DERPOSITY_BLOCK);
	public static final RegistryObject<Item> RUBY_ORE = block(LightninglotadModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_BLOCK = block(LightninglotadModBlocks.RUBY_BLOCK);
	public static final RegistryObject<Item> DERPOSITYSTICK = REGISTRY.register("derpositystick", () -> new DerpositystickItem());
	public static final RegistryObject<Item> PURPLEDERPOSITYSTICK = REGISTRY.register("purplederpositystick", () -> new PurplederpositystickItem());
	public static final RegistryObject<Item> PIG_LOTAD_SPAWN_EGG = REGISTRY.register("pig_lotad_spawn_egg", () -> new ForgeSpawnEggItem(LightninglotadModEntities.PIG_LOTAD, -16751732, -13071360, new Item.Properties()));
	public static final RegistryObject<Item> RAW_LOTAD = REGISTRY.register("raw_lotad", () -> new RawLotadItem());
	public static final RegistryObject<Item> COOKED_LOTAD = REGISTRY.register("cooked_lotad", () -> new CookedLotadItem());
	public static final RegistryObject<Item> DERPOSITY_BATTLEAXE_OP = REGISTRY.register("derposity_battleaxe_op", () -> new DerposityBattleaxeOPItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
