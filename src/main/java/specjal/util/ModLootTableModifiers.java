package specjal.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import specjal.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier GRASS_ID = new Identifier("minecraft", "blocks/grass");

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, lootTableId, supplier, lootData) -> {
            if(GRASS_ID.equals(lootTableId)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.125f))
                        .with(ItemEntry.builder(ModItems.HOP_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)));

                supplier.pool(poolBuilder.build());
            }
        });
    }
}
