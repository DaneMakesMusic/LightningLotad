
package lightninglotad.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import lightninglotad.entity.PigLotadEntity;

public class PigLotadRenderer extends MobRenderer<PigLotadEntity, PigModel<PigLotadEntity>> {
	public PigLotadRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PigLotadEntity entity) {
		return new ResourceLocation("lightninglotad:textures/entities/piglotad.png");
	}
}
