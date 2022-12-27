package com.tutorial.boson.registry;

import com.tutorial.boson.ModArmorMaterial;
import com.tutorial.boson.Utils;
import com.tutorial.boson.food.ObsidianApple;
import com.tutorial.boson.group.ModGroup;
import com.tutorial.boson.item.ObsidianIngot;
import com.tutorial.boson.item.MagicIngot;
import com.tutorial.boson.network.ObsidianMessage;
import com.tutorial.boson.tool.ObsidianPickaxe;
import com.tutorial.boson.weapon.ObsidianSword;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
    public static final RegistryObject<Item> magicIngot = ITEMS.register("magic_ingot", MagicIngot::new);

    public static final RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple", ObsidianApple::new);
    public static final RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", ObsidianSword::new);
    public static final RegistryObject<Item> obsidianPickaxe = ITEMS.register("obsidian_pickaxe", ObsidianPickaxe::new);

    /** armor */
    public static final RegistryObject<Item> obsidianHelmet = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianChestplate = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianLeggings = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianBoots = ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).group(ModGroup.itemGroup)));

    /** block */
    public static final RegistryObject<Item> obsidianBlock = ITEMS.register("obsidian_block", () -> new BlockItem(BlockRegistry.obsidianBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianRubikCube = ITEMS.register("obsidian_rubik_cube", () -> new BlockItem(BlockRegistry.obsidianRubikCube.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static RegistryObject<Item> obsidianFrame = ITEMS.register("obsidian_frame", () -> new BlockItem(BlockRegistry.obsidianFrame.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static RegistryObject<Item> obsidianCounterBlock = ITEMS.register("obsidian_counter", () -> new BlockItem(BlockRegistry.obsidianCounterBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static RegistryObject<Item> obsidianHelloBlock = ITEMS.register("obsidian_hello_block", () -> new BlockItem(BlockRegistry.obsidianHelloBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static RegistryObject<Item> obsidianZombieBlock = ITEMS.register("obsidian_zombie_block", () -> new BlockItem(BlockRegistry.obsidianZombieBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
    public static RegistryObject<Item> obsidianTerBlock = ITEMS.register("obsidian_ter_block", () -> new BlockItem(BlockRegistry.obsidianTERBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));

    /* network */
    public static RegistryObject<Item> obsidianMessage = ITEMS.register("obsidian_message", ObsidianMessage::new);

}
