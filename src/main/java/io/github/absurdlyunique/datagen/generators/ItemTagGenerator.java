package io.github.absurdlyunique.datagen.generators;

import io.github.absurdlyunique.items.ModItems;
import io.github.absurdlyunique.items.armor.emerald;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends ItemTagProvider {
	public ItemTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider arg) {
		getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
			.add(emerald.EMERALD_HELMET, emerald.EMERALD_CHESTPLATE, emerald.EMERALD_LEGGINGS, emerald.EMERALD_BOOTS);
	}
}
