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


public class Scar17HDGunModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        RenderUtil.renderModel(SpecialModels.SCAR17_HD.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Dissapear so in that case imma doing a RenderModel method.In here we use two diffrent models that will render on a stupid gun
        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.SCAR17_HD_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            //Now When the Scope is putted on a Gun it will Render a diffrent model which is iron sights mount model.
            RenderUtil.renderModel(SpecialModels.SCAR17_HD_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
            //And this above method will apply on any gun in which i wannna make its iron sights go away when putting a scope

        matrix.pushPose();

        matrix.translate(0, -5.8 * 0.0625, 0);

        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
        cooldown = (float) ease(cooldown);
        /**
         Now I wanna Move The charging Handle For this we will be using a matix Stack math thingy privided by bombguy736
         Use Z for Moving back and Forth . While the X is for  left and right , and Y is for Up and Down :)
         You know how it is It just moving charging handle of Scar 17
         */
        matrix.translate(0, 0, cooldown/3);
        matrix.translate(0, 5.8 * 0.0625, 0);
        //This Thingy will render the Scar 17 Charging handle I Hope this works.
        RenderUtil.renderModel(SpecialModels.SCAR17_HD_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);

        matrix.popPose();

    }
    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}