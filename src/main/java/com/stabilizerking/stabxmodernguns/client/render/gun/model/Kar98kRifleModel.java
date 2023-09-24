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


public class Kar98kRifleModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.KAR98K.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Disappear so in that case imma doing a RenderModel method.In here we use two different models that will render on a stupid gun

        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.KAR98K_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.KAR98K_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        //Always push
        matrix.pushPose();
        //Don't touch this, it's better to use the display options in Blockbench.
        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());

        if (cooldown != 0 && cooldown < 0.86) {

            matrix.translate(-0.2165, -0.0900, 0);
            matrix.mulPose(Axis.ZN.rotationDegrees(-45F));

            if (cooldown < 0.74 && cooldown > 0.42)
                matrix.translate(0, 0, (-cooldown+0.74)/1.5);
            if (cooldown < 0.42 && cooldown > 0.07)
                matrix.translate(0, 0, (cooldown-0.07)/1.5);

        }
        //Renders the moving part of the gun.
        RenderUtil.renderModel(SpecialModels.KAR98k_BOLT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();


    }
}