
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package lightninglotad.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import lightninglotad.client.renderer.PigLotadRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LightninglotadModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LightninglotadModEntities.PIG_LOTAD.get(), PigLotadRenderer::new);
	}
}
