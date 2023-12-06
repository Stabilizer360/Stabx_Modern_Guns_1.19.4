package com.stabilizerking.stabxmodernguns.client.render.gun.model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mrcrayfish.guns.client.render.gun.IOverrideModel;
import com.mrcrayfish.guns.client.util.RenderUtil;
import com.mrcrayfish.guns.common.Gun;
import com.mrcrayfish.guns.init.ModItems;
import com.mrcrayfish.guns.item.attachment.IAttachment;
import com.stabilizerking.stabxmodernguns.client.SpecialModels;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;


public class Scar17Model implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        RenderUtil.renderModel(SpecialModels.SCAR_17.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //Checks if therir is no scope putted
        if (Gun.getScope(stack) == null) {
            //firsy renders the default ironsight
            RenderUtil.renderModel(SpecialModels.SCAR_17_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            //when scope is putted it will render the 2nd ironsights model
            RenderUtil.renderModel(SpecialModels.SCAR_17_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // Alright when putting a barrel attachment it will show barel attachment


        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_ADVANCED_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_ADVANCED_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        //In case of any attachment is not putted if I Nine Zero Gun mod releases his new update i will decently add the compatibility
        else {
            RenderUtil.renderModel(SpecialModels.SCAR_17_DEFAULT_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//
        
        //Anyways we will  just hide the default models inside the gun while still showing the redered icons
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_SKELETON_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        // Now the parts from when you put from Mr crayfishes fun mod it will just show the default models, so I don't waste my more time  in development

        //Even if you put the Light grip attachment from CGM gun mod it will still render the same model :))) because I set it that way

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Stock part--------------------------------------------------------------------//
        // Now We  will not same behavior with stock
        if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get()) {
            //Rendering From The MrCrayFishes Gun Mod itself
            RenderUtil.renderModel(SpecialModels.SCAR_17_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.TACTICAL_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

            //Now Rendering thingy From My mod Stocks
        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.MEDIUM_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.ANTI_RECOIl_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_ANTI_RECOIl_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.HEAVY_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.SCAR_17_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        //In case of any attachment is not putted it will render Default stock
        else {
            RenderUtil.renderModel(SpecialModels.SCAR_17_DEFAULT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }



        matrix.pushPose();

        matrix.translate(0, -5.8 * 0.0625, 0);

        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
        cooldown = (float) ease(cooldown);
        /**
         Now I wanna Move The charging Handle For this we will Just Move it back and forth so
         Use Z for Moving back and Forth . While the X is for  left and right , and Y is for Up and Down :) crediit goes to bomb guy 787
         */
        matrix.translate(0, 0, cooldown/3);
        matrix.translate(0, 5.8 * 0.0625, 0);
        //This Thingy will render the M60 Charging handle I Hope this works.
        RenderUtil.renderModel(SpecialModels.SCAR_17_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();

    }
    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}