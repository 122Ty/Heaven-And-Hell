package com.tygames.heavenandhell.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class HolyAltar extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 10, 9, 16, 15, 16),
            Block.makeCuboidShape(12, 0, 12, 16, 9, 16),
            Block.makeCuboidShape(0, 0, 12, 4, 9, 16),
            Block.makeCuboidShape(0, 9, 13, 4, 10, 16),
            Block.makeCuboidShape(12, 9, 13, 16, 10, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 10, 0, 16, 15, 7),
            Block.makeCuboidShape(0, 0, 0, 4, 9, 4),
            Block.makeCuboidShape(12, 0, 0, 16, 9, 4),
            Block.makeCuboidShape(12, 9, 0, 16, 10, 3),
            Block.makeCuboidShape(0, 9, 0, 4, 10, 3)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(9, 10, 0, 16, 15, 16),
            Block.makeCuboidShape(12, 0, 0, 16, 9, 4),
            Block.makeCuboidShape(12, 0, 12, 16, 9, 16),
            Block.makeCuboidShape(13, 9, 12, 16, 10, 16),
            Block.makeCuboidShape(13, 9, 0, 16, 10, 4)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
    private static final VoxelShape SHAPE_E =Stream.of(
            Block.makeCuboidShape(0, 10, 0, 7, 15, 16),
            Block.makeCuboidShape(0, 0, 12, 4, 9, 16),
            Block.makeCuboidShape(0, 0, 0, 4, 9, 4),
            Block.makeCuboidShape(0, 9, 0, 3, 10, 4),
            Block.makeCuboidShape(0, 9, 12, 3, 10, 16)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public HolyAltar() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)){
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case EAST:
                return SHAPE_E;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }
    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.toRotation(state.get(FACING)));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6f;
    }
}
