package com.tutorial.boson.registry;

import com.tutorial.boson.Utils;
import com.tutorial.boson.entity.ObsidianCounterTileEntity;
import com.tutorial.boson.entity.ObsidianHelloTileEntity;
import com.tutorial.boson.entity.ObsidianTERTileEntity;
import com.tutorial.boson.entity.ObsidianZombieTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.registries.ForgeRegistries.TILE_ENTITIES;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<ObsidianCounterTileEntity>> obsidianCounterTileEntity = TILE_ENTITIES
            .register(
                    "obsidian_counter_tileentity",
                    () -> TileEntityType.Builder.create(ObsidianCounterTileEntity::new, BlockRegistry.obsidianCounterBlock.get()
            ).build(null));
    public static final RegistryObject<TileEntityType<ObsidianHelloTileEntity>> obsidianHelloTileEntity = TILE_ENTITIES.register("obsidian_hello_tileentity", () -> TileEntityType.Builder.create(ObsidianHelloTileEntity::new, BlockRegistry.obsidianHelloBlock.get()).build(null));
    public static final RegistryObject<TileEntityType<ObsidianZombieTileEntity>> obsidianZombieTileEntity = TILE_ENTITIES.register("obsidian_zombie_tileentity", () -> TileEntityType.Builder.create(ObsidianZombieTileEntity::new, BlockRegistry.obsidianZombieBlock.get()).build(null));
    public static final RegistryObject<TileEntityType<ObsidianTERTileEntity>> obsidianTERTileEntity = TILE_ENTITIES.register("obsidian_ter_tileentity", () -> TileEntityType.Builder.create(ObsidianTERTileEntity::new, BlockRegistry.obsidianTERBlock.get()).build(null));
}
