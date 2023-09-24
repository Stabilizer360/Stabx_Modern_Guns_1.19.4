package com.stabilizerking.stabxmodernguns.client.render.gun.model;


import com.mojang.blaze3d.vertex.PoseStack;
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


public class DragnaovSVDModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        RenderUtil.renderModel(SpecialModels.DRAGNAOV_SVD.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Disappear so in that case imma doing a RenderModel method.In here we use two diffrent models that will render on a stupid gun

        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.DRAGNAOV_SVD_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.DRAGNAOV_SVD_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        //Do not Touch this instead use blockbench once u get the correct view model postion

        matrix.pushPose();
        matrix.translate(0, -5.8 * 0.0625, 0);
        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
        cooldown = (float) ease(cooldown);
        /**
         Now I wanna Move The charging Handle For this we will Just Move it back and forth so
         Use Z for Moving back and Forth . While the X is for  left and right , and Y is for Up and Down :) credit goes to bomb guy 787
         */
        matrix.translate(0, 0, cooldown/7);
        matrix.translate(0, 5.8 * 0.0625, 0);
        //This Thingy will render the M60 Charging handle I Hope this works.
        RenderUtil.renderModel(SpecialModels.DRAGNAOV_SVD_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();

    }
    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}