package specjal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;
import specjal.block.ModBlocks;

public class ModItems {
    // Dodajemy przedmioty
    public static final Item SPECJAL = registerItem("specjal", new Item(
            new FabricItemSettings().food(ModFoodComponents.SPECJAL)));

    public static final Item HOP_SEEDS = registerItem("hop_seeds",
            new AliasedBlockItem(ModBlocks.HOP_CROP, new FabricItemSettings()));
    public static final Item HOPS = registerItem("hops",
            new Item(new FabricItemSettings()));

    public static final Item SPECJAL_SWORD = registerItem("specjal_sword",
            new SwordItem(ModToolMaterial.SPECJAL, 6, 2f, new FabricItemSettings()));
    public static final Item SPECJAL_PICKAXE = registerItem("specjal_pickaxe",
            new PickaxeItem(ModToolMaterial.SPECJAL, 6, 2f, new FabricItemSettings()));
    public static final Item SPECJAL_AXE = registerItem("specjal_axe",
            new AxeItem(ModToolMaterial.SPECJAL, 6, 2f, new FabricItemSettings()));
    public static final Item SPECJAL_SHOVEL = registerItem("specjal_shovel",
            new ShovelItem(ModToolMaterial.SPECJAL, 6, 2f, new FabricItemSettings()));
    public static final Item SPECJAL_HOE = registerItem("specjal_hoe",
            new HoeItem(ModToolMaterial.SPECJAL, 6, 2f, new FabricItemSettings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPECJAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpecjalMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpecjalMod.LOGGER.info("Registering Mod Items for " + SpecjalMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup);
    }
}
