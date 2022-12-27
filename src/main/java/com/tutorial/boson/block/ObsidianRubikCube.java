package com.tutorial.boson.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class ObsidianRubikCube extends Block {
    public static IntegerProperty STATE = IntegerProperty.create("face",0,1);

    public ObsidianRubikCube() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
        this.setDefaultState(this.stateContainer.getBaseState().with(STATE, 1));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STATE);
        super.fillStateContainer(builder);
    }
}
