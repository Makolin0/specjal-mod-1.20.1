package specjal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;

public class ModItemGroups {
    public static final ItemGroup SPECJAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpecjalMod.MOD_ID, "specjal"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.specjal"))
                    .icon(()->new ItemStack(ModItems.SPECJAL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPECJAL);
                    })
                    .build());


    public static void registerItemGroups() {
        SpecjalMod.LOGGER.info("Registering item groups for " + SpecjalMod.MOD_ID);

    }
}
