package specjal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import specjal.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        // tu dodajemy itemy do tagów
        // chyba oczywiste co te tagi dają
        // inne można zobaczyć zaglądając do klasy BlockTags

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.AKCENT_KYLIE_MUSIC_DISC);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.AKCENT_KYLIE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ETERNIT_HELMET, ModItems.ETERNIT_CHESTPLATE, ModItems.ETERNIT_LEGGINGS, ModItems.ETERNIT_BOOTS);
    }
}
