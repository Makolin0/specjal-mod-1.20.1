package specjal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;

import net.minecraft.registry.Registry;
import specjal.block.custom.HopCropBlock;

public class ModBlocks {

    // dodajemy bloki i ustawiamy ich parametry
    // Zamiast podawac każdy parametr, można skopiować od istniejącego bloku
    // FabricBlockSettings.copyOf(Blocks.BLOCK_NAME)
    // zamiast Block, można użyć również typu ExperienceDroppingBlock(FabricBlockSetings..., UniformIntProvider.create(MIN_EXP, MAX_EXP))
    // chyba oczywiste co robi

    public static final Block SPECJAL_BLOCK = registerBlock(
            "specjal_block",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(Instrument.XYLOPHONE)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BONE))
    );

    public static final Block HOP_CROP = Registry.register(Registries.BLOCK, new Identifier(SpecjalMod.MOD_ID, "hop_crop"),
            new HopCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // funkcja do łatwej rejestracji bloku
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SpecjalMod.MOD_ID, name), block);
    }

    // blok musi mieć również swoje odzwierciedlenie jako przedmiot w ekwipunku
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SpecjalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        SpecjalMod.LOGGER.info("Registering blocks for " + SpecjalMod.MOD_ID);
    }
}
