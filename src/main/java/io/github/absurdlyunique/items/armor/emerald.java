package io.github.absurdlyunique.items.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class emerald {
	public static final EmeraldMaterial Emerald = new EmeraldMaterial();
	public static final EmeraldArmorItem EMERALD_HELMET = new EmeraldArmorItem(Emerald, ArmorItem.ArmorSlot.HELMET, new Item.Settings());
	public static final EmeraldArmorItem EMERALD_CHESTPLATE = new EmeraldArmorItem(Emerald, ArmorItem.ArmorSlot.CHESTPLATE, new Item.Settings());
	public static final EmeraldArmorItem EMERALD_LEGGINGS = new EmeraldArmorItem(Emerald, ArmorItem.ArmorSlot.LEGGINGS, new Item.Settings());
	public static final EmeraldArmorItem EMERALD_BOOTS = new EmeraldArmorItem(Emerald, ArmorItem.ArmorSlot.BOOTS, new Item.Settings());
}
