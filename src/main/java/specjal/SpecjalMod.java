package specjal;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import specjal.block.ModBlocks;
import specjal.item.ModItemGroups;
import specjal.item.ModItems;
import specjal.sound.ModSounds;
import specjal.util.ModLootTableModifiers;
import specjal.world.gen.ModWorldGeneration;

public class SpecjalMod implements ModInitializer {
	public static final String MOD_ID = "specjal-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Funkcja wykonywana przy wczytywaniu gry. Ładujemy w niej całą modyfikację

		LOGGER.info("Initializing " + MOD_ID);

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();
		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();

		ModWorldGeneration.generateModWorldGen();
	}
}