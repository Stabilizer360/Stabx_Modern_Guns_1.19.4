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


public class Deaglemk14Model implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
      
        //Renders the static parts of the model.
        RenderUtil.renderModel(SpecialModels.DESERT_EAGLE_MARK_14.getModel(), stack, matrix, renderingbuffer, light, overlay);

        if(entity.equals(Minecraft.getInstance().player)) {

            //Always push
            matrix.pushPose();
            //Gets the cooldown tracker for the item. Items like swords and enderpearls also have this.
            ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
            float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());

            if(Gun.hasAmmo(stack))
                matrix.translate(0, 0, 0.1f * (-4.5 * Math.pow(cooldown-0.5, 2) + 1.125));
            else if(!Gun.hasAmmo(stack)) {

                if(cooldown > 0.5)
                    matrix.translate(0, 0, 0.185f * (-4.5 * Math.pow(cooldown-0.5, 2) + 0.5));
                else
                    matrix.translate(0, 0, 0.185f * (-4.5 * Math.pow(0.5-0.5, 2) + 0.5));

            }
            //Renders the moving part of the gun.
            RenderUtil.renderModel(SpecialModels.DESERT_EAGLE_MARK_14_SLIDER.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Always pop
            matrix.popPose();
        }

    }

}