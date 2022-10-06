package net.jorgev96.jroleitems.item;

import net.jorgev96.jroleitems.JRoleItems;
import net.jorgev96.jroleitems.item.custom.RollDiceItem;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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

    public static final RegistryObject<Item> PIZZA_A = ITEMS.register("pizza_a",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)
                    .food(ModFoods.PIZZA_A)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    if (Screen.hasShiftDown()){
                        pTooltipComponents.add(new TranslatableComponent("tooltip.jroleitems.pizza_a.tooltip.shift"));
                    } else {
                        pTooltipComponents.add(new TranslatableComponent("tooltip.jroleitems.pizza_a.tooltip"));
                    }
                }
            });

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new RollDiceItem(new Item.Properties().tab(ModCreativeModeTab.JORGE_ROLE_ITEMS_TAB)
                    .stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
