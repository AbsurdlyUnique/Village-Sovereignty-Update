package io.github.absurdlyunique.datagen.generators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class LangGeneratorDE_DE extends FabricLanguageProvider {
	public LangGeneratorDE_DE(FabricDataOutput dataOutput) {
		super(dataOutput, "de_de");
	}

	/**
	 * Implement this method to register languages.
	 *
	 * <p>Call {@link TranslationBuilder#add(String, String)} to add a translation.
	 *
	 * @param translationBuilder
	 */
	@Override
	public void generateTranslations(TranslationBuilder translationBuilder) {

	}
}
