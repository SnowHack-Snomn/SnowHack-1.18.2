package net.snomn.snowhack.hack.misc;

import net.snomn.snowhack.hack.Hack;
import org.lwjgl.glfw.GLFW;

public class AutoFish extends Hack {

    public AutoFish() {
        super("AutoFishing", "Autofishes for you", Category.MISC);
        this.setKey(GLFW.GLFW_KEY_H);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}