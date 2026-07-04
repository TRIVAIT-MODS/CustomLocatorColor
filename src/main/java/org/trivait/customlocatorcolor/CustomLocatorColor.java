package org.trivait.customlocatorcolor;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trivait.customlocatorcolor.config.Config;

public class CustomLocatorColor implements ClientModInitializer {
	public static final String MOD_ID = "customlocatorcolor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Config CONFIG;

	@Override
	public void onInitializeClient() {
		AutoConfig.register(Config.class, GsonConfigSerializer::new);
		CONFIG = AutoConfig.getConfigHolder(Config.class).getConfig();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
