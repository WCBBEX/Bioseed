package com.bioseed.block;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.block.Blocks.FARMLAND;

public class FleshBlock extends Block {
    public FleshBlock() {
        super(AbstractBlock.Settings.copy(FARMLAND));
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 15, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return SHAPE;
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return SHAPE;
    }
}
