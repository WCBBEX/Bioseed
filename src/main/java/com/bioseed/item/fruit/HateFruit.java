package com.bioseed.item.fruit;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.lang.reflect.Type;

public class HateFruit extends Item {
    public HateFruit() {
        super(new FabricItemSettings().food(new FoodComponent.Builder()
                .hunger(0)
                .saturationModifier(0f)
                .alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 5), 1f)
                .build()));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.eatFood(world, stack);

        EntityAttributeInstance health = user.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (health != null) {
            health.setBaseValue(health.getBaseValue() + 2);
            user.setHealth(user.getHealth() + 2);
        }

        return  stack;
    }


}
