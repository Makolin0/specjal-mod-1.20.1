package specjal;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import specjal.block.ModBlocks;
import specjal.item.ModItemGroups;
import specjal.item.ModItems;

public class SpecjalMod implements ModInitializer {
	public static final String MOD_ID = "specjal-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();
	}
}