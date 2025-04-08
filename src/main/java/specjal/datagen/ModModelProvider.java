package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import specjal.block.ModBlocks;
import specjal.block.custom.HopCropBlock;
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

        blockStateModelGenerator.registerCrop(ModBlocks.HOP_CROP, HopCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // dodajemy modele przedmiotów

        // Models.GENERATED znaczy że wygląda jak gruby model 2D. Czyli jak 90% przedmiotów.
        itemModelGenerator.register(ModItems.SPECJAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPECJAL_SWORD, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOPS, Models.GENERATED);
//        itemModelGenerator.register(ModItems.HOP_SEEDS, Models.GENERATED);
    }
}
