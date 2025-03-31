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

public class ModBlocks {
    public static final Block SPECJAL_BLOCK = registerBlock(
            "specjal_block",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.PALE_YELLOW)
                    .instrument(Instrument.XYLOPHONE)
//                    .requiresTool()
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BONE))
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SpecjalMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SpecjalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        SpecjalMod.LOGGER.info("Registering blocks for " + SpecjalMod.MOD_ID);
    }
}
