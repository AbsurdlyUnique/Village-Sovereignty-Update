package io.github.absurdlyunique.datagen.generators;

import io.github.absurdlyunique.items.tools.emerald;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import static io.github.absurdlyunique.items.armor.emerald.*;

public class LangGenerator_en_us extends FabricLanguageProvider {
	public LangGenerator_en_us(FabricDataOutput dataOutput) {
		super(dataOutput, "en_us");
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
		//
		// We will create our custom translations here...
		//
		translationBuilder.add(emerald.EMERALD_SWORD, "Emerald Sword");
		translationBuilder.add(emerald.EMERALD_PICKAXE, "Emerald Pickaxe");
		translationBuilder.add(emerald.EMERALD_SHOVEL, "Emerald Shovel");
		translationBuilder.add(emerald.EMERALD_AXE, "Emerald Axe");
		translationBuilder.add(emerald.EMERALD_HOE, "Emerald Hoe");

		translationBuilder.add(EMERALD_HELMET, "Emerald Helmet");
		translationBuilder.add(EMERALD_CHESTPLATE, "Emerald Chestplate");
		translationBuilder.add(EMERALD_LEGGINGS, "Emerald Leggings");
		translationBuilder.add(EMERALD_BOOTS, "Emerald Boots");
	}
}
