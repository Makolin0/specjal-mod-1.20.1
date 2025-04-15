package specjal.world.dimension;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import specjal.SpecjalMod;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> SPECJAL_DIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION, new Identifier(SpecjalMod.MOD_ID, "specjal_dim"));
    public static final RegistryKey<World> SPECJAL_DIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD, new Identifier(SpecjalMod.MOD_ID, "specjal_dim"));
    public static final RegistryKey<DimensionType> SPECJAL_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier(SpecjalMod.MOD_ID, "specjal_dim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(SPECJAL_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixed time
                false, // has skylight
                false, // has ceiling
                false, // ultra warm
                true, // natural
                1.0, // coordinate scale
                true, // bed works
                false, // respawn anchor works
                0, // min Y
                256, // height
                256, // logical height
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effects location
                1.0f, // ambient light
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)
        ));
    }
}
