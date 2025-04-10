package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASBESTOS_ORE);

        BlockStateModelGenerator.BlockTexturePool eternitPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ETERNIT_BLOCK);
        eternitPool.stairs(ModBlocks.ETERNIT_STAIRS);
        eternitPool.slab(ModBlocks.ETERNIT_SLAB);
        eternitPool.button(ModBlocks.ETERNIT_BUTTON);
        eternitPool.pressurePlate(ModBlocks.ETERNIT_PRESSURE_PLATE);
        eternitPool.fence(ModBlocks.ETERNIT_FENCE);
        eternitPool.fenceGate(ModBlocks.ETERNIT_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.ETERNIT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ETERNIT_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // dodajemy modele przedmiotów

        // Models.GENERATED znaczy że wygląda jak gruby model 2D. Czyli jak 90% przedmiotów.
        itemModelGenerator.register(ModItems.SPECJAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPECJAL_SWORD, Models.GENERATED);

        itemModelGenerator.register(ModItems.HOPS, Models.GENERATED);

        itemModelGenerator.register(ModItems.ASBESTOS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASBESTOS_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ETERNIT, Models.GENERATED);

        itemModelGenerator.register(ModItems.AKCENT_KYLIE_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETERNIT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETERNIT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETERNIT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETERNIT_BOOTS);
    }
}
