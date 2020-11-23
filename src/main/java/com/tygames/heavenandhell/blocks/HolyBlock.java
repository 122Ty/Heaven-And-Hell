package com.tygames.heavenandhell.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HolyBlock extends Block {

    public HolyBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(1200.0f, 200.0f)
            .sound(SoundType.GROUND)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE));
    }
}
