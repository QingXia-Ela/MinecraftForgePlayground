package com.tutorial.boson.food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

public class ObsidianApple extends Item {
    public static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(()-> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
            .build();

    public ObsidianApple() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}
