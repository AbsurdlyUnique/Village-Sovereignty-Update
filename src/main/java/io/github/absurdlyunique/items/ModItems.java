package io.github.absurdlyunique.items;

import io.github.absurdlyunique.items.tools.emerald;
import io.github.absurdlyunique.vsu.Vsu;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;

public class ModItems {
	public static void registerItem() {
		// tools
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_sword"), emerald.EMERALD_SWORD);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_pickaxe"), emerald.EMERALD_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_shovel"), emerald.EMERALD_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_axe"), emerald.EMERALD_AXE);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_hoe"), emerald.EMERALD_HOE);

		// Armor
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_helmet"), io.github.absurdlyunique.items.armor.emerald.EMERALD_HELMET);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_chestplate"), io.github.absurdlyunique.items.armor.emerald.EMERALD_CHESTPLATE);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_leggings"), io.github.absurdlyunique.items.armor.emerald.EMERALD_LEGGINGS);
		Registry.register(Registries.ITEM, new Identifier(Vsu.MOD_ID, "emerald_boots"), io.github.absurdlyunique.items.armor.emerald.EMERALD_BOOTS);
	}

	public static void registerItemGroup() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((entries) -> {
			entries.addItem(emerald.EMERALD_SWORD);
			entries.addItem(emerald.EMERALD_PICKAXE);
			entries.addItem(emerald.EMERALD_SHOVEL);
			entries.addItem(emerald.EMERALD_AXE);
			entries.addItem(emerald.EMERALD_HOE);
		});
	}


}
