package com.stabilizerking.stabxmodernguns.client.render.gun.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.mrcrayfish.guns.common.Gun;
import com.stabilizerking.stabxmodernguns.client.SpecialModels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;


public class ArisakaType99GunModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.

        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.ARISAKA_TYPE_99.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Disappear so in that case imma doing a RenderModel method.In here we use two different models that will render on a stupid gun

        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.ARISAKA_TYPE_99_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.ARISAKA_TYPE_99_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        //Some if and that Helper methods idk if they work but they will so imma be storing them here

        //Always push
        matrix.pushPose();
        //Don't touch this, it's better to use the display options in Blockbench.
        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());

        if (cooldown != 0 && cooldown < 0.86) {

            matrix.translate(-0.1499, -0.0640, 0);
            matrix.mulPose(Axis.ZN.rotationDegrees(-45F));

            if (cooldown < 0.74 && cooldown > 0.42)
                matrix.translate(0, 0, (-cooldown+0.74)/4);
            if (cooldown < 0.42 && cooldown > 0.07)
                matrix.translate(0, 0, (cooldown-0.07)/4);

        }
        //Renders the moving part of the gun.
        RenderUtil.renderModel(SpecialModels.ARISAKA_TYPE_99_BOLT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();


    }
}