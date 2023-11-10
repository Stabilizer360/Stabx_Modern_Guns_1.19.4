package com.stabilizerking.stabxmodernguns.client;

import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.mrcrayfish.guns.client.render.gun.model.SimpleModel;
import com.stabilizerking.stabxmodernguns.client.render.gun.model.*;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;

public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ModItemRegisteration.M1_GRANDE.get(), new M1GarandRifleModel());
        ModelOverrides.register(ModItemRegisteration.M4.get(),  new M4Model());
        ModelOverrides.register(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get(), new SimpleModel(SpecialModels.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON::getModel));
        ModelOverrides.register(ModItemRegisteration.GLOCK_19_C.get(), new Glock19cModel());
        ModelOverrides.register(ModItemRegisteration.DESERT_EAGLE_MARK_14.get(), new Deaglemk14Model());
        ModelOverrides.register(ModItemRegisteration.MP5_CLASSIC.get(), new Mp5GunModel());
        ModelOverrides.register(ModItemRegisteration.STRIKER45.get(), new SimpleModel(SpecialModels.STRIKER45::getModel));
        ModelOverrides.register(ModItemRegisteration.MP40.get(), new Mp40GunModel());
        ModelOverrides.register(ModItemRegisteration.TEC9.get(), new SimpleModel(SpecialModels.TEC9::getModel));
        ModelOverrides.register(ModItemRegisteration.HK416.get(), new Hk416Model());
        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new Scar17Model());
        ModelOverrides.register(ModItemRegisteration.AK_47.get(), new Ak47GunModel());
        ModelOverrides.register(ModItemRegisteration.AKM_762.get(), new Akm762GunModel());
        ModelOverrides.register(ModItemRegisteration.AKS_74_UX.get(), new Aks74uxGunModel());
        ModelOverrides.register(ModItemRegisteration.M16.get(),new M16Model());
        ModelOverrides.register(ModItemRegisteration.M4A1.get(), new M4A1Model());
        ModelOverrides.register(ModItemRegisteration.ACR_BUSHMASTER.get(), new ACR360BushmasterModel());
        ModelOverrides.register(ModItemRegisteration.AA_12UX.get(),  new AA12UxModel());
        ModelOverrides.register(ModItemRegisteration.ARISAKA_TYPE_99.get(), new ArisakaType99GunModel());
        ModelOverrides.register(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get(), new AWMRifleModel());
        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new  Scar17Model());
        ModelOverrides.register(ModItemRegisteration.BARRETT_M82.get(), new M82GunModel());
        ModelOverrides.register(ModItemRegisteration.MK_170_CROSSBOW.get(), new SimpleModel(SpecialModels.MK_170_CROSSBOW::getModel));
        ModelOverrides.register(ModItemRegisteration.SCAR17_HD.get(), new Scar17HDGunModel());
        ModelOverrides.register(ModItemRegisteration.FAMAS_G7.get(), new FamasG7GunModel());
        ModelOverrides.register(ModItemRegisteration.KAR98K.get(), new Kar98kRifleModel());
        ModelOverrides.register(ModItemRegisteration.COLT_M1911A1.get(), new M1911A1GunModel());
        ModelOverrides.register(ModItemRegisteration.AUG556.get(), new Aug556GunModel());
        ModelOverrides.register(ModItemRegisteration.MCX_HONEYBADGER.get(), new McxHoneybadgerModel());
        ModelOverrides.register(ModItemRegisteration.ZXR_MP7.get(), new Mp7Model());
        ModelOverrides.register(ModItemRegisteration.SPR_3608.get(), new SprSniperRifleModel());
        ModelOverrides.register(ModItemRegisteration.SKS.get(), new SksMarksmanModel());
        ModelOverrides.register(ModItemRegisteration.M14.get(), new M14GunModel());
        ModelOverrides.register(ModItemRegisteration.M_60.get(), new M60Model());
        ModelOverrides.register(ModItemRegisteration.BAREETA67.get(), new Bareeta67Model());
        ModelOverrides.register(ModItemRegisteration.MODERN_GK57.get(), new GK57Model());
        ModelOverrides.register(ModItemRegisteration.AKS_74.get(), new AKs74Model());
        ModelOverrides.register(ModItemRegisteration.REMINGTON360.get(), new Remington308SniperModel());
        ModelOverrides.register(ModItemRegisteration.HKUSP45.get(), new USP45Model());
        ModelOverrides.register(ModItemRegisteration.P226.get(), new P226Model());
        ModelOverrides.register(ModItemRegisteration.BRUEN_MK9.get(), new BruenMk9Model());
        ModelOverrides.register(ModItemRegisteration.MK_MOD11.get(), new MKMod11CardboardGunModel());
        ModelOverrides.register(ModItemRegisteration.SPAS_12.get(), new Spas12Model());
        ModelOverrides.register(ModItemRegisteration.G36C_HD.get(), new G36cHDGunModel());
        ModelOverrides.register(ModItemRegisteration.SUPER_SHORTY.get(), new SuperShortyModel());
        ModelOverrides.register(ModItemRegisteration.MOSSBERG_500.get(), new Mossberg500Model());
        ModelOverrides.register(ModItemRegisteration.BENELLI_M4.get(), new BenelliM4Model());
        ModelOverrides.register(ModItemRegisteration.NZ41.get(), new Nz41Model());
        ModelOverrides.register(ModItemRegisteration.RPK.get(), new RpkModel());
        ModelOverrides.register(ModItemRegisteration.M1_GARAND_REMAKE.get(), new M1GarandRemakeModel());
        ModelOverrides.register(ModItemRegisteration.VECTOR45.get(), new KrissVector45Model());
        ModelOverrides.register(ModItemRegisteration.STG44.get(), new Stg44Model());
        ModelOverrides.register(ModItemRegisteration.DRAGNAOV_SVD.get(), new DragnaovSVDModel());
        ModelOverrides.register(ModItemRegisteration.AK_103.get(), new AK103Model());
        ModelOverrides.register(ModItemRegisteration.AZ67.get(), new Az67Model());

    }
}
