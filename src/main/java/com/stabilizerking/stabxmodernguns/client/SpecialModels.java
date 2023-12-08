package com.stabilizerking.stabxmodernguns.client;


import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public enum SpecialModels {
    //Now this big ass class will be responsible for registering special models

    //-----------------------------------------------------Pistols---------------------------------------------------------

    FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON ("gun/pistols/500magnum/500magnum_smith_and_wesson"),


    GLOCK_19_C ("gun/pistols/glocks/glock19c"),
    GLOCK_19_C_SLIDER ("gun/pistols/glocks/glock19c_slider_cover"),



    DESERT_EAGLE_MARK_14("gun/pistols/desert_eagle/desert_eagle_mark14"),
    DESERT_EAGLE_MARK_14_SLIDER("gun/pistols/desert_eagle/desert_eagle_mark14_slider"),


    COLT_M1911A1("gun/pistols/m1911a1/colt_m1911a1"),
    COLT_M1911A1_SLIDER("gun/pistols/m1911a1/colt_m1911a1_slider"),



    P226("gun/pistols/p226/p226"),
    P226_SLIDER("gun/pistols/p226/p226_slider"),

    HKUSP45("gun/pistols/usp45/hkusp45"),
    HKUSP45_SLIDER("gun/pistols/usp45/hkusp45_slider"),


    BAREETA67("gun/pistols/bareeta67/bareeta67"),
    Bareeta67_SLIDER("gun/pistols/bareeta67/bareeta67_slider"),



    //------------------------------------------------------------------------SMGs----------------------------------------------------------------------//

    MP5_CLASSIC("gun/smgs/mp5_classic/mp5_classic"),
    MP5_CLASSIC_IRONSIGHTS("gun/smgs/mp5_classic/mp5_classic_ironsights"),
    MP5_CLASSIC_IRONSIGHTS_MOUNT("gun/smgs/mp5_classic/mp5_classic_ironsights_mount"),





    STRIKER45("gun/smgs/striker45/striker45"),





    MP40("gun/smgs/mp40/mp40"),
    MP40_CHARGING_HANDLE("gun/smgs/mp40/mp40_charging_handle"),





    TEC9("gun/smgs/tec9/tec9"),





    KRISS_VECTOR45("gun/smgs/vector45/kriss_vector45"),
    KRISS_VECTOR45_CHARGING_HANDLE("gun/smgs/vector45/kriss_vector45_charging_handle"),
    KRISS_VECTOR45_IRONSIGHTS("gun/smgs/vector45/kriss_vector45_ironsights"),
    KRISS_VECTOR45_IRONSIGHTS_MOUNT("gun/smgs/vector45/kriss_vector45_ironsights_mount"),





    ZXR_MP7("gun/smgs/mp7/zxr_mp7"),
    ZXR_MP7_IRONSIGHTS("gun/smgs/mp7/zxr_mp7_ironsights"),
    ZXR_MP7_IRONSIGHTS_MOUNT("gun/smgs/mp7/zxr_mp7_ironsights_mount"),






    //--------------------------------------------------------------- Assault Rifles---------------------------------------------------------
    AK_47("gun/assault_rifles/aks/ak47/ak47"),
    AK_47_IRONSIGHTS("gun/assault_rifles/aks/ak47/ak47_ironsights"),
    AK_47_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/ak47/ak47_ironsights_mount"),
    AK_47_ADVANCED_MUZZLE("gun/assault_rifles/aks/ak47/ak47_advanced_muzzle"),
    AK_47_ANGLED_GRIP("gun/assault_rifles/aks/ak47/ak47_angled_grip"),
    AK_47_DEFAULT_MUZZLE("gun/assault_rifles/aks/ak47/ak47_default_muzzle"),
    AK_47_DEFAULT_STOCK("gun/assault_rifles/aks/ak47/ak47_default_stock"),
    AK_47_HEAVY_STOCK("gun/assault_rifles/aks/ak47/ak47_heavy_stock"),
    AK_47_LIGHT_STOCK("gun/assault_rifles/aks/ak47/ak47_light_stock"),
    AK_47_MEDIUM_STOCK("gun/assault_rifles/aks/ak47/ak47_medium_stock"),
    AK_47_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ak47/ak47_anti_recoil_stock"),
    AK_47_SKELETON_GRIP("gun/assault_rifles/aks/ak47/ak47_skeleton_grip"),
    AK_47_SUPPRESSOR("gun/assault_rifles/aks/ak47/ak47_suppressor"),
    AK_47_VERTICAL_GRIP("gun/assault_rifles/aks/ak47/ak47_vertical_grip"),
    AK_47_CHARGING_HANDLE("gun/assault_rifles/aks/ak47/ak47_charging_handle"),









    AKM_762("gun/assault_rifles/aks/akm762/akm_762"),
    AKM_762_ADVANCED_MUZZLE("gun/assault_rifles/aks/akm762/akm_762_advanced_muzzle"),
    AKM_762_ANGLED_GRIP("gun/assault_rifles/aks/akm762/akm_762_angled_grip"),
    AKM_762_DEFAULT_MUZZLE("gun/assault_rifles/aks/akm762/akm_762_default_muzzle"),
    AKM_762_DEFAULT_STOCK("gun/assault_rifles/aks/akm762/akm_762_default_stock"),
    AKM_762_HEAVY_STOCK("gun/assault_rifles/aks/akm762/akm_762_heavy_stock"),
    AKM_762_LIGHT_STOCK("gun/assault_rifles/aks/akm762/akm_762_light_stock"),
    AKM_762_MEDIUM_STOCK("gun/assault_rifles/aks/akm762/akm_762_medium_stock"),
    AKM_762_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/akm762/akm_762_anti_recoil_stock"),
    AKM_762_SKELETON_GRIP("gun/assault_rifles/aks/akm762/akm_762_skeleton_grip"),
    AKM_762_SUPPRESSOR("gun/assault_rifles/aks/akm762/akm_762_suppressor"),
    AKM_762_VERTICAL_GRIP("gun/assault_rifles/aks/akm762/akm_762_vertical_grip"),
    AKM_762_CHARGING_HANDLE("gun/assault_rifles/aks/akm762/akm_762_charging_handle"),






    AK_103("gun/assault_rifles/aks/ak_103/ak_103"),
    AK_103_ADVANCED_MUZZLE("gun/assault_rifles/aks/ak_103/ak_103_advanced_muzzle"),
    AK_103_ANGLED_GRIP("gun/assault_rifles/aks/ak_103/ak_103_angled_grip"),
    AK_103_DEFAULT_MUZZLE("gun/assault_rifles/aks/ak_103/ak_103_default_muzzle"),
    AK_103_DEFAULT_STOCK("gun/assault_rifles/aks/ak_103/ak_103_default_stock"),
    AK_103_HEAVY_STOCK("gun/assault_rifles/aks/ak_103/ak_103_heavy_stock"),
    AK_103_LIGHT_STOCK("gun/assault_rifles/aks/ak_103/ak_103_light_stock"),
    AK_103_MEDIUM_STOCK("gun/assault_rifles/aks/ak_103/ak_103_medium_stock"),
    AK_103_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ak_103/ak_103_anti_recoil_stock"),
    AK_103_SKELETON_GRIP("gun/assault_rifles/aks/ak_103/ak_103_skeleton_grip"),
    AK_103_SUPPRESSOR("gun/assault_rifles/aks/ak_103/ak_103_suppressor"),
    AK_103_VERTICAL_GRIP("gun/assault_rifles/aks/ak_103/ak_103_vertical_grip"),
    AK_103_CHARGING_HANDLE("gun/assault_rifles/aks/ak_103/ak_103_charging_handle"),








    AKS_74UX("gun/assault_rifles/aks/aks74ux/aks74ux"),
    AKS_74UX_CHARGING_HANDLE("gun/assault_rifles/aks/aks74ux/aks74ux_charging_handle"),
    AKS_74UX_IRONSIGHTS("gun/assault_rifles/aks/aks74ux/aks74ux_ironsights"),
    AKS_74UX_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/aks74ux/aks74ux_ironsights_mount"),
    AKS_74UX_ADVANCED_MUZZLE("gun/assault_rifles/aks/aks74ux/aks74ux_advanced_muzzle"),
    AKS_74UX_ANGLED_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_angled_grip"),
    AKS_74UX_DEFAULT_MUZZLE("gun/assault_rifles/aks/aks74ux/aks74ux_default_muzzle"),
    AKS_74UX_HEAVY_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_heavy_stock"),
    AKS_74UX_LIGHT_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_light_stock"),
    AKS_74UX_MEDIUM_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_medium_stock"),
    AKS_74UX_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/aks74ux/aks74ux_anti_recoil_stock"),
    AKS_74UX_SKELETON_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_skeleton_grip"),
    AKS_74UX_SUPPRESSOR("gun/assault_rifles/aks/aks74ux/aks74ux_suppressor"),
    AKS_74UX_VERTICAL_GRIP("gun/assault_rifles/aks/aks74ux/aks74ux_vertical_grip"),









    AKS74("gun/assault_rifles/aks/aks74/aks74"),
    AKS74_CHARGING_HANDLE("gun/assault_rifles/aks/aks74/aks74_charging_handle"),
    AKS74_IRONSIGHTS("gun/assault_rifles/aks/aks74/aks74_ironsights"),
    AKS74_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/aks74/aks74_ironsights_mount"),
    AKS74_ADVANCED_MUZZLE("gun/assault_rifles/aks/aks74/aks74_advanced_muzzle"),
    AKS74_ANGLED_GRIP("gun/assault_rifles/aks/aks74/aks74_angled_grip"),
    AKS74_DEFAULT_MUZZLE("gun/assault_rifles/aks/aks74/aks74_default_muzzle"),
    AKS74_DEFAULT_STOCK("gun/assault_rifles/aks/aks74/aks74_default_stock"),
    AKS74_HEAVY_STOCK("gun/assault_rifles/aks/aks74/aks74_heavy_stock"),
    AKS74_LIGHT_STOCK("gun/assault_rifles/aks/aks74/aks74_light_stock"),
    AKS74_MEDIUM_STOCK("gun/assault_rifles/aks/aks74/aks74_medium_stock"),
    AKS74_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/aks74/aks74_anti_recoil_stock"),
    AKS74_SKELETON_GRIP("gun/assault_rifles/aks/aks74/aks74_skeleton_grip"),
    AKS74_SUPPRESSOR("gun/assault_rifles/aks/aks74/aks74_suppressor"),
    AKS74_VERTICAL_GRIP("gun/assault_rifles/aks/aks74/aks74_vertical_grip"),


    RATNIK19("gun/assault_rifles/aks/ratnik19/ratnik19"),
    RATNIK19_ADVANCED_MUZZLE("gun/assault_rifles/aks/ratnik19/ratnik19_advanced_muzzle"),
    RATNIK19_ANGLED_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_angled_grip"),
    RATNIK19_DEFAULT_MUZZLE("gun/assault_rifles/aks/ratnik19/ratnik19_default_muzzle"),
    RATNIK19_DEFAULT_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_default_stock"),
    RATNIK19_HEAVY_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_heavy_stock"),
    RATNIK19_LIGHT_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_light_stock"),
    RATNIK19_MEDIUM_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_medium_stock"),
    RATNIK19_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/ratnik19/ratnik19_anti_recoil_stock"),
    RATNIK19_SKELETON_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_skeleton_grip"),
    RATNIK19_SUPPRESSOR("gun/assault_rifles/aks/ratnik19/ratnik19_suppressor"),
    RATNIK19_VERTICAL_GRIP("gun/assault_rifles/aks/ratnik19/ratnik19_vertical_grip"),
    RATNIK19_CHARGING_HANDLE("gun/assault_rifles/aks/ratnik19/ratnik19_charging_handle"),




    GK57("gun/assault_rifles/aks/gk57/gk57"),
    GK57_CHARGING_HANDLE("gun/assault_rifles/aks/gk57/gk57_charging_handle"),
    GK57_IRONSIGHTS("gun/assault_rifles/aks/gk57/gk57_ironsights"),
    GK57_IRONSIGHTS_MOUNT("gun/assault_rifles/aks/gk57/gk57_ironsights_mount"),
    GK57_ADVANCED_MUZZLE("gun/assault_rifles/aks/gk57/gk57_advanced_muzzle"),
    GK57_ANGLED_GRIP("gun/assault_rifles/aks/gk57/gk57_angled_grip"),
    GK57_DEFAULT_MUZZLE("gun/assault_rifles/aks/gk57/gk57_default_muzzle"),
    GK57_DEFAULT_STOCK("gun/assault_rifles/aks/gk57/gk57_default_stock"),
    GK57_HEAVY_STOCK("gun/assault_rifles/aks/gk57/gk57_heavy_stock"),
    GK57_LIGHT_STOCK("gun/assault_rifles/aks/gk57/gk57_light_stock"),
    GK57_MEDIUM_STOCK("gun/assault_rifles/aks/gk57/gk57_medium_stock"),
    GK57_ANTI_RECOIl_STOCK("gun/assault_rifles/aks/gk57/gk57_anti_recoil_stock"),
    GK57_SKELETON_GRIP("gun/assault_rifles/aks/gk57/gk57_skeleton_grip"),
    GK57_SUPPRESSOR("gun/assault_rifles/aks/gk57/gk57_suppressor"),
    GK57_VERTICAL_GRIP("gun/assault_rifles/aks/gk57/gk57_vertical_grip"),





    M16("gun/assault_rifles/m4s/m16/m16"),
    M16_IRONSIGHTS("gun/assault_rifles/m4s/m16/m16_iron_sights"),
    M16_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m16/m16_ironsights_mount"),
    M16_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m16/m16_advanced_muzzle"),
    M16_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/m16/m16_advanced_suppressor"),
    M16_ANGLED_GRIP("gun/assault_rifles/m4s/m16/m16_angled_grip"),
    M16_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m16/m16_default_muzzle"),
    M16_DEFAULT_STOCK("gun/assault_rifles/m4s/m16/m16_default_stock"),
    M16_HEAVY_STOCK("gun/assault_rifles/m4s/m16/m16_heavy_stock"),
    M16_LIGHT_STOCK("gun/assault_rifles/m4s/m16/m16_light_stock"),
    M16_MEDIUM_STOCK("gun/assault_rifles/m4s/m16/m16_medium_stock"),
    M16_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m16/m16_anti_recoil_stock"),
    M16_SKELETON_GRIP("gun/assault_rifles/m4s/m16/m16_skeleton_grip"),
    M16_SUPPRESSOR("gun/assault_rifles/m4s/m16/m16_suppressor"),
    M16_VERTICAL_GRIP("gun/assault_rifles/m4s/m16/m16_vertical_grip"),



    M4A1("gun/assault_rifles/m4s/m4a1/m4a1"),
    M4A1_IRONSIGHTS("gun/assault_rifles/m4s/m4a1/m4a1_ironsights"),
    M4A1_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m4a1/m4a1_ironsights_mount"),
    M4A1_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m4a1/m4a1_advanced_muzzle"),
    M4A1_ADVANCED_SUPPRESSOR("gun/assault_rifles/m4s/m4a1/m4a1_advanced_suppressor"),
    M4A1_ANGLED_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_angled_grip"),
    M4A1_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m4a1/m4a1_default_muzzle"),
    M4A1_DEFAULT_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_default_stock"),
    M4A1_HEAVY_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_heavy_stock"),
    M4A1_LIGHT_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_light_stock"),
    M4A1_MEDIUM_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_medium_stock"),
    M4A1_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m4a1/m4a1_anti_recoil_stock"),
    M4A1_SKELETON_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_skeleton_grip"),
    M4A1_SUPPRESSOR("gun/assault_rifles/m4s/m4a1/m4a1_suppressor"),
    M4A1_VERTICAL_GRIP("gun/assault_rifles/m4s/m4a1/m4a1_vertical_grip"),









    ACR_BUSHMASTER("gun/assault_rifles/acr/acr_360_bushmaster"),
    ACR_BUSHMASTER_IRONSIGHTS("gun/assault_rifles/acr/acr_360_bushmaster_iron_sights"),
    ACR_BUSHMASTER_IRONSIGHTS_MOUNT("gun/assault_rifles/acr/acr_360_bushmaster_iron_sights_mount"),










    M4("gun/assault_rifles/m4s/m4/m4"),
    M4_IRONSIGHTS("gun/assault_rifles/m4s/m4/m4_ironsights"),
    M4_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/m4/m4_ironsights_mount"),
    M4_ADVANCED_MUZZLE("gun/assault_rifles/m4s/m4/m4_advanced_muzzle"),
    M4_ANGLED_GRIP("gun/assault_rifles/m4s/m4/m4_angled_grip"),
    M4_BOLT_RELEASE("gun/assault_rifles/m4s/m4/m4_bolt_release"),
    M4_DEFAULT_MUZZLE("gun/assault_rifles/m4s/m4/m4_default_muzzle"),
    M4_DEFAULT_STOCK("gun/assault_rifles/m4s/m4/m4_default_stock"),
    M4_HEAVY_STOCK("gun/assault_rifles/m4s/m4/m4_heavy_stock"),
    M4_LIGHT_STOCK("gun/assault_rifles/m4s/m4/m4_light_stock"),
    M4_MEDIUM_STOCK("gun/assault_rifles/m4s/m4/m4_medium_stock"),
    M4_ANTI_RECOIl_STOCK("gun/assault_rifles/m4s/m4/m4_anti_recoil_stock"),
    M4_SKELETON_GRIP("gun/assault_rifles/m4s/m4/m4_skeleton_grip"),
    M4_SUPPRESSOR("gun/assault_rifles/m4s/m4/m4_suppressor"),
    M4_VERTICAL_GRIP("gun/assault_rifles/m4s/m4/m4_vertical_grip"),



    SCAR_17("gun/assault_rifles/scar/scar17"),
    SCAR_17_CHARGING_HANDLE("gun/assault_rifles/scar/scar17_charging_handle"),
    SCAR_17_IRONSIGHTS("gun/assault_rifles/scar/scar17_ironsights"),
    SCAR_17_IRONSIGHTS_MOUNT("gun/assault_rifles/scar/scar17_ironsights_mount"),
    SCAR_17_ADVANCED_MUZZLE("gun/assault_rifles/scar/scar17_advanced_muzzle"),
    SCAR_17_ADVANCED_SUPPRESSOR("gun/assault_rifles/scar/scar17_advanced_suppressor"),
    SCAR_17_ANGLED_GRIP("gun/assault_rifles/scar/scar17_angled_grip"),
    SCAR_17_DEFAULT_MUZZLE("gun/assault_rifles/scar/scar17_default_muzzle"),
    SCAR_17_DEFAULT_STOCK("gun/assault_rifles/scar/scar17_default_stock"),
    SCAR_17_LIGHT_STOCK("gun/assault_rifles/scar/scar17_light_stock"),
    SCAR_17_MEDIUM_STOCK("gun/assault_rifles/scar/scar17_medium_stock"),
    SCAR_17_HEAVY_STOCK("gun/assault_rifles/scar/scar17_heavy_stock"),
    SCAR_17_ANTI_RECOIl_STOCK("gun/assault_rifles/scar/scar17_anti_recoil_stock"),
    SCAR_17_SKELETON_GRIP("gun/assault_rifles/scar/scar17_skeleton_grip"),
    SCAR_17_SUPPRESSOR("gun/assault_rifles/scar/scar17_suppressor"),
    SCAR_17_VERTICAL_GRIP("gun/assault_rifles/scar/scar17_vertical_grip"),



    SCAR17_HD("gun/assault_rifles/scar/scar17hd"),
    SCAR17_HD_CHARGING_HANDLE("gun/assault_rifles/scar/scar17hd_charging_handle"),
    SCAR17_HD_IRONSIGHTS_MOUNT("gun/assault_rifles/scar/scar17hd_ironsights_mount"),
    SCAR17_HD_IRONSIGHTS("gun/assault_rifles/scar/scar17hd_ironsights"),




    FAMAS_G7("gun/assault_rifles/famas/famas_g7"),
    FAMAS_G7_CHARGING_HANDLE("gun/assault_rifles/famas/famas_g7_charging_handle"),
    FAMAS_G7_IRONSIGHTS_MOUNT("gun/assault_rifles/famas/famas_g7_ironsights_mount"),
    FAMAS_G7_IRONSIGHTS("gun/assault_rifles/famas/famas_g7_ironsights"),



    AUG556("gun/assault_rifles/aug/aug556"),
    AUG556_IRONSIGHTS_MOUNT("gun/assault_rifles/aug/aug556_ironsights_mount"),
    AUG556_IRONSIGHTS("gun/assault_rifles/aug/aug556_ironsights"),




    MCX_HONEYBADGER("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger"),
    MCX_HONEYBADGER_IRONSIGHTS("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_iron_sights"),
    MCX_HONEYBADGER_IRONSIGHTS_MOUNT("gun/assault_rifles/honeybadger/mcx_citrus_honeybadger_iron_sights_mount"),


    MK_MOD11("gun/assault_rifles/mkmod11/mkmod11"),
    MK_MOD11_CHARGING_HANDLE("gun/assault_rifles/mkmod11/mkmod11_charging_handle"),
    MK_MOD11_IRONSIGHTS("gun/assault_rifles/mkmod11/mkmod11_ironsights"),
    MK_MOD11_IRONSIGHTS_MOUNT("gun/assault_rifles/mkmod11/mkmod11_ironsights_mount"),






    HK416("gun/assault_rifles/m4s/hk416/hk416"),
    HK416_IRONSIGHTS("gun/assault_rifles/m4s/hk416/hk416_ironsights"),
    HK416_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/hk416/hk416_ironsights_mount"),






    G36C_HD("gun/assault_rifles/g36/g36chd"),
    G36C_HD_CHARGING_HANDLE("gun/assault_rifles/g36/g36chd_charging_handle"),


    NZ41("gun/assault_rifles/nz41/nz41"),
    NZ41_CHARGING_HANDLE("gun/assault_rifles/nz41/nz41_charging_handle"),
    NZ41_IRONSIGHTS("gun/assault_rifles/nz41/nz41_ironsights"),
    NZ41_IRONSIGHTS_MOUNT("gun/assault_rifles/nz41/nz41_ironsights_mount"),


    AZ67("gun/assault_rifles/m4s/az67/az67"),
    AZ67_IRONSIGHTS("gun/assault_rifles/m4s/az67/az67_ironsights"),
    AZ67_IRONSIGHTS_MOUNT("gun/assault_rifles/m4s/az67/az67_ironsights_mount"),



    STG_44("gun/assault_rifles/stg/stg44"),
    STG_44_CHARGING_HANDLE("gun/assault_rifles/stg/stg44_charging_handle"),
    STG_44_IRONSIGHTS("gun/assault_rifles/stg/stg44_ironsights"),
    STG_44_IRONSIGHTS_MOUNT("gun/assault_rifles/stg/stg44_ironsights_mount"),

//---------------------------------------------------------------------------Rifles-------------------------------------------

    M1_GRANDE("gun/rifles/m1_garands/m1_grande"),
    M1_GARAND_CHAGING_HANDLE("gun/rifles/m1_garands/m1_grande_charging_handle"),
    M1_GRANDE_IRONSIGHTS("gun/rifles/m1_garands/m1_grande_ironsights"),
    M1_GRANDE_IRONSIGHTS_MOUNT("gun/rifles/m1_garands/m1_grande_ironsights_mount"),


    KAR98K("gun/rifles/kar98k/kar98k"),
    KAR98k_BOLT("gun/rifles/kar98k/kar98k_bolt"),
    KAR98K_IRONSIGHTS("gun/rifles/kar98k/kar98k_ironsights"),
    KAR98K_IRONSIGHTS_MOUNT("gun/rifles/kar98k/kar98k_ironsights_mount"),


    M1_GARAND_REMAKE("gun/rifles/m1_garands/m1_garand_remake"),
    M1_GARAND_REMAKE_CHARGING_HANDLE("gun/rifles/m1_garands/m1_garand_remake_charging_handle"),
    M1_GARAND_REMAKE_IRONSIGHTS("gun/rifles/m1_garands/m1_garand_remake_ironsights"),
    M1_GARAND_REMAKE_IRONSIGHTS_MOUNT("gun/rifles/m1_garands/m1_garand_remake_ironsights_mount"),





    ARISAKA_TYPE_99("gun/rifles/arisaka/arisaka_type99"),
    ARISAKA_TYPE_99_BOLT("gun/rifles/arisaka/arisaka_type99_bolt"),
    ARISAKA_TYPE_99_IRONSIGHTS("gun/rifles/arisaka/arisaka_type99_ironsights"),
    ARISAKA_TYPE_99_IRONSIGHTS_MOUNT("gun/rifles/arisaka/arisaka_type99_ironsights_mount"),



//---------------------------------------------------------Sniper Rifles----------------------------------------------------------------------------

    BARRETT_M82("gun/sniper_rifles/m82/barrett_m82_sniper"),
    BARRETT_M82_CHARGING_HANDLE("gun/sniper_rifles/m82/barrett_m82_sniper_charging_handle"),
    BARRETT_M82_IRONSIGHTS("gun/sniper_rifles/m82/barrett_m82_sniper_ironsights"),
    BARRETT_M82_IRONSIGHTS_MOUNT("gun/sniper_rifles/m82/barrett_m82_sniper_ironsights_mount"),



    SPR_3608("gun/sniper_rifles/spr/spr3608"),
    SPR_3608_BOLT("gun/sniper_rifles/spr/spr3608_bolt"),



    DRAGNAOV_SVD("gun/sniper_rifles/svd_dragnaov/dragnaov_svd"),
    DRAGNAOV_SVD_CHARGING_HANDLE("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_charging_handle"),
    DRAGNAOV_SVD_IRONSIGHTS("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_ironsights"),
    DRAGNAOV_SVD_IRONSIGHTS_MOUNT("gun/sniper_rifles/svd_dragnaov/dragnaov_svd_ironsights_mount"),



    ARTIC_WARFARE_MAGNUM("gun/sniper_rifles/awm/artic_warfare_magnum"),
    ARTIC_WARFARE_MAGNUM_BOLT("gun/sniper_rifles/awm/artic_warfare_magnum_bolt"),
    ARTIC_WARFARE_MAGNUM_BOLT_CHAMBER("gun/sniper_rifles/awm/artic_warfare_magnum_bolt_chamber"),


    REMINGTON360("gun/sniper_rifles/remington360/remington360"),
    REMINGTON360_BOLT("gun/sniper_rifles/remington360/remington360_bolt"),

    //---------------------------------------------------------------------Marks Man Rifles Dmrs-------------------------------------------------

    SKS("gun/dmrs/sks/sks"),
    SKS_IRONSIGHTS("gun/dmrs/sks/sks_ironsights"),
    SKS_IRONSIGHTS_MOUNT("gun/dmrs/sks/sks_ironsights_mount"),
    SKS_CHARGING_HANDLE("gun/dmrs/sks/sks_charging_handle"),





    M_14("gun/dmrs/m14/m14"),
    M14_IRONSIGHTS("gun/dmrs/m14/m14_ironsights"),
    M14_IRONSIGHTS_MOUNT("gun/dmrs/m14/m14_ironsights_mount"),
    M14_CHARGING_HANDLE("gun/dmrs/m14/m14_charging_handle"),


    //------------------------------------------------------------------------Light Machine Guns--------------------------------------------------------

    M_SIXTY("gun/lmgs/m60/m60"),
    M60_IRONSIGHTS_FLIPPED("gun/lmgs/m60/m60_ironsights_flipped"),
    M60_CHARGING_HANDLE("gun/lmgs/m60/m60_charging_handle"),
    M60_IRONSIGHTS("gun/lmgs/m60/m60_ironsights"),



    BRUEN_MK9("gun/lmgs/bruen_mk9/bruen_mk9"),
    BRUEN_MK9_CHARGING_HANDLE("gun/lmgs/bruen_mk9/bruen_mk9_charging_handle"),
    BRUEN_MK9_IRONSIGHTS("gun/lmgs/bruen_mk9/bruen_mk9_ironsights"),
    BRUEN_MK9_IRONSIGHTS_MOUNT("gun/lmgs/bruen_mk9/bruen_mk9_ironsights_mount"),




    RPK("gun/lmgs/rpk/rpk"),
    RPK_CHARGING_HANDLE("gun/lmgs/rpk/rpk_charging_handle"),
    RPK_IRONSIGHTS("gun/lmgs/rpk/rpk_ironsights"),
    RPK_IRONSIGHTS_MOUNT("gun/lmgs/rpk/rpk_ironsights_mount"),



//--------------------------------------------------------------------Shot Guns-----------------------------------------------------------------------

    AA12UX("gun/shotguns/aa12ux/aa12ux"),
    AA12UX_IRONSIGHTS("gun/shotguns/aa12ux/aa12ux_ironsights"),
    AA12UX_IRONSIGHTS_MOUNT("gun/shotguns/aa12ux/aa12ux_ironsights_mount"),



    BENELLIM4("gun/shotguns/benelli_m4/benelli_m4"),
    BENELLIM4_CHARGING_HANDLE("gun/shotguns/benelli_m4/benelli_m4_charging_handle"),




    MOSSBERG500("gun/shotguns/mossberg/mossberg500"),
    MOSSBERG500_CHARGING_HANDLE("gun/shotguns/mossberg/mossberg500_charging_handle"),
    MOSSBERG500_IRONSIGHTS("gun/shotguns/mossberg/mossberg500_ironsights"),
    MOSSBERG500_IRONSIGHTS_MOUNT("gun/shotguns/mossberg/mossberg500_ironsights_mount"),
    MOSSBERG500_PUMP_ACTION("gun/shotguns/mossberg/mossberg500_pump_action"),





    SUPER_SHORTY("gun/shotguns/shorty/serbu_super_shorty"),
    SUPER_SHORTY_CHARGING_HANDLE("gun/shotguns/shorty/serbu_super_shorty_charging_handle"),
    SUPER_SHORTY_IRONSIGHTS("gun/shotguns/shorty/serbu_super_shorty_ironsights"),
    SUPER_SHORTY_IRONSIGHTS_MOUNT("gun/shotguns/shorty/serbu_super_shorty_ironsights_mount"),
    SUPER_SHORTY_PUMP_ACTION("gun/shotguns/shorty/serbu_super_shorty_pumpaction"),




    SPAS_12("gun/shotguns/spas12/spas12"),
    SPAS_12_CHARGING_HANDLE("gun/shotguns/spas12/spas12_charging_handle"),
    SPAS_12_IRONSIGHTS("gun/shotguns/spas12/spas12_ironsights"),
    SPAS_12_IRONSIGHTS_MOUNT("gun/shotguns/spas12/spas12_ironsights_mount"),



//----------------------------------------------------------------Others ---------------------------------------------------------------------
    MK_170_CROSSBOW("gun/others/crossbow/mk_170_crossbow"),

    ;


    private final ResourceLocation modelLoc;
    private BakedModel cachedModel;

    SpecialModels(String modelName) {
        this.modelLoc = new ResourceLocation(StabxModernGuns.MOD_ID, "special/" + modelName);
    }

    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLoc);
        }
        return this.cachedModel;
    }
    @SubscribeEvent
    public static void onRegisterAdditionalModelEvent(final ModelEvent.RegisterAdditional event) {
        for (SpecialModels specialModel : values()) {
            event.register(specialModel.modelLoc);
        }
    }
    @SubscribeEvent
    public static void onBakingCompletedEvent(final ModelEvent.BakingCompleted event) {
        for (SpecialModels specialModel : values()) {
            specialModel.cachedModel = null;
        }
    }
}