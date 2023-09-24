package com.stabilizerking.stabxmodernguns.events;

import com.mrcrayfish.guns.event.GunFireEvent;
import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class M1GrandPingEvent {

    @SubscribeEvent
    public static void postShoot(GunFireEvent event) {

        Player player = event.getEntity();
        ItemStack heldItem = player.getMainHandItem();
        CompoundTag tag = heldItem.getTag();

        if (heldItem.getItem() == ModItemRegisteration.M1_GARAND_REMAKE.get() && tag != null) {

            if (tag.getInt("AmmoCount") == 1)
                event.getEntity().level.playSound(player, player.blockPosition(), ModSoundRegisteration.M1_GARAND_REMAKE_PING.get(), SoundSource.MASTER, 3.0F, 1.0F);

        }
    }
}