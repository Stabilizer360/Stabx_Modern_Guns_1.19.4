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


public class Remington308SniperModel implements IOverrideModel {

    @SuppressWarnings("resource")
    @Override
    public void render(float partialTicks, ItemDisplayContext display, ItemStack stack, ItemStack parent, LivingEntity entity, PoseStack matrix, MultiBufferSource renderingbuffer, int light, int overlay){
        //This is a Main Gun Model.
        RenderUtil.renderModel(SpecialModels.REMINGTON360.getModel(), stack, matrix, renderingbuffer, light, overlay);




        //------------------------------------------------------------ Gun Barrel part--------------------------------------------------------------------//
        // First we will do a barrel IF this works
        if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItems.SILENCER.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_SUPPRESSOR.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_SUPPRESSOR.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } if (Gun.getAttachment(IAttachment.Type.BARREL, stack).getItem() == ModItemRegisteration.ADVANCED_MUZZLE_BRAKE.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_ADVANCED_MUZZLE.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }




        //------------------------------------------------------------ Under Barrel part--------------------------------------------------------------------//

        //First it will render the default barrel . if any attachment is putted  it wil render the specific sttachment

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.ANGLED_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.SKELETON_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_SKELETON_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItemRegisteration.VERTICAL_FOREGRIP.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        // Rendering from Mrcrayfish gun mod itself
        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.LIGHT_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_ANGLED_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }

        if (Gun.getAttachment(IAttachment.Type.UNDER_BARREL, stack).getItem() == ModItems.SPECIALISED_GRIP.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_VERTICAL_GRIP.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        //------------------------------------------------------------ Stock part--------------------------------------------------------------------//
        // Now We  will not same behavior with stock

        //Rendering From The MrCrayFishes Gun Mod itself
        if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);


        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.TACTICAL_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItems.WEIGHTED_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
            //Now Rendering thingy From My mod Stocks

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.LIGHT_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_LIGHT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.MEDIUM_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_MEDIUM_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.ANTI_RECOIl_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_ANTI_RECOIl_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        } else if (Gun.getAttachment(IAttachment.Type.STOCK, stack).getItem() == ModItemRegisteration.HEAVY_STOCK.get()) {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_HEAVY_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);

        }

        //In case of the any attachment is not putted
        else {
            RenderUtil.renderModel(SpecialModels.REMINGTON360_DEFAULT_STOCK.getModel(), stack, matrix, renderingbuffer, light, overlay);
        }


        matrix.pushPose();
        ItemCooldowns tracker = Minecraft.getInstance().player.getCooldowns();
        float cooldown = tracker.getCooldownPercent(stack.getItem(), Minecraft.getInstance().getFrameTime());

        if (cooldown != 0 && cooldown < 0.86) {

            matrix.translate(-0.1945, -0.0810, 0);
            matrix.mulPose(Axis.ZN.rotationDegrees(-45F));

            if (cooldown < 0.74 && cooldown > 0.42)
                matrix.translate(0, 0, (-cooldown+0.74)/2);
            if (cooldown < 0.42 && cooldown > 0.07)
                matrix.translate(0, 0, (cooldown-0.07)/2);

        }
        RenderUtil.renderModel(SpecialModels.REMINGTON360_BOLT.getModel(), stack, matrix, renderingbuffer, light, overlay);
        matrix.popPose();

    }
}