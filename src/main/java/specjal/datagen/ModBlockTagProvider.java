package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import specjal.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        // tu dodajemy bloki do tagów
        // chyba oczywiste co te tagi dają
        // inne można zobaczyć zaglądając do klasy BlockTags

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SPECJAL_BLOCK)
                .add(ModBlocks.ASBESTOS_ORE)
                .add(ModBlocks.ETERNIT_BLOCK)
                .add(ModBlocks.ETERNIT_DOOR)
                .add(ModBlocks.ETERNIT_SLAB)
                .add(ModBlocks.ETERNIT_BUTTON)
                .add(ModBlocks.ETERNIT_STAIRS)
                .add(ModBlocks.ETERNIT_PRESSURE_PLATE)
                .add(ModBlocks.ETERNIT_TRAPDOOR)
                .add(ModBlocks.ETERNIT_FENCE)
                .add(ModBlocks.ETERNIT_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SPECJAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ASBESTOS_ORE)
                .add(ModBlocks.ETERNIT_BLOCK)
                .add(ModBlocks.ETERNIT_DOOR)
                .add(ModBlocks.ETERNIT_SLAB)
                .add(ModBlocks.ETERNIT_BUTTON)
                .add(ModBlocks.ETERNIT_STAIRS)
                .add(ModBlocks.ETERNIT_PRESSURE_PLATE)
                .add(ModBlocks.ETERNIT_TRAPDOOR)
                .add(ModBlocks.ETERNIT_FENCE)
                .add(ModBlocks.ETERNIT_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ETERNIT_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ETERNIT_FENCE_GATE);
//        getOrCreateTagBuilder(BlockTags.WALLS)


        // przykład jak stworzyć tag który wymaga netherite narzędzi
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
//        .add(ModBlocks.SPECJAL_BLOCK);
    }
}
