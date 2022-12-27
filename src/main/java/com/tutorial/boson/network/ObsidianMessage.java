package com.tutorial.boson.network;

import com.tutorial.boson.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.PacketDistributor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObsidianMessage extends Item {
    private static final Logger LOGGER = LogManager.getLogger();
    public ObsidianMessage() {
        super(new Properties().group(ModGroup.itemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        LOGGER.info("ItemRightClick");

        if (worldIn.isRemote) {
            NetWorking.INSTANCE.sendToServer(new SendPack("From the Client"));
        }
        if (!worldIn.isRemote) {
            NetWorking.INSTANCE.send(
                    PacketDistributor.PLAYER.with(
                            () -> (ServerPlayerEntity) playerIn
                    ),
                    new SendPack("From Server")
            );
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}