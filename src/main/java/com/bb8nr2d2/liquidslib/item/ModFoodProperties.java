package com.bb8nr2d2.liquidslib.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MILK_CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 0.75f).build();
    public static final FoodProperties WHITE_CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 1), 0.75f).build();
    public static final FoodProperties DARK_CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1), 0.75f).build();
}
