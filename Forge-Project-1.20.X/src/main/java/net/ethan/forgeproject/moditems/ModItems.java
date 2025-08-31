package net.ethan.forgeproject.moditems;

import net.ethan.forgeproject.ForgeProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeProject.MOD_ID);

    public static final RegistryObject<Item> RPG =
            ITEMS.register("rpg", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RPG_AMMO =
            ITEMS.register("rpg_ammo", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SULFUR =
            ITEMS.register("raw_sulfur", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SULFUR_INGOT =
            ITEMS.register("sulfur_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
