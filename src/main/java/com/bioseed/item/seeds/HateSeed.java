package com.bioseed.item.seeds;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;

import static com.bioseed.block.BlockRegister.HATE_CROP;

public class HateSeed extends AliasedBlockItem{
    public HateSeed() {
         super(HATE_CROP, new FabricItemSettings());
    }



}
