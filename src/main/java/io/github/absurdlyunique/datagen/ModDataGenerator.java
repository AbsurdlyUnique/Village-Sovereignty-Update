package io.github.absurdlyunique.datagen;

import io.github.absurdlyunique.datagen.generators.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack dataGenerator = fabricDataGenerator.createPack();

		dataGenerator.addProvider(BlockTagGenerator::new);
		dataGenerator.addProvider(AdvancementsGenerator::new);
		dataGenerator.addProvider(BlockLootTableGenerator::new);
		dataGenerator.addProvider(ModelGenerator::new);
		dataGenerator.addProvider(RecipeGenerator::new);
		dataGenerator.addProvider(ItemTagGenerator::new);
		dataGenerator.addProvider(LangGenerator_en_us::new);
		dataGenerator.addProvider(LangGeneratorDE_DE::new);
	}
}
