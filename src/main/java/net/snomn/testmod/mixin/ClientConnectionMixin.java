package net.snomn.testmod.mixin;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.Packet;
import net.snomn.testmod.TestMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {
    @Inject(at = @At("TAIL"), method = "send(Lnet/minecraft/network/Packet;Lio/netty/util/concurrent/GenericFutureListener;)V", cancellable = true)
    public void send(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>> callback, CallbackInfo ci) {
       // TestMod.LOGGER.info(packet.getClass().getName());
    }
}