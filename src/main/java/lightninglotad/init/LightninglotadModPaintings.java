
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lightninglotad.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import lightninglotad.LightninglotadMod;

public class LightninglotadModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, LightninglotadMod.MODID);
	public static final RegistryObject<PaintingVariant> DERPOSITY_PAINTING = REGISTRY.register("derposity_painting", () -> new PaintingVariant(32, 32));
}
