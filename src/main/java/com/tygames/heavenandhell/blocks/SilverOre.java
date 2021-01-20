package com.tygames.heavenandhell.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverOre extends Block {

    public SilverOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(6f, 10.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));


    }
}