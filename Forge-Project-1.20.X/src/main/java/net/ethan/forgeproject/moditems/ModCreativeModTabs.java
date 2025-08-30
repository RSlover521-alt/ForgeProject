package net.ethan.forgeproject.moditems;

import net.ethan.forgeproject.ForgeProject;
import net.ethan.forgeproject.modblocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgeProject.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_WEAPON_TAB =
            CREATIVE_MODE_TABS.register("custom_weapon_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RPG.get()))
                            .title(Component.translatable("creativetab.custom_weapon_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.RPG.get());
                                pOutput.accept(ModItems.RPG_AMMO.get());
                                pOutput.accept(ModBlock.SULFUR_ORE.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}