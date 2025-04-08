package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import specjal.block.ModBlocks;
import specjal.block.custom.HopCropBlock;
import specjal.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        // przykłady użycia można zobaczyć w klasie BlockLootTableGenerator w bibliotece minecraft-merged>net>minecraft>data>server>loottable

        // blok będzie wyrzucał siebie
        addDrop(ModBlocks.SPECJAL_BLOCK);

        // dodanie rośliny uprawnej, aby wyrzucała przedmioty tylko gdy jest dojrzała
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.HOP_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(HopCropBlock.AGE, 5));
        addDrop(ModBlocks.HOP_CROP, cropDrops(ModBlocks.HOP_CROP, ModItems.HOPS, ModItems.HOP_SEEDS, builder));
    }
}
