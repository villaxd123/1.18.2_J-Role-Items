package net.jorgev96.jroleitems.item;

import net.jorgev96.jroleitems.JRoleItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JRoleItems.MOD_ID);

    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> DIAMOND_COIN = ITEMS.register("diamond_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> PURPUMETRINE = ITEMS.register("purpumetrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> RAW_PURPUMETRINE = ITEMS.register("raw_purpumetrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static final RegistryObject<Item> PURPUMETRINE_CHARGED = ITEMS.register("purpumetrine_charged",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
