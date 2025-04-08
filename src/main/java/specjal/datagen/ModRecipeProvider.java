package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;
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
        ItemStack waterBottle = new ItemStack(Items.POTION);
        waterBottle.getOrCreateNbt().putString("Potion", "minecraft:water");

        // jest naprawdę dużo wbudowanych generatorów
        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SPECJAL, RecipeCategory.FOOD, ModBlocks.SPECJAL_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SPECJAL)
                .input(Items.WHEAT)
                .input(Ingredient.ofStacks(waterBottle))
                .input(ModItems.HOPS)
                .criterion("has_hops", conditionsFromItem(ModItems.HOPS))
                .criterion("has_hop_seeds", conditionsFromItem(ModItems.HOP_SEEDS))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "specjal_from_hops"));

        createStairsRecipe(ModBlocks.ETERNIT_STAIRS, Ingredient.ofItems(ModItems.ETERNIT))
                .criterion("has_eternit", conditionsFromItem(ModItems.ETERNIT))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "eternit_stairs_from_eternit"));
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ETERNIT_SLAB, ModItems.ETERNIT);
        offerSingleOutputShapelessRecipe(consumer, ModBlocks.ETERNIT_BUTTON, ModItems.ETERNIT, "eternit_button_from_eternit");
        offerPressurePlateRecipe(consumer, ModBlocks.ETERNIT_PRESSURE_PLATE, ModItems.ETERNIT);
        createFenceRecipe(ModBlocks.ETERNIT_FENCE, Ingredient.ofItems(ModItems.ETERNIT))
                .criterion("has_eternit", conditionsFromItem(ModItems.ETERNIT))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "eternit_fence_from_eternit"));
        createFenceGateRecipe(ModBlocks.ETERNIT_FENCE_GATE, Ingredient.ofItems(ModItems.ETERNIT))
                .criterion("has_eternit", conditionsFromItem(ModItems.ETERNIT))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "eternit_fence_gate_from_eternit"));
        offerWallRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ETERNIT_WALL, ModItems.ETERNIT);
        createDoorRecipe(ModBlocks.ETERNIT_DOOR, Ingredient.ofItems(ModItems.ETERNIT))
                .criterion("has_eternit", conditionsFromItem(ModItems.ETERNIT))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "eternit_door_from_eternit"));
        createTrapdoorRecipe(ModBlocks.ETERNIT_TRAPDOOR, Ingredient.ofItems(ModItems.ETERNIT))
                .criterion("has_eternit", conditionsFromItem(ModItems.ETERNIT))
                .offerTo(consumer, new Identifier(SpecjalMod.MOD_ID, "eternit_trapdoor_from_eternit"));


        // tą klasą tworzymy unikalne receptury
//        ShapedRecipeJsonBuilder.create(...)...

    }
}
