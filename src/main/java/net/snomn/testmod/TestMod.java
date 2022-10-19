package net.snomn.testmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {

	public static final TestMod INSTANCE = new TestMod();
	public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello World Of Cheating!");
	}

	public void onKeyPress(int key, int action) {

	}

	public void onTick() {

	}
}
