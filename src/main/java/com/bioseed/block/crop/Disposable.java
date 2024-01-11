package com.bioseed.block.crop;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public interface Disposable {
    default void disposable(World world, BlockPos pos, BlockState state) {
        CropBlock crop = (CropBlock) state.getBlock();
        if (crop.isMature(state)) {
            world.setBlockState(pos.down(), Blocks.AIR.getDefaultState());
        }
    }
}