package com.stabilizerking.stabxmodernguns.common;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.StockItem;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Stock;

public class StockProperties {

    public static final Stock LIGHT_STOCK = (Stock.create(GunModifiers.STABILISED));
    public static final Stock MEDIUM_STOCK = (Stock.create(GunModifiers.BETTER_CONTROL));
    public static final Stock HEAVY_STOCK = (Stock.create(GunModifiers.REDUCED_RECOIL));
    public static final Stock ANTI_RECOIL_STOCk = (Stock.create(GunModifiers.REDUCED_RECOIL));
}
