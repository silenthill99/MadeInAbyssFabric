package fr.silenthill99.made_in_abyss_mod.data;

import fr.silenthill99.made_in_abyss_mod.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.*;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> orThrow = wrapperLookup.getOrThrow(RegistryKeys.ITEM);
                ShapedRecipeJsonBuilder.create(orThrow, RecipeCategory.MISC, ModItems.TEST)
                        .pattern("0")
                        .pattern("0")
                        .pattern("0")
                        .input('0', Blocks.BLACK_WOOL)
                        .criterion("unlock", conditionsFromItem(Blocks.BLACK_WOOL))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
