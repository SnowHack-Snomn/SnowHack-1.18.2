package net.snomn.snowhack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.snomn.snowhack.hack.Hack;
import net.snomn.snowhack.hack.HackManager;
import net.snomn.snowhack.ui.screens.clickgui.ClickGUI;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SnowHack implements ModInitializer {

	public static final SnowHack INSTANCE = new SnowHack();
	public static final Logger LOGGER = LoggerFactory.getLogger("snowhack");


	private MinecraftClient mc = MinecraftClient.getInstance();

	@Override
	public void onInitialize() {
		LOGGER.info("Hello World Of Cheating!");
	}

	public void onKeyPress(int key, int action) {
		if (action == GLFW.GLFW_PRESS) {
			for(Hack hack : HackManager.INSTANCE.getHacks()) {
				if (key == hack.getKey()) hack.toggle();
			}

			if(key == GLFW.GLFW_KEY_RIGHT_SHIFT) mc.setScreen(ClickGUI.INSTANCE);
		}
	}

	public void onTick() {
		if (mc.player != null) {
			for (Hack hack : HackManager.INSTANCE.getEnabledHacks()) {
				hack.onTick();
			}
		}
	}
}
