
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lightninglotad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import lightninglotad.LightninglotadMod;

public class LightninglotadModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LightninglotadMod.MODID);
	public static final RegistryObject<CreativeModeTab> LIGHTNING_LOTAD_TAB = REGISTRY.register("lightning_lotad_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lightninglotad.lightning_lotad_tab")).icon(() -> new ItemStack(LightninglotadModItems.DERPOSITYBATTLEAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LightninglotadModItems.DERPOSITYSWORD.get());
				tabData.accept(LightninglotadModItems.DERPOSITYPICKAXE.get());
				tabData.accept(LightninglotadModItems.DERPOSITYAXE.get());
				tabData.accept(LightninglotadModItems.DERPOSITYSHOVEL.get());
				tabData.accept(LightninglotadModItems.DERPOSITYHOE.get());
				tabData.accept(LightninglotadModItems.DANES_SWORD.get());
				tabData.accept(LightninglotadModItems.RUBY_SWORD.get());
				tabData.accept(LightninglotadModItems.RUBY_PICKAXE.get());
				tabData.accept(LightninglotadModItems.RUBY_AXE.get());
				tabData.accept(LightninglotadModItems.RUBY_SHOVEL.get());
				tabData.accept(LightninglotadModItems.RUBY_HOE.get());
				tabData.accept(LightninglotadModItems.EMERALD_SWORD.get());
				tabData.accept(LightninglotadModItems.EMERALD_PICKAXE.get());
				tabData.accept(LightninglotadModItems.EMERALD_AXE.get());
				tabData.accept(LightninglotadModItems.EMERALD_SHOVEL.get());
				tabData.accept(LightninglotadModItems.EMERALD_HOE.get());
				tabData.accept(LightninglotadModItems.DERPOSITY_HELMET.get());
				tabData.accept(LightninglotadModItems.DERPOSITY_CHESTPLATE.get());
				tabData.accept(LightninglotadModItems.DERPOSITY_LEGGINGS.get());
				tabData.accept(LightninglotadModItems.DERPOSITY_BOOTS.get());
				tabData.accept(LightninglotadModItems.RUBY_ARMOR_HELMET.get());
				tabData.accept(LightninglotadModItems.RUBY_ARMOR_CHESTPLATE.get());
				tabData.accept(LightninglotadModItems.RUBY_ARMOR_LEGGINGS.get());
				tabData.accept(LightninglotadModItems.RUBY_ARMOR_BOOTS.get());
				tabData.accept(LightninglotadModItems.EMERALD_ARMOR_HELMET.get());
				tabData.accept(LightninglotadModItems.EMERALD_ARMOR_CHESTPLATE.get());
				tabData.accept(LightninglotadModItems.EMERALD_ARMOR_LEGGINGS.get());
				tabData.accept(LightninglotadModItems.EMERALD_ARMOR_BOOTS.get());
				tabData.accept(LightninglotadModItems.WOOD_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.STONE_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.IRON_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.GOLD_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.DIAMOND_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.NETHERITE_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.RUBY_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.EMERALD_BATTLEAXE.get());
				tabData.accept(LightninglotadModItems.DERPOSITYBATTLEAXE.get());
				tabData.accept(LightninglotadModItems.DERPOSITYGEM.get());
				tabData.accept(LightninglotadModItems.DANE_GEM.get());
				tabData.accept(LightninglotadModItems.RUBY.get());
				tabData.accept(LightninglotadModItems.REFINED_RUBY.get());
				tabData.accept(LightninglotadModBlocks.DERPOSITYSTONE.get().asItem());
				tabData.accept(LightninglotadModBlocks.DERPOSITY_COBBLESTONE.get().asItem());
				tabData.accept(LightninglotadModBlocks.DERPOSITYORE.get().asItem());
				tabData.accept(LightninglotadModBlocks.DERPOSITY_BLOCK.get().asItem());
				tabData.accept(LightninglotadModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(LightninglotadModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(LightninglotadModItems.DERPOSITYSTICK.get());
				tabData.accept(LightninglotadModItems.PURPLEDERPOSITYSTICK.get());
				tabData.accept(LightninglotadModItems.PIG_LOTAD_SPAWN_EGG.get());
			})

					.build());
}
