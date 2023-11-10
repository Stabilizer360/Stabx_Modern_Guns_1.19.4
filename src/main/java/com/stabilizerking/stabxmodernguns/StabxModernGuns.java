package com.stabilizerking.stabxmodernguns;

import com.mrcrayfish.guns.item.GunItem;
import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.StabxCreativeModeTab;
import com.stabilizerking.stabxmodernguns.utils.StabxModUtils;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(StabxModernGuns.MOD_ID)
public class StabxModernGuns {
    public static final String MOD_ID = "stabxmodernguns";
    private static final Logger LOGGER = LogManager.getLogger();

    public StabxModernGuns() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        ModItemRegisteration.ITEMS.register(bus);
        ModSoundRegisteration.SOUNDS.register(bus);

        bus.addListener(this::addCreative);
        bus.addListener(this::clientSetup);

    }


    //-----------------------In here we Are Registering creative tabs in 1.19.3 also adding items mannually for each tab----------------------//


    //----------------------------------------------------Pistols-------------------------------------------------------------------------------//

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());
            gunItems.add(ModItemRegisteration.GLOCK_19_C.get());
            gunItems.add(ModItemRegisteration.DESERT_EAGLE_MARK_14.get());
            gunItems.add(ModItemRegisteration.COLT_M1911A1.get());
            gunItems.add(ModItemRegisteration.BAREETA67.get());
            gunItems.add(ModItemRegisteration.P226.get());
            gunItems.add(ModItemRegisteration.HKUSP45.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------------Sub Machine Guns-------------------------------------------------------------------------------//


        if (event.getTab() == StabxCreativeModeTab.STABX_SMGS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.MP5_CLASSIC.get());
            gunItems.add(ModItemRegisteration.MP40.get());
            gunItems.add(ModItemRegisteration.TEC9.get());
            gunItems.add(ModItemRegisteration.STRIKER45.get());
            gunItems.add(ModItemRegisteration.ZXR_MP7.get());
            gunItems.add(ModItemRegisteration.VECTOR45.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //----------------------------------------------------Assault Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_ASSAULT_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.M4.get());
            gunItems.add(ModItemRegisteration.M4A1.get());
            gunItems.add(ModItemRegisteration.M16.get());
            gunItems.add(ModItemRegisteration.MK_MOD11.get());
            gunItems.add(ModItemRegisteration.SCAR_17.get());
            gunItems.add(ModItemRegisteration.ACR_BUSHMASTER.get());
            gunItems.add(ModItemRegisteration.G36C_HD.get());
            gunItems.add(ModItemRegisteration.AK_47.get());
            gunItems.add(ModItemRegisteration.AKS_74.get());
            gunItems.add(ModItemRegisteration.AKM_762.get());
            gunItems.add(ModItemRegisteration.AKS_74_UX.get());
            gunItems.add(ModItemRegisteration.STG44.get());
            gunItems.add(ModItemRegisteration.HK416.get());
            gunItems.add(ModItemRegisteration.AUG556.get());
            gunItems.add(ModItemRegisteration.SCAR17_HD.get());
            gunItems.add(ModItemRegisteration.FAMAS_G7.get());
            gunItems.add(ModItemRegisteration.MCX_HONEYBADGER.get());
            gunItems.add(ModItemRegisteration.MODERN_GK57.get());
            gunItems.add(ModItemRegisteration.NZ41.get());
            gunItems.add(ModItemRegisteration.AK_103.get());
            gunItems.add(ModItemRegisteration.AZ67.get());


            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------------Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.ARISAKA_TYPE_99.get());
            gunItems.add(ModItemRegisteration.M1_GRANDE.get());
            gunItems.add(ModItemRegisteration.KAR98K.get());
            gunItems.add(ModItemRegisteration.M1_GARAND_REMAKE.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------------Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_DMRS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.M14.get());
            gunItems.add(ModItemRegisteration.SKS.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //-------------------------------------------------Sniper Rifles-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_SNIPER_RIFLES_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.BARRETT_M82.get());
            gunItems.add(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get());
            gunItems.add(ModItemRegisteration.SPR_3608.get());
            gunItems.add(ModItemRegisteration.REMINGTON360.get());
            gunItems.add(ModItemRegisteration.DRAGNAOV_SVD.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }
        //-------------------------------------------------Shotguns-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_SHOTGUNS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.AA_12UX.get());
            gunItems.add(ModItemRegisteration.SPAS_12.get());
            gunItems.add(ModItemRegisteration.MOSSBERG_500.get());
            gunItems.add(ModItemRegisteration.SUPER_SHORTY.get());
            gunItems.add(ModItemRegisteration.BENELLI_M4.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //-------------------------------------------------Light Machine Guns-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_LMGS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.M_60.get());
            gunItems.add(ModItemRegisteration.RPK.get());
            gunItems.add(ModItemRegisteration.BRUEN_MK9.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }
        }

        //----------------------------------------------Miscellaneous-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_MISCELLANEOUS_GROUP) {
            List<GunItem> gunItems = new ArrayList<>();

            gunItems.add(ModItemRegisteration.MK_170_CROSSBOW.get());

            for (GunItem gun : gunItems) {
                event.accept(StabxModUtils.gunWithoutBar(gun));
            }

        }
        //----------------------------------------------Attachmments-------------------------------------------------------------------------------//

        if (event.getTab() == StabxCreativeModeTab.STABX_ATTACHMENTS_GROUP) {
            event.accept(ModItemRegisteration.RED_DOT_SIGHT);
            event.accept(ModItemRegisteration.HOLOGRAPHIC_SIGHT);
            event.accept(ModItemRegisteration.ACOG_SIGHT);
            event.accept(ModItemRegisteration.MINI_SIGHT);
            event.accept(ModItemRegisteration.KOBRA_SIGHT);
            event.accept(ModItemRegisteration.ZA_MINI_RED_DOT_SIGHT);
            event.accept(ModItemRegisteration.CUSTOM_STOCK);
            event.accept(ModItemRegisteration.ANGLED_FOREGRIP);
            event.accept(ModItemRegisteration.VERTICAL_FOREGRIP);
            event.accept(ModItemRegisteration.SKELETON_FOREGRIP);
            event.accept(ModItemRegisteration.ADVANCED_MUZZLE_BRAKE);
            event.accept(ModItemRegisteration.ADVANCED_SUPPRESSOR);
            event.accept(ModItemRegisteration.SIMPLE_SNIPER_SCOPE);
        }

        //----------------------------------------------Ammuniation-------------------------------------------------------------------------------//


        if (event.getTab() == StabxCreativeModeTab.STABX_AMMUNITION_GROUP) {
            event.accept(ModItemRegisteration.NINE_MM);
            event.accept(ModItemRegisteration.SEVEN_62_MM);
            event.accept(ModItemRegisteration.SEVEN_32_X_51_MM_NATO);
            event.accept(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL);
            event.accept(ModItemRegisteration.FIVE_56_X_45_NATO);
            event.accept(ModItemRegisteration.SEVEN_7_X_58_MM);
            event.accept(ModItemRegisteration.SEVEN_32_X_33_MM_KURZ);
            event.accept(ModItemRegisteration.FIFTY_CALIBER);
            event.accept(ModItemRegisteration.FOURTY_FIVE_ACP);
            event.accept(ModItemRegisteration.THRITY_SIXTY_AMMO);
            event.accept(ModItemRegisteration.FIFTY_AE);
            event.accept(ModItemRegisteration.THREE_HUNDRED_WM);
            event.accept(ModItemRegisteration.FIFTY_BMG);
            event.accept(ModItemRegisteration.MK_CROSSBOW_ARROW);
            event.accept(ModItemRegisteration.FOUR_6_X_30MM);
            event.accept(ModItemRegisteration.SEVEN_92_X_57MM);
            event.accept(ModItemRegisteration.THREE_300_BLACKOUT);
            event.accept(ModItemRegisteration.T303_BRITISH);
            event.accept(ModItemRegisteration.FIVE_45_X_39MM);

        }
    }


    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::registerModelOverrides);
    }
}
