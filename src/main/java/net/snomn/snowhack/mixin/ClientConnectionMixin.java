package net.snomn.snowhack.mixin;

import net.minecraft.network.ClientConnection;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {
    /*
    @Inject(at = @At("TAIL"), method = "send(Lnet/minecraft/network/Packet;Lio/netty/util/concurrent/GenericFutureListener;)V", cancellable = true)
    public void send(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>> callback, CallbackInfo ci) {
      // SnowHack.LOGGER.info(packet.getClass().getName());
    } */
}