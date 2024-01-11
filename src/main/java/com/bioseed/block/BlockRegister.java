package com.bioseed.block;

import com.bioseed.block.crops.HateCrop;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.bioseed.Bioseed.MOD_ID;


public class BlockRegister {

    public static final FleshBlock FLESH_BLOCK = new FleshBlock();
    public static final HateCrop HATE_CROP = new HateCrop();
    public static void registry() {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID,"flesh_block"), FLESH_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID,"hate_crop"), HATE_CROP);


    }


}
