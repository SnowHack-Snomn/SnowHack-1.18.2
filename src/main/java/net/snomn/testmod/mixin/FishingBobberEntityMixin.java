package net.snomn.testmod.mixin;

import net.snomn.testmod.TestMod;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FishingBobberEntity.class)
public class FishingBobberEntityMixin {

    @Shadow private int waitCountdown;
    @Shadow private boolean caughtFish;


    @Inject(at = @At("TAIL"), method = "tick()V")
    public void tick(CallbackInfo info) {

        TestMod.LOGGER.info("tick: "+caughtFish+" | "+waitCountdown);
    }
}
