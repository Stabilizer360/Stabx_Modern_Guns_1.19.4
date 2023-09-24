package com.stabilizerking.stabxmodernguns.utils;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.ItemStack;

public class StabxModUtils {
    public static ItemStack gunWithoutBar(GunItem gun){
        ItemStack itemStack = new ItemStack(gun);
        itemStack.getOrCreateTag().putInt("AmmoCount", gun.getGun().getGeneral().getMaxAmmo());
        return itemStack;
    }
}