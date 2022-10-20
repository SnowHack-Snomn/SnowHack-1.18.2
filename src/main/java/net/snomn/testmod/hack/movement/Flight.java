package net.snomn.testmod.hack.movement;

import net.snomn.testmod.hack.Hack;
import org.lwjgl.glfw.GLFW;

public class Flight extends Hack {

    public Flight() {
        super("Flight", "Allows you to fly", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_G);
    }

    @Override
    public void onTick() {
        if(mc.player !=null) {
            mc.player.getAbilities().flying = true;
        }
        super.onTick();
    }

    @Override
    public void onDisable() {
        if(mc.player !=null) {
            mc.player.getAbilities().flying = false;
        }
        super.onDisable();
    }
}
