package io.github.absurdlyunique.datagen.generators;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;

import java.util.function.Consumer;

public class AdvancementsGenerator extends FabricAdvancementProvider {

	public AdvancementsGenerator(FabricDataOutput output) {
		super(output);
	}

	/**
	 * Implement this method to register advancements to generate use the consumer callback to register advancements.
	 *
	 * <p>Use {@link Advancement.Task#build(Consumer, String)} to help build advancements.
	 *
	 * @param consumer
	 */
	@Override
	public void generateAdvancement(Consumer<Advancement> consumer) {
		//
		// We will create our custom advancements here...
		//
	}
}
