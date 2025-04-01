package specjal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;

public class ModItems {
    public static final Item SPECJAL = registerItem("specjal", new Item(new FabricItemSettings().food(ModFoodComponents.SPECJAL)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPECJAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpecjalMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpecjalMod.LOGGER.info("Registering Mod Items for " + SpecjalMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
