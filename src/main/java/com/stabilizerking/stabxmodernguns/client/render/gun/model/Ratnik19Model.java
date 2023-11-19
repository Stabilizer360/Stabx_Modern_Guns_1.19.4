package com.stabilizerking.stabxmodernguns.client.render.gun.model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.mrcrayfish.guns.common.Gun;
import com.mrcrayfish.guns.init.ModItems;
import com.mrcrayfish.guns.item.BarrelItem;
import com.mrcrayfish.guns.item.attachment.IAttachment;
import com.stabilizerking.stabxmodernguns.client.SpecialModels;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;


public class Ratnik19Model implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){

        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.RATNIK19.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //Now we want to Render Specific parts of a gun when you put attachments

      //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // First we will do a barrel IF this works
        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get())
        {
            RenderUtil.renderModel(SpecialModels.RATIK19_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get())
        {
            RenderUtil.renderModel(SpecialModels.RATIK19_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        //In case of the any attachment is not putted
        else {
            RenderUtil.renderModel(SpecialModels.RATIK19_MUZZLE_DEFAULT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//

        //Rendering of underbarrel parts goes here, When you put the grips of other mod attachments I have to make them compatible
        //Anyways we will  just hide the default models inside the gun while still showing the redered icons
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_SKELETON_FOREGRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_VERTICAL_FOREGRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        // Now the parts from when you put from Mrcrayfishes fun mod it will just show the default models so I dont waste my more time  in deveploment

        //Even if you put the Light grip attachment from CGM gun mod it will still render the same model :))) becuase i set it that way

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.RATIK19_VERTICAL_FOREGRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        if(entity.equals(Minecraft.getInstance().player)) {

            matrix.pushPose();
            matrix.translate(0, -5.8 * 0.0625, 0);
            //Gets the cooldown tracker for the item. Items like swords and enderpearls also have this.
            ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
            float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
            cooldown = (float) ease(cooldown);

            matrix.translate(0, 0, cooldown/4);
            matrix.translate(0, 5.8 * 0.0625, 0);
            //Renders the moving part of the gun.
            RenderUtil.renderModel(SpecialModels.RATNIK19_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Always pop
            matrix.popPose();

        }

    }

    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}