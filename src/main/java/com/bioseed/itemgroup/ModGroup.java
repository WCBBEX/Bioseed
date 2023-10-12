package com.bioseed.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.bioseed.Bioseed.MOD_ID;
import static com.bioseed.block.BlockRegister.FLESH_BLOCK;
import static com.bioseed.item.ItemRegister.HATE_FRUIT;
import static com.bioseed.item.ItemRegister.HATE_SEED;

public class ModGroup {


    public ModGroup(){
        ItemGroup MY_IG = Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "mygroup"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("Bioseed"))
                        .icon(() -> new ItemStack(FLESH_BLOCK))
                        .entries((displayContext, entries) -> {
                            entries.add(FLESH_BLOCK);
                            entries.add(HATE_SEED);
                            entries.add(HATE_FRUIT);


                        })
                        .build());


    }





}
