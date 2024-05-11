package io.github.absurdlyunique.items.tools;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum Material implements ToolMaterial, ArmorMaterial {

	EMERALD(3, 2000, 9.0F, 3.0F, 28, () -> {
		return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
	});

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Lazy<Ingredient> repairIngredient;

	private Material(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = new Lazy(repairIngredient);
	}

	public int getDurability() {
		return this.itemDurability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	/**
	 * @param slot
	 * @return
	 */
	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return 0;
	}

	/**
	 * @param slot
	 * @return
	 */
	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return 0;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	/**
	 * @return
	 */
	@Override
	public SoundEvent getEquipSound() {
		return null;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredient.get();
	}

	/**
	 * @return
	 */
	@Override
	public String getName() {
		return "";
	}

	/**
	 * @return
	 */
	@Override
	public float getToughness() {
		return 0;
	}

	/**
	 * @return
	 */
	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}
