package com.tutorial.boson.weapon;

import com.tutorial.boson.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItemTier.OBSIDIAN, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
