package com.stabilizerking.stabxmodernguns.client.render.gun.model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.stabilizerking.stabxmodernguns.client.SpecialModels;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;


public class SprSniperRifleModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.SPR_3608.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //Always push
        matrix.pushPose();
        //Don't touch this, it's better to use the display options in Blockbench.
        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());

        if (cooldown != 0 && cooldown < 0.86) {

            matrix.translate(-0.1945, -0.0810, 0);
            matrix.mulPose(Axis.ZN.rotationDegrees(-45F));

            if (cooldown < 0.74 && cooldown > 0.42)
                matrix.translate(0, 0, (-cooldown+0.74)/2);
            if (cooldown < 0.42 && cooldown > 0.07)
                matrix.translate(0, 0, (cooldown-0.07)/2);

        }
        //Renders the moving part of the gun.
        RenderUtil.renderModel(SpecialModels.SPR_3608_BOLT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();

    }
}