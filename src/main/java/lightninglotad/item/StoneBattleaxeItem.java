
package lightninglotad.item;

import net.minecraftforge.common.crafting.CompoundIngredient;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class StoneBattleaxeItem extends AxeItem {
	public StoneBattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 175;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return CompoundIngredient.of(Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:stone"))), Ingredient.of(new ItemStack(Blocks.COBBLESTONE)), Ingredient.of(new ItemStack(Blocks.MOSSY_COBBLESTONE)));
			}
		}, 1, -3.25f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
