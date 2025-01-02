package net.cofi.modid;

import net.cofi.modid.block.ModBlocks;
import net.cofi.modid.item.ModItemGroups;
import net.cofi.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProbniMod implements ModInitializer {
	public static final String MOD_ID = "modid";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.rig();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}