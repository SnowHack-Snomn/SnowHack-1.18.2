package net.snomn.snowhack.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.util.Hand;
import net.snomn.snowhack.hack.misc.AutoFish;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FishingBobberEntity.class)
public class FishingBobberEntityMixin {

    @Shadow private boolean caughtFish;

    @Inject(method = "onTrackedDataSet", at = @At("TAIL"))
    public void onTrackedDataSet(TrackedData<?> data, CallbackInfo ci) {


        MinecraftClient mc = MinecraftClient.getInstance();

        if (caughtFish && AutoFish.AutoFishEnabled) {
            AutoFish.RecastRodDelay();
            mc.interactionManager.interactItem(mc.player, mc.world, Hand.MAIN_HAND);
        }
    }
}