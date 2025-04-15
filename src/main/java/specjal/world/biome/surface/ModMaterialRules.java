package specjal.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import specjal.block.ModBlocks;
import specjal.world.biome.ModBiomes;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule SPECJAL_BLOCK = makeStateRule(ModBlocks.SPECJAL_BLOCK);
    private static final MaterialRules.MaterialRule ASBESTOS_ORE = makeStateRule(ModBlocks.ASBESTOS_ORE);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.SPECJAL_BIOME),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, SPECJAL_BLOCK)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ASBESTOS_ORE)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
