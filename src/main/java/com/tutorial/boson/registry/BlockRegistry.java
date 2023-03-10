package com.tutorial.boson.registry;

import com.tutorial.boson.Utils;
import com.tutorial.boson.block.*;
import com.tutorial.boson.entity.ObsidianTERTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.registries.ForgeRegistries.TILE_ENTITIES;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> obsidianBlock = BLOCKS.register("obsidian_block", ObsidianBlock::new);

    public static final RegistryObject<Block> obsidianRubikCube = BLOCKS.register("obsidian_rubik_cube", ObsidianRubikCube::new);

    public static final RegistryObject<Block> obsidianFrame = BLOCKS.register("obsidian_frame", ObsidianFrame::new);
    public static final RegistryObject<Block> obsidianCounterBlock = BLOCKS.register("obsidian_counter", ObsidianCounter::new);
    public static final RegistryObject<Block> obsidianHelloBlock = BLOCKS.register("obsidian_hello_block", ObsidianHelloBlock::new);
    public static final RegistryObject<Block> obsidianZombieBlock = BLOCKS.register("obsidian_zombie_block", ObsidianZombieBlock::new);
    public static final RegistryObject<Block> obsidianTERBlock = BLOCKS.register("obsidian_ter_block", ObsidianTERBlock::new);

}
