package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import specjal.block.ModBlocks;
import specjal.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
//    private static final List<ItemConvertible> ASBESTOS_SMELTABLES = List.of();

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
//        offerSmelting(consumer, ASBESTOS_SMELTABLES, RecipeCategory.MISC, ModItems.ETERNIT, 0.7f, 200, "specjal");
//        offerBlasting(consumer, ASBESTOS_SMELTABLES, RecipeCategory.MISC, ModItems.ETERNIT, 0.7f, 100, "specjal");

        // jest naprawdę dużo wbudowanych generatorów
        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SPECJAL, RecipeCategory.FOOD, ModBlocks.SPECJAL_BLOCK);

        // tą klasą tworzymy unikalne receptury
//        ShapedRecipeJsonBuilder.create(...)...
    }
}
