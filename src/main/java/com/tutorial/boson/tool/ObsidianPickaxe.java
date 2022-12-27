package com.tutorial.boson.tool;

import com.tutorial.boson.ModItemTier;
import com.tutorial.boson.group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, -3F, new Item.Properties().group(ModGroup.itemGroup));
    }
}
