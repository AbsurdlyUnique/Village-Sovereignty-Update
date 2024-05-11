package io.github.absurdlyunique.datagen.generators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipesProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeCategory;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.recipe.api.builder.ShapedRecipeBuilder;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {

	public RecipeGenerator(FabricDataOutput output) {
		super(output);
	}

	/**
	 * Implement this method and then use the range of methods in {@link RecipesProvider} or from one of the recipe json factories such as {@link ShapedRecipeJsonFactory} or {@link ShapelessRecipeJsonFactory}.
	 *
	 * @param exporter
	 */
	@Override
	public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

		//
		// We will create our custom recipes here...
		//
//		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, Items.DIAMOND, 1)
//				.pattern("###")
//				.pattern("###")
//				.pattern("###")
//				.ingredient('#', Items.DIAMOND_BLOCK)
//				.criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
//				.offerTo(exporter, new Identifier(getRecipeName(Items.DIAMOND_BLOCK) + "_from_diamonds"));
	}
}
