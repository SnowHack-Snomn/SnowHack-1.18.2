package net.snomn.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.snomn.testmod.hack.Hack;
import net.snomn.testmod.hack.HackManager;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {

	public static final TestMod INSTANCE = new TestMod();
	public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

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
