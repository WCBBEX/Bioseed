package com.bioseed.block.crop;

import com.bioseed.block.BlockRegister;
import com.bioseed.item.ItemRegister;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class HateCrop extends CropBlock implements Disposable {
    public static final IntProperty AGE = Properties.AGE_3;
    public HateCrop() {
        super(AbstractBlock.Settings.copy(Blocks.WHEAT).nonOpaque().breakInstantly());
    }

    private final static VoxelShape[] AGE_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(0.0D, -1.0D, 0.0D, 16.0D, 1.0D, 16.0D),
            Block.createCuboidShape(0.0D, -1.0D, 0.0D, 16.0D, 5.0D, 16.0D),
            Block.createCuboidShape(0.0D, -1.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.createCuboidShape(0.0D, -1.0D, 0.0D, 16.0D, 16.0D, 16.0D),
    };

    @Override
    public int getMaxAge() {
        return 3;
    }
    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return AGE_SHAPE[(Integer)state.get(this.getAgeProperty())];
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE});
    }


    @Override
    protected int getGrowthAmount(World world){return 1;}
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random){}



    @Override
    public ItemConvertible getSeedsItem() {
        return ItemRegister.HATE_SEED;
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(BlockRegister.FLESH_BLOCK);
    }

}
