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

import java.util.Vector;


public class AWMRifleModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){

        //This is a Main Gun Model
        RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM.getModel(), stack, matrix, renderingbuffer, light, overlay);

        if(entity.equals(Minecraft.getInstance().player)) {

            matrix.pushPose();
            ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
            float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
            cooldown = (float) ease(cooldown);
            // Now The AWM has a stupid bolt and everytime it fires it rotates  into a 45 degree angle to make a bolt action animation
            if (cooldown != 0) {
                matrix.translate(-0.236, -0.098, cooldown/6);
                matrix.mulPose(Axis.ZN.rotationDegrees(-45F));
            }
            //Renders the moving part of the gun.
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_BOLT.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Always pop
            matrix.popPose();

           // Now the Awm has an Chamber behind it so it will move regularly

            matrix.pushPose();
            matrix.translate(0, 0, cooldown/6);
            //Renders the moving part of the gun.
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_BOLT_CHAMBER.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Always pop
            matrix.popPose();

        }

    }

    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}