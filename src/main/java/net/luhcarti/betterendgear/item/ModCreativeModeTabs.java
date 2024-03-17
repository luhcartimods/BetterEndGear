package net.luhcarti.betterendgear.item;


import net.luhcarti.betterendgear.BetterEndGear;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterEndGear.MOD_ID);

    public static final RegistryObject<CreativeModeTab> END_TAB = CREATIVE_MODE_TABS.register("end_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDER_AXE.get()))
                    .title(Component.translatable("creativetab.end_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DRAGON_FANG.get());
                        pOutput.accept(ModItems.ENDER_RELICS.get());
                        pOutput.accept(ModItems.ENDER_BLAZE_SCALE.get());

                        pOutput.accept(ModItems.BLAZE_SCALE_HELMET.get());
                        pOutput.accept(ModItems.BLAZE_SCALE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BLAZE_SCALE_LEGGINGS.get());
                        pOutput.accept(ModItems.BLAZE_SCALE_BOOTS.get());

                        pOutput.accept(ModItems.ENDER_AXE.get());
                        pOutput.accept(ModItems.ENDER_PICKAXE.get());
                        pOutput.accept(ModItems.ENDER_HOE.get());
                        pOutput.accept(ModItems.ENDER_SHOVEL.get());
                        pOutput.accept(ModItems.DRAGON_FANGED_KARAMBIT.get());

                        pOutput.accept(ModItems.ENDER_BLAZE_SPAWN_EGG.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


