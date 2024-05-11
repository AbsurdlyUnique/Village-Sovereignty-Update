package io.github.absurdlyunique.items.tools;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import io.github.absurdlyunique.items.tools.Material;

public class emerald {
	// create a sword
	public static final ToolItem EMERALD_SWORD = new SwordItem(Material.EMERALD, 3, -2.4F, new Item.Settings());
	// create a pickaxe
	public static final ToolItem EMERALD_PICKAXE = new PickaxeItem(Material.EMERALD, 1, -2.8F, new Item.Settings());
	// create a shovel
	public static final ToolItem EMERALD_SHOVEL = new ShovelItem(Material.EMERALD, 1.5F, -3.0F, new Item.Settings());
	// create an axe
	public static final ToolItem EMERALD_AXE = new AxeItem(Material.EMERALD, 5.0F, -3.0F, new Item.Settings());
	// create a hoe
	public static final ToolItem EMERALD_HOE = new HoeItem(Material.EMERALD, -3, 0.0F, new Item.Settings());
}
