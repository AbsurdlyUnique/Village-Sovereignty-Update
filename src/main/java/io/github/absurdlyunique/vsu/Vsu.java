package io.github.absurdlyunique.vsu;

import io.github.absurdlyunique.items.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vsu implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Village Sovereignty Update");
	public static final String MOD_ID = "vsu";

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
		ModItems.registerItem();
    }
}
