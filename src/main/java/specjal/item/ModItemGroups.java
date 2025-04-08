package specjal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;
import specjal.block.ModBlocks;

public class ModItemGroups {
    // dodajemy grupy w zakładkach w trybie kreatywnym

    public static final ItemGroup SPECJAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpecjalMod.MOD_ID, "specjal"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.specjal"))
                    .icon(()->new ItemStack(ModItems.SPECJAL))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.SPECJAL);
                        entries.add(ModBlocks.SPECJAL_BLOCK);

                        entries.add(ModItems.HOP_SEEDS);
                        entries.add(ModItems.HOPS);

                        entries.add(ModItems.SPECJAL_SWORD);
                        entries.add(ModItems.SPECJAL_PICKAXE);
                        entries.add(ModItems.SPECJAL_AXE);
                        entries.add(ModItems.SPECJAL_SHOVEL);
                        entries.add(ModItems.SPECJAL_HOE);

                        entries.add(ModItems.ASBESTOS);
                        entries.add(ModBlocks.ASBESTOS_ORE);
                        entries.add(ModItems.ETERNIT);

                        entries.add(ModBlocks.ETERNIT_BLOCK);
                        entries.add(ModBlocks.ETERNIT_STAIRS);
                        entries.add(ModBlocks.ETERNIT_SLAB);
                        entries.add(ModBlocks.ETERNIT_BUTTON);
                        entries.add(ModBlocks.ETERNIT_PRESSURE_PLATE);
                        entries.add(ModBlocks.ETERNIT_FENCE);
                        entries.add(ModBlocks.ETERNIT_FENCE_GATE);
                        entries.add(ModBlocks.ETERNIT_WALL);
                        entries.add(ModBlocks.ETERNIT_DOOR);
                        entries.add(ModBlocks.ETERNIT_TRAPDOOR);
                    })
                    .build());


    public static void registerItemGroups() {
        SpecjalMod.LOGGER.info("Registering item groups for " + SpecjalMod.MOD_ID);

    }
}
