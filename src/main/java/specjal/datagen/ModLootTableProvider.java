package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import specjal.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        // przykłady użycia można zobaczyć w klasie BlockLootTableGenerator w bibliotece minecraft-merged>net>minecraft>data>server>loottable

        // blok będzie wyrzucał siebie
        addDrop(ModBlocks.SPECJAL_BLOCK);
    }
}
