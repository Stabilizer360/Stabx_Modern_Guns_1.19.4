package com.stabilizerking.stabxmodernguns.client.render.gun.model;



import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
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

import java.util.Vector;


public class AWMRifleModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){

        //This is a Main Gun Model
        RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM.getModel(), stack, matrix, renderingbuffer, light, overlay);




        //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // so this one does not have the default  barrel so we will just render in a default way without rendering the default model


        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }
        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_ADVANCED_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }
        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_ADVANCED_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//

        //First it will render the default barrel . if any attachment is putted  it wil render the specific sttachment

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_SKELETON_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }



        // Now Frpm  Mrcraysishes gun Mod itself Compatibility
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Stock part--------------------------------------------------------------------//
        // Now We  will not same behavior with stock

        //Rendering From The MrCrayFishes Gun Mod itself
        if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.TACTICAL_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


            //Now Rendering thingy From My mod Stocks
        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.MEDIUM_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.ANTI_RECOIl_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_ANTI_RECOIl_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.HEAVY_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }

        //In case of the any attachment is not putted
        else {
            RenderUtil.renderModel(SpecialModels.ARTIC_WARFARE_MAGNUM_DEFAULT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }





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