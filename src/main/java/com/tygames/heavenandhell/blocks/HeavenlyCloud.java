package com.tygames.heavenandhell.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class HeavenlyCloud extends GlassBlock {

    public HeavenlyCloud() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(1200.0f, 200.0f)
                .sound(SoundType.GLASS)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .notSolid());
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        if (adjacentBlockState.getBlock() instanceof HeavenlyCloud) {
            if (adjacentBlockState.getRenderType() == state.getRenderType()) {
                return true;
            }
        }

        return super.isSideInvisible(state, adjacentBlockState, side);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }
}