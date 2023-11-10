package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundRegisteration {

    //Now this CLass will be using  for every Single Gun Sounds
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StabxModernGuns.MOD_ID);


    //--------------------------------------------------------------Pistols Gun Sounds-------------------------------------------------------------------------


    public static final RegistryObject<SoundEvent> GLOCK_19C_FIRE = register("item.glock19c.fire");
    public static final RegistryObject<SoundEvent> GLOCK_19C_COCK = register("item.glock19c.cock");
    public static final RegistryObject<SoundEvent> GLOCK_19C_SUPPRESSED = register("item.glock19c.suppressed");


    public static final RegistryObject<SoundEvent> MAGNUM_500_FIRE = register("item.magnum500.fire");
    public static final RegistryObject<SoundEvent> MAGNUM_500_SUPPRESSED = register("item.magnum500.suppressed");
    public static final RegistryObject<SoundEvent> MAGNUM_500_COCK = register("item.magnum500.cock");

    public static final RegistryObject<SoundEvent> DESERT_EAGLE_MARK_14_FIRE = register("item.desert_eagle_mark14.fire");
    public static final RegistryObject<SoundEvent> DESERT_EAGLE_MARK_14_COCK = register("item.desert_eagle_mark14.cock");

    public static final RegistryObject<SoundEvent> M1911A1_FIRE = register("item.m1911a1.fire");
    public static final RegistryObject<SoundEvent> M1911A1_COCK = register("item.m1911a1.cock");
    public static final RegistryObject<SoundEvent> M1911A1_SUPPRESSED = register("item.m1911a1.suppressed");

    public static final RegistryObject<SoundEvent> P226_FIRE = register("item.p226.fire");
    public static final RegistryObject<SoundEvent> P226_COCK = register("item.p226.cock");
    public static final RegistryObject<SoundEvent> P226_SUPPRESSED = register("item.p226.suppressed");

    public static final RegistryObject<SoundEvent> HKUSP45_FIRE = register("item.hkusp45.fire");
    public static final RegistryObject<SoundEvent> HKUSP45_COCK = register("item.hkusp45.cock");
    public static final RegistryObject<SoundEvent> HKUSP45_SUPPRESSED = register("item.hkusp45.suppressed");

    public static final RegistryObject<SoundEvent> BAREETA67_FIRE = register("item.bareeta67.fire");
    public static final RegistryObject<SoundEvent> BAREETA67_COCK = register("item.bareeta67.cock");
    public static final RegistryObject<SoundEvent> BAREETA67_SUPPRESSED = register("item.bareeta67.suppressed");



    //--------------------------------------------------------------SMGs Gun sounds------------------------------------------------------------------------------


    public static final RegistryObject<SoundEvent> MP5_CLASSIC_FIRE = register("item.mp5_classic.fire");
    public static final RegistryObject<SoundEvent> MP5_CLASSIC_COCK = register("item.mp5_classic.cock");
    public static final RegistryObject<SoundEvent> MP5_CLASSIC_SUPPRESSED = register("item.mp5_classic.suppressed");


    public static final RegistryObject<SoundEvent> STRIKER45_FIRE = register("item.striker45.fire");
    public static final RegistryObject<SoundEvent> STRIKER45_COCK = register("item.striker45.cock");
    public static final RegistryObject<SoundEvent> STRIKER45_SUPPRESSED = register("item.striker45.suppressed");


    public static final RegistryObject<SoundEvent> MP40_FIRE = register("item.mp40.fire");
    public static final RegistryObject<SoundEvent> MP40_COCK = register("item.mp40.cock");
    public static final RegistryObject<SoundEvent> TEC9_FIRE = register("item.tec9.fire");
    public static final RegistryObject<SoundEvent> TEC9_COCK = register("item.tec9.cock");
    public static final RegistryObject<SoundEvent> TEC9_SUPPRESSED = register("item.tec9.suppressed");


    public static final RegistryObject<SoundEvent> MP7_FIRE = register("item.zxr_mp7.fire");
    public static final RegistryObject<SoundEvent> MP7_COCK = register("item.zxr_mp7.cock");
    public static final RegistryObject<SoundEvent> Mp7_SUPPRESSED = register("item.zxr_mp7.suppressed");


    public static final RegistryObject<SoundEvent> VECTOR45_FIRE = register("item.vector45.fire");
    public static final RegistryObject<SoundEvent> VECTOR45_COCK = register("item.vector45.cock");
    public static final RegistryObject<SoundEvent> VECTOR45_SUPPRESSED = register("item.vector45.suppressed");


    //--------------------------------------------------------Assault Rifles Gun Sounds-----------------------------------------------------------------------



    public static final RegistryObject<SoundEvent> AK47_FIRE = register("item.ak47.fire");
    public static final RegistryObject<SoundEvent> AK47_COCK = register("item.ak47.cock");
    public static final RegistryObject<SoundEvent> AK47_SUPPRESSED = register("item.ak47.suppressed");

    public static final RegistryObject<SoundEvent> AK74S_FIRE = register("item.ak74s.fire");
    public static final RegistryObject<SoundEvent> AK74S_COCK = register("item.ak74s.cock");
    public static final RegistryObject<SoundEvent> AK74S_SUPPRESSED = register("item.ak74s.suppressed");


    public static final RegistryObject<SoundEvent> AKM_762_FIRE = register("item.akm762.fire");
    public static final RegistryObject<SoundEvent> AKM_762_COCK = register("item.akm762.cock");
    public static final RegistryObject<SoundEvent> AKM_762_SUPPRESSED = register("item.akm762.suppressed");

    public static final RegistryObject<SoundEvent> AKS_74UX_FIRE = register("item.aks74ux.fire");
    public static final RegistryObject<SoundEvent> AKS_74UX_COCK = register("item.aks74ux.cock");
    public static final RegistryObject<SoundEvent> AKS_74UX_SUPPRESSED = register("item.aks74ux.suppressed");

    public static final RegistryObject<SoundEvent> HK416_SIX_FIRE  = register("item.hk416.fire");
    public static final RegistryObject<SoundEvent> HK416_SIX_COCK  = register("item.hk416.cock");
    public static final RegistryObject<SoundEvent> HK416_SIX_SUPPRESSED  = register("item.hk416.suppressed");

    public static final RegistryObject<SoundEvent> STG44_FIRE = register("item.stg44.fire");
    public static final RegistryObject<SoundEvent> STG44_SUPPRESSED = register("item.stg44.suppressed");
    public static final RegistryObject<SoundEvent> STG44_COCK = register("item.stg44.cock");


    public static final RegistryObject<SoundEvent> SCAR17_FIRE = register("item.scar17.fire");
    public static final RegistryObject<SoundEvent> SCAR17_COCK = register("item.scar17.cock");
    public static final RegistryObject<SoundEvent> SCAR17_SUPPRESSED = register("item.scar17.suppressed");

    public static final RegistryObject<SoundEvent> SCAR17HD_FIRE = register("item.scar17hd.fire");
    public static final RegistryObject<SoundEvent> SCAR17HD_COCK = register("item.scar17hd.cock");

    public static final RegistryObject<SoundEvent> MK_MOD_11_FIRE = register("item.mkmod11.fire");
    public static final RegistryObject<SoundEvent> MK_MOD_11_SUPPRESSED = register("item.mkmod11.suppressed");
    public static final RegistryObject<SoundEvent> MK_MOD_11_RELOAD = register("item.mkmod11.reload");
    public static final RegistryObject<SoundEvent> MK_MOD_11_COCK = register("item.mkmod11.cock");

    public static final RegistryObject<SoundEvent> M4_FIRE = register("item.m4.fire");
    public static final RegistryObject<SoundEvent> M4_COCK = register("item.m4.cock");
    public static final RegistryObject<SoundEvent> M4_SUPPRESSED = register("item.m4.suppressed");

    public static final RegistryObject<SoundEvent> M4A1_FIRE = register("item.m4a1.fire");
    public static final RegistryObject<SoundEvent> M4A1_COCK = register("item.m4a1.cock");
    public static final RegistryObject<SoundEvent> M4A1_SUPPRESSED = register("item.m4a1.suppressed");

    public static final RegistryObject<SoundEvent> M16_FIRE = register("item.m16.fire");
    public static final RegistryObject<SoundEvent> M16_COCK = register("item.m16.cock");
    public static final RegistryObject<SoundEvent> M16_SUPPRESSED = register("item.m16.suppressed");

    public static final RegistryObject<SoundEvent> G36C_HD_FIRE = register("item.g36chd.fire");
    public static final RegistryObject<SoundEvent> G36C_HD_COCK = register("item.g36chd.cock");
    public static final RegistryObject<SoundEvent> G36C_HD_SUPPRESSED = register("item.g36chd.suppressed");


    public static final RegistryObject<SoundEvent> ACR_BUSHMASTER_FIRE = register("item.acr_bushmaster.fire");
    public static final RegistryObject<SoundEvent> ACR_BUSHMASTER_COCK = register("item.acr_bushmaster.cock");
    public static final RegistryObject<SoundEvent> ACR_BUSHMASTER_SUPPRESSED = register("item.acr_bushmaster.suppressed");

    public static final RegistryObject<SoundEvent> AUG556_FIRE = register("item.aug556.fire");
    public static final RegistryObject<SoundEvent> AUG556_COCK = register("item.aug556.cock");
    public static final RegistryObject<SoundEvent> AUG556_SUPPRESSED = register("item.aug556.suppressed");

    public static final RegistryObject<SoundEvent> FAMAS_G7_FIRE = register("item.famas_g7.fire");
    public static final RegistryObject<SoundEvent> FAMAS_G7_COCK = register("item.famas_g7.cock");
    public static final RegistryObject<SoundEvent> FAMAS_G7_SUPPRESSED = register("item.famas_g7.suppressed");

    public static final RegistryObject<SoundEvent> HONEYBADGER_FIRE = register("item.honeybadger.fire");
    public static final RegistryObject<SoundEvent> HONEYBADGER_COCK = register("item.honeybadger.cock");
    public static final RegistryObject<SoundEvent> HONEYBADGER_SUPPRESSED = register("item.honeybadger.suppressed");

    public static final RegistryObject<SoundEvent> NZ41_FIRE = register("item.nz41.fire");
    public static final RegistryObject<SoundEvent> NZ41_COCK = register("item.nz41.cock");
    public static final RegistryObject<SoundEvent> NZ41_SUPPRESSED = register("item.nz41.suppressed");

    public static final RegistryObject<SoundEvent> GK57_FIRE = register("item.gk57.fire");
    public static final RegistryObject<SoundEvent> GK57_COCK = register("item.gk57.cock");
    public static final RegistryObject<SoundEvent> GK57_SUPPRESSED = register("item.gk57.suppressed");

    public static final RegistryObject<SoundEvent> AK103_FIRE = register("item.ak_103.fire");
    public static final RegistryObject<SoundEvent> AK103_COCK = register("item.ak_103.cock");
    public static final RegistryObject<SoundEvent> AK103_SUPPRESSED = register("item.ak_103.suppressed");

    public static final RegistryObject<SoundEvent> AZ67_FIRE = register("item.az67.fire");
    public static final RegistryObject<SoundEvent> AZ67_COCK = register("item.az67.cock");
    public static final RegistryObject<SoundEvent> AZ67_SUPPRESSED = register("item.az67.suppressed");


    //-----------------------------------------------------Light Machine gun sounds--------------------------------------------------------------------------



    public static final RegistryObject<SoundEvent> M60_FIRE = register("item.m60.fire");
    public static final RegistryObject<SoundEvent> M60_SUPPRESSED = register("item.m60.suppressed");
    public static final RegistryObject<SoundEvent> M60_COCK = register("item.m60.cock");

    public static final RegistryObject<SoundEvent> BRUEN_MK9_FIRE = register("item.bruen_mk9.fire");
    public static final RegistryObject<SoundEvent> BRUEN_MK9_SUPPRESSED = register("item.bruen_mk9.suppressed");
    public static final RegistryObject<SoundEvent> BRUEN_MK9_COCK = register("item.bruen_mk9.cock");

    public static final RegistryObject<SoundEvent> RPK_FIRE = register("item.rpk.fire");
    public static final RegistryObject<SoundEvent> RPK_SUPPRESSED = register("item.rpk.suppressed");
    public static final RegistryObject<SoundEvent> RPK_COCK = register("item.rpk.cock");


    //-------------------------------------------------------Marksmans Rifle DMRs----------------------------------------------------------------------------




    public static final RegistryObject<SoundEvent> M14_FIRE = register("item.m14.fire");
    public static final RegistryObject<SoundEvent> M14_SUPPRESSED = register("item.m14.suppressed");
    public static final RegistryObject<SoundEvent> M14_COCK = register("item.m14.cock");

    public static final RegistryObject<SoundEvent> SKS_FIRE = register("item.sks.fire");
    public static final RegistryObject<SoundEvent> SKS_SUPPRESSED = register("item.sks.suppressed");
    public static final RegistryObject<SoundEvent> SKS_COCK = register("item.sks.cock");


    //---------------------------------------------------------Rifles Gun Sounds------------------------------------------------------------------------------




    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_99_FIRE = register("item.arisaka_type99.fire");
    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_99_COCK = register("item.arisaka_type99.cock");


    public static final RegistryObject<SoundEvent> M1_GRANDE_FIRE = register("item.m1_grande.fire");
    public static final RegistryObject<SoundEvent> M1_GRANDE_COCK = register("item.m1_grande.cock");
    public static final RegistryObject<SoundEvent> M1_GRANDE_SUPPRESSED = register("item.m1_grande.suppressed");
    public static final RegistryObject<SoundEvent> M1_GRANDE_PING = register("item.m1_grande.ping");

    public static final RegistryObject<SoundEvent> M1_GARAND_REMAKE_FIRE = register("item.m1_garand_remake.fire");
    public static final RegistryObject<SoundEvent> M1_GARAND_REMAKE_COCK = register("item.m1_garand_remake.cock");
    public static final RegistryObject<SoundEvent> M1_GARAND_REMAKE_SUPPRESSED = register("item.m1_garand_remake.suppressed");
    public static final RegistryObject<SoundEvent> M1_GARAND_REMAKE_PING = register("item.m1_garand_remake.ping");


    public static final RegistryObject<SoundEvent> Kar98k_FIRE = register("item.kar98k.fire");
    public static final RegistryObject<SoundEvent> Kar98k_COCK = register("item.kar98k.cock");
    public static final RegistryObject<SoundEvent> Kar98k_SUPPRESSED = register("item.kar98k.suppressed");
    public static final RegistryObject<SoundEvent> Kar98k_RELOAD = register("item.kar98k.reload");





    //---------------------------------------------------------Sniper Gun Sounds----------------------------------------------------------------------------


    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_FIRE = register("item.artic_warfare_magnum.fire");
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_COCK = register("item.artic_warfare_magnum.cock");
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_SUPPRESSED = register("item.artic_warfare_magnum.suppressed");

    public static final RegistryObject<SoundEvent> SPR_FIRE = register("item.spr3608.fire");
    public static final RegistryObject<SoundEvent> SPR_COCK = register("item.spr3608.cock");
    public static final RegistryObject<SoundEvent> SPR_SUPPRESSED = register("item.spr3608.suppressed");

    public static final RegistryObject<SoundEvent> M82_FIRE = register("item.m82.fire");
    public static final RegistryObject<SoundEvent> M82_COCK = register("item.m82.cock");

    public static final RegistryObject<SoundEvent> REMINGTON360_FIRE = register("item.remington360.fire");
    public static final RegistryObject<SoundEvent> REMINGTON360_COCK = register("item.remington360.cock");
    public static final RegistryObject<SoundEvent> REMINGTON360_SUPPRESSED = register("item.remington360.suppressed");

    public static final RegistryObject<SoundEvent> SVD_FIRE = register("item.svd.fire");
    public static final RegistryObject<SoundEvent> SVD_COCK = register("item.svd.cock");
    public static final RegistryObject<SoundEvent> SVD_SUPPRESSED = register("item.svd.suppressed");


    //--------------------------------------------------------------Shotgun Gun Sounds----------------------------------------------------------------



    public static final RegistryObject<SoundEvent> SPAS12_FIRE = register("item.spas12.fire");
    public static final RegistryObject<SoundEvent> SPAS12_COCK = register("item.spas12.cock");
    public static final RegistryObject<SoundEvent> SPAS12_RELOAD = register("item.spas12.reload");
    public static final RegistryObject<SoundEvent> SPAS12_SUPPRESSED = register("item.spas12.suppressed");


    public static final RegistryObject<SoundEvent> AA12UX_FIRE = register("item.aa12ux.fire");
    public static final RegistryObject<SoundEvent> AA12UX_COCK = register("item.aa12ux.cock");
    public static final RegistryObject<SoundEvent> AA12UX_SUPPRESSED = register("item.aa12ux.suppressed");

    public static final RegistryObject<SoundEvent> BENELLI_M4_FIRE = register("item.benelli_m4.fire");
    public static final RegistryObject<SoundEvent> BENELLI_M4_COCK = register("item.benelli_m4.cock");
    public static final RegistryObject<SoundEvent> BENELLI_M4_SUPPRESSED = register("item.benelli_m4.suppressed");
    public static final RegistryObject<SoundEvent> BENELLI_M4_RELOAD = register("item.benelli_m4.reload");

    public static final RegistryObject<SoundEvent> MOSSBERG500_FIRE = register("item.mossberg500.fire");
    public static final RegistryObject<SoundEvent> MOSSBERG500_COCK = register("item.mossberg500.cock");
    public static final RegistryObject<SoundEvent> MOSSBERG500_SUPPRESSED = register("item.mossberg500.suppressed");
    public static final RegistryObject<SoundEvent> MOSSBERG500_RELOAD = register("item.mossberg500.reload");

    public static final RegistryObject<SoundEvent> SHORTY_FIRE = register("item.shorty.fire");
    public static final RegistryObject<SoundEvent> SHORTY_COCK = register("item.shorty.cock");
    public static final RegistryObject<SoundEvent> SHORTY_SUPPRESSED = register("item.shorty.suppressed");
    public static final RegistryObject<SoundEvent> SHORTY_RELOAD = register("item.shorty.reload");






    //------------------------------------------------Misc Other Sounds---------------------------------------------------------------------------------------


    public static final RegistryObject<SoundEvent> MK_170_CROSSBOW_FIRE = register("item.mk_170_crossbow.fire");
    public static final RegistryObject<SoundEvent> MK_170_CROSSBOW_COCK = register("item.mk_170_crossbow.cock");

    public static final RegistryObject<SoundEvent> FIRE_MODE_SWITCHER = register("item.fire_mode_switcher");
    public static final RegistryObject<SoundEvent> GUN_SAFETY_MODE = register("item.gun_safety_mode");
    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(StabxModernGuns.MOD_ID, name)));
    }
}
