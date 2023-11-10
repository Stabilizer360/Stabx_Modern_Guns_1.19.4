package com.stabilizerking.stabxmodernguns.common;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.attachment.impl.Scope;

public class ScopeProperties {

//Now this class Will handle the Scope Properties aswell as the Zoom Intensity  of scopes on how much the screen will be zoomed when aiming
    public static final Scope SIMPLE_SNIPER_SCOPE = Scope.builder().aimFovModifier(0.20F).modifiers(GunModifiers.SLOW_ADS).build();
    public static final Scope ACOG_SIGHT = Scope.builder().aimFovModifier(0.28F).modifiers(GunModifiers.SLOW_ADS).build();
    public static final Scope HOLOGRAPHIC_SIGHT = Scope.builder().aimFovModifier(0.50F).modifiers(GunModifiers.SLOW_ADS).build();
    public static final Scope ZA_MINI_SIGHT = Scope.builder().aimFovModifier(0.57F).modifiers(GunModifiers.SLOW_ADS).build();
    public static final Scope MINI_SIGHT = Scope.builder().aimFovModifier(0.53F).build();
    public static final Scope KOBRA_SIGHT = Scope.builder().aimFovModifier(0.55F).modifiers(GunModifiers.SLOW_ADS).build();


}
