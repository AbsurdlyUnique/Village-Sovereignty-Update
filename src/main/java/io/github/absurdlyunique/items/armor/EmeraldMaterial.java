package io.github.absurdlyunique.items.armor;

import io.github.absurdlyunique.vsu.Vsu;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldMaterial implements ArmorMaterial {;
	private static final int[] DURABILITY = new int[]{100,160,100,100};
	private static final int[] PROTECTION = new int[]{2,8,4,2};
	/**
	 * @param slot
	 * @return
	 */
	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return DURABILITY[slot.getEquipmentSlot().LEGS.getEntitySlotId()] * 13;
	}

	/**
	 * @param slot
	 * @return
	 */
	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return PROTECTION[slot.getEquipmentSlot().LEGS.getEntitySlotId()];
	}

	/**
	 * @return
	 */
	@Override
	public int getEnchantability() {
		return 28;
	}

	/**
	 * @return
	 */
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
	}

	/**
	 * @return
	 */
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.EMERALD);
	}

	/**
	 * @return
	 */
	@Override
	public String getName() {
		return Vsu.MOD_ID + ":emerald";
	}

	/**
	 * @return
	 */
	@Override
	public float getToughness() {
		return 2;
	}

	/**
	 * @return
	 */
	@Override
	public float getKnockbackResistance() {
		return 0.2f;
	}
}
