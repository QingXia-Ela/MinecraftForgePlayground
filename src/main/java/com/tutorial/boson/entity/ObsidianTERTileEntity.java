package com.tutorial.boson.entity;

import com.tutorial.boson.registry.TileEntityTypeRegistry;
import net.minecraft.tileentity.TileEntity;

public class ObsidianTERTileEntity extends TileEntity {
    public ObsidianTERTileEntity() {
        super(TileEntityTypeRegistry.obsidianTERTileEntity.get());
    }
}
