package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import specjal.block.ModBlocks;
import specjal.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // dodajemy modele bloków
        // jak wyglądają w ekwipunku i wyrzucone, nie jak postawione

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPECJAL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // dodajemy modele przedmiotów

        // Models.GENERATED znaczy że wygląda jak gruby model 2D. Czyli jak 90% przedmiotów.
        itemModelGenerator.register(ModItems.SPECJAL, Models.GENERATED);
    }
}
