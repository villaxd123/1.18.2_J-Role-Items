package net.jorgev96.jroleitems.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;


public class ModFoods {
    public static final FoodProperties PIZZA_A = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationMod(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1.0F)
            .meat()
            .alwaysEat()
            .build();

}
