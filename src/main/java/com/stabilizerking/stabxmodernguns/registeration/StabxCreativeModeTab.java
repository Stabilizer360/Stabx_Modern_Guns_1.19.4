    package com.stabilizerking.stabxmodernguns.registeration;

    import com.stabilizerking.stabxmodernguns.StabxModernGuns;
    import com.stabilizerking.stabxmodernguns.utils.StabxModUtils;
    import net.minecraft.network.chat.Component;
    import net.minecraft.resources.ResourceLocation;
    import net.minecraft.world.item.CreativeModeTab;
    import net.minecraft.world.item.ItemStack;
    import net.minecraftforge.event.CreativeModeTabEvent;
    import net.minecraftforge.eventbus.api.SubscribeEvent;
    import net.minecraftforge.fml.common.Mod;

    @Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class StabxCreativeModeTab {

        //----------------------------In here we register every Creative Tab for each gun category-------------------------------------//
        public static CreativeModeTab
                STABX_MODERN_GUNS_GROUP,
                STABX_SMGS_GROUP,
                STABX_ASSAULT_RIFLES_GROUP,
                STABX_RIFLES_GROUP,
                STABX_SNIPER_RIFLES_GROUP,
                STABX_DMRS_GROUP,
                STABX_SHOTGUNS_GROUP,
                STABX_LMGS_GROUP,
                STABX_MISCELLANEOUS_GROUP,
                STABX_ATTACHMENTS_GROUP,
                STABX_AMMUNITION_GROUP;

        //------------------------------Now the Real Fun Begins in every creative tab uses builder and event thingy -------------------------------------//


        //----------------------------------------------------Pistols-------------------------------------------------------------------------------//
        @SubscribeEvent
        public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
            STABX_MODERN_GUNS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabxmodernguns"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get())).
                            title(Component.literal("Stabx Modern Guns")).build());

            //----------------------------------------------------Sub Machine Guns-------------------------------------------------------------------------------//


            STABX_SMGS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_smgs"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.MP5_CLASSIC.get())).
                            title(Component.literal("Sub Machine Guns")).build());

            //----------------------------------------------------Assault Rifles-------------------------------------------------------------------------------//

            STABX_ASSAULT_RIFLES_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_assault_rifles"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.M4.get())).
                            title(Component.literal("Assault Rifles")).build());

            //-------------------------------------------------------Rifles-------------------------------------------------------------------------------//

            STABX_RIFLES_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_rifles"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.ARISAKA_TYPE_99.get())).
                            title(Component.literal("Rifles")).build());

            //----------------------------------------------------Sniper Rifles-------------------------------------------------------------------------------//


            STABX_SNIPER_RIFLES_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_sniper_rifles"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get())).
                            title(Component.literal("Sniper Rifles")).build());

            //---------------------------------------------------Marksman Rifles DMRs -------------------------------------------------------------------------------//

            STABX_DMRS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_dmrs"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.M14.get())).
                            title(Component.literal("Marksman Rifle DMRs")).build());



            //----------------------------------------------------Light Machine Guns -------------------------------------------------------------------------------//


            STABX_LMGS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_lmgs"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.M60.get())).
                            title(Component.literal("Light Machine Guns")).build());

            //----------------------------------------------------Shot guns-------------------------------------------------------------------------------//


            STABX_SHOTGUNS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_shotguns"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.AA_12UX.get())).
                            title(Component.literal("Shotguns")).build());


            //-------------------------------------------------------Miscellaneous-------------------------------------------------------------------------------//

            STABX_MISCELLANEOUS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID, "stabx_miscellaneous"),
                    builder -> builder.icon(() -> StabxModUtils.gunWithoutBar(ModItemRegisteration.MK_170_CROSSBOW.get())).
                            title(Component.literal("Miscellaneous")).build());

            //--------------------------------------------------------Attachements-------------------------------------------------------------------------------//

            STABX_ATTACHMENTS_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID,"stabx_attachments"),
                    builder -> builder.icon(() -> new ItemStack(ModItemRegisteration.RED_DOT_SIGHT.get())).title(Component.literal("Attachments")).build());

            //---------------------------------------------------------Ammunition-------------------------------------------------------------------------------//

            STABX_AMMUNITION_GROUP = event.registerCreativeModeTab(new ResourceLocation(StabxModernGuns.MOD_ID,"stabx_ammunition"),
                    builder -> builder.icon(() -> new ItemStack(ModItemRegisteration.NINE_MM.get())).title(Component.literal("Ammunition")).build());

        }
    }
