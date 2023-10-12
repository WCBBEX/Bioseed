package com.bioseed.item;

import com.bioseed.item.fruit.HateFruit;
import com.bioseed.item.seeds.HateSeed;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.bioseed.Bioseed.MOD_ID;
import static com.bioseed.block.BlockRegister.FLESH_BLOCK;


public class ItemRegister {
    public static HateSeed HATE_SEED = new HateSeed();
    public static HateFruit HATE_FRUIT = new HateFruit();

    public static void registry() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"hate_seed"), HATE_SEED);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"hate_fruit"), HATE_FRUIT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"flesh_block"), new BlockItem(FLESH_BLOCK, new FabricItemSettings()));
    }

}
