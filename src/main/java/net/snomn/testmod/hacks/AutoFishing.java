package net.snomn.testmod.hacks;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Hand;

public class AutoFishing {

    public int recastRod = -1;

    public void tick(MinecraftClient client) {
        if(recastRod>0) {
            recastRod--;
        }
        if(recastRod == 0) {
            client.interactionManager.interactItem(client.player, client.world, Hand.MAIN_HAND);
            recastRod = -1;
        }
    }

    public void setRecastRod(int countdown) {
        recastRod = countdown;
    }

}
