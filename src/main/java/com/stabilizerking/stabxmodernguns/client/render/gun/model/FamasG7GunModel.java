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


public class FamasG7GunModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.

        RenderUtil.renderModel(SpecialModels.FAMAS_G7.getModel(), stack, matrix, renderingbuffer, light, overlay);

        //So I wanna make the Iron Sights Go Dissapear so in that case imma doing a RenderModel method.In here we use two diffrent models that will render on a stupid gun
        if (Gun.getScope(stack) == null) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_IRONSIGHTS.getModel(), stack, matrix, renderingbuffer, light, overlay);
        } else {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_IRONSIGHTS_MOUNT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // First we will do a barrel IF this works
        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_ADVANCED_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_ADVANCED_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        //In case of the any attachment is not putted
        else {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_DEFAULT_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//

        //First it will render the default barrel . if any attachment is putted  it wil render the specific attachment

               if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
               if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_SKELETON_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
               if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


               if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

              if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }






        //------------------------------------------------------------ Stock part--------------------------------------------------------------------//
        // Now We  will not same behavior with stock
        if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get()) {
            //Rendering From The MrCrayFishes Gun Mod itself
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }  if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.TACTICAL_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        }  if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Now Rendering thingy From My mod Stocks

        }  if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.MEDIUM_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }  if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.ANTI_RECOIl_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_ANTI_RECOIl_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }  if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.HEAVY_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.FAMAS_G7_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }

        //In case of the any attachment is not putted






        matrix.pushPose();
        //Donot touch this line if you have a gun charging handle.
        matrix.translate(0, -5.8 * 0.0625, 0);

        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());
        cooldown = (float) ease(cooldown);

        /**
         Now I wanna Move The charging Handle For this we will Just Move it back and forth so
         Use Z for Moving back and Forth . While the X is for  left and right , and Y is for Up and Down :) This Math thingy is provided by bomb guy 767 so credits goes to him and thanks for letting me use this
         */
        //So the CoolDown Thingy Controls the Distance of the charging handle The less number larger the distance
        //the Higher the number the shorter the distance
        matrix.translate(0, 0, cooldown/2.5);
        matrix.translate(0, 5.8 * 0.0625, 0);
        //This Thingy will render the Famas  Charging handle.
        RenderUtil.renderModel(SpecialModels.FAMAS_G7_CHARGING_HANDLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        //Always pop
        matrix.popPose();



        //Again this time it is teh bolt release why am I adding so many features I hate myself
        matrix.pushPose();
        matrix.translate(0, 0, cooldown/5);
        RenderUtil.renderModel(SpecialModels.FAMAS_G7_BOLT_RELEASE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        matrix.popPose();
    }
    private double ease(double x) {

        return 1 - Math.pow(1 - (2 * x), 4);

    }

}