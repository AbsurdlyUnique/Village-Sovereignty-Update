package io.github.absurdlyunique.datagen.generators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class BlockLootTableGenerator extends FabricBlockLootTableProvider {
	public BlockLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	/**
	 * Implement this method to add block drops.
	 *
	 * <p>Use the range of {@link BlockLootTableGenerator#addDrop} methods to generate block drops.
	 */
	@Override
	public void generate() {
		//
		// We will create our custom loot tables here...
		//
	}
}
