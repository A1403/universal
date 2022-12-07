package net.albert1403.universal.client.renderer;

import net.albert1403.universal.Universal;
import net.albert1403.universal.mobs.earth.DriedMuddyPig;
import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SaddleLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Pig;

public class DriedMuddyPigRenderer extends MobRenderer<DriedMuddyPig, PigModel<Pig>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Universal.MOD_ID, "textures/mob/earth/pig/dried_muddy_pig.png");

    public DriedMuddyPigRenderer(EntityRendererProvider.Context p_174340_) {
        super(p_174340_, new PigModel<>(p_174340_.bakeLayer(ModelLayers.PIG)), 0.7F);
        this.addLayer(new SaddleLayer<>(this, new PigModel<>(p_174340_.bakeLayer(ModelLayers.PIG_SADDLE)), new ResourceLocation("textures/entity/pig/pig_saddle.png")));
    }

    @Override
    public ResourceLocation getTextureLocation(DriedMuddyPig entity) {
        return TEXTURE;
    }
}
