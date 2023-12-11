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


public class McxHoneybadgerModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Disappear so in that case imma doing a RenderModel method.In here we use two diffrent models that will render on a stupid gun
        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // Alright when putting a barrel attachment it will show barel attachment


        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }  if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_ADVANCED_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }  if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_ADVANCED_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        //In case of any attachment is not putted if I Nine Zero Gun mod releases his new update i will decently add the compatibility



        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//

        //Anyways we will  just hide the default models inside the gun while still showing the redered icons
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_SKELETON_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        // Now the parts from when you put from Mr crayfishes fun mod it will just show the default models, so I don't waste my more time  in development

        //Even if you put the Light grip attachment from CGM gun mod it will still render the same model :))) because I set it that way

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Stock part--------------------------------------------------------------------//
        // Now We  will not same behavior with stock
        if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get()) {
            //Rendering From The MrCrayFishes Gun Mod itself
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.TACTICAL_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

            //Now Rendering thingy From My mod Stocks
        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.MEDIUM_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.ANTI_RECOIl_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_ANTI_RECOIl_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.HEAVY_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        //In case of any attachment is not putted it will render Default stock
        else {
            RenderUtil.renderModel(SpecialModels.MCX_HONEYBADGER_DEFAULT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }









//Some if and that Helper methods idk if they work but they will so imma be storing them here
        if(entity.equals(Minecraft.getInstance().player)) {
            matrix.pushPose();
            ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
            float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
            cooldown = (float) ease(cooldown);
            matrix.popPose();
        }
    }
    private double ease(double x) {
        return 1 - Math.pow(1 - (2 * x), 4);
    }
}