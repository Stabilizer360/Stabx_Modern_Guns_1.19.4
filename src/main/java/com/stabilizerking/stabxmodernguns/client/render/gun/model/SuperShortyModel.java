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


public class SuperShortyModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){

        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.SUPER_SHORTY.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Disappear so in that case imma doing a RenderModel method.In here we use two diffrent models that will render on a stupid gun

        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.SUPER_SHORTY_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.SUPER_SHORTY_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        matrix.pushPose();
        matrix.translate(0, -5.8 * 0.0625, 0);

        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
        cooldown = (float) ease(cooldown);

        /**
         Now I want to Move The charging Handle For this we will Just Move it back and forth so
         Use Z for Moving back and Forth . While the X is for  left and right , and Y is for Up and Down :) This Math thingy is provided by bomb guy 767 so credits goes to him and thanks for letting me use this   */
        //So the CoolDown Thingy Controls the Distance of the charging handle The lesser the  number larger the distance
        //the Higher the number the shorter the distance
        matrix.translate(0, 0, cooldown/8);
        matrix.translate(0, 5.8 * 0.0625, 0);

        //This Thingy will render the M60 Charging handle I Hope this works.
        RenderUtil.renderModel(SpecialModels.SUPER_SHORTY_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        matrix.popPose();


        // Again this time we have an Pump Action So Everytime we fire a shortgun it pumps soooo makes sense

        matrix.pushPose();
        matrix.translate(0, 0, cooldown/5);
        //Renders the moving part of the gun.
        RenderUtil.renderModel(SpecialModels.SUPER_SHORTY_PUMP_ACTION.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();

    }
    private double ease(double x) {
        return 1 - Math.pow(1 - (2 * x), 4);
    }
}