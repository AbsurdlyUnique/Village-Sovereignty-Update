package io.github.absurdlyunique.datagen.generators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

import static io.github.absurdlyunique.items.armor.emerald.*;
import static io.github.absurdlyunique.items.tools.emerald.*;

public class ModelGenerator extends FabricModelProvider {
	public ModelGenerator(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		//
		// We will create our custom block state models here...
		//

	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		//
		// We will create our custom item models here...
		//
		itemModelGenerator.register(EMERALD_SWORD, Models.HANDHELD);
		itemModelGenerator.register(EMERALD_PICKAXE, Models.HANDHELD);
		itemModelGenerator.register(EMERALD_AXE, Models.HANDHELD);
		itemModelGenerator.register(EMERALD_HOE, Models.HANDHELD);
		itemModelGenerator.register(EMERALD_SHOVEL, Models.HANDHELD);

//		itemModelGenerator.register(EMERALD_HELMET, Models.SINGLE_LAYER_ITEM);
//		itemModelGenerator.register(EMERALD_CHESTPLATE, Models.SINGLE_LAYER_ITEM);
//		itemModelGenerator.register(EMERALD_LEGGINGS, Models.SINGLE_LAYER_ITEM);
//		itemModelGenerator.register(EMERALD_BOOTS, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.method_48523(EMERALD_HELMET);
		itemModelGenerator.method_48523(EMERALD_CHESTPLATE);
		itemModelGenerator.method_48523(EMERALD_LEGGINGS);
		itemModelGenerator.method_48523(EMERALD_BOOTS);
	}
}
