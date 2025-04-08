package specjal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import specjal.block.ModBlocks;

public class MakoModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // inicjalizacja tylko dla klienta

        // puste miejsca w modelach faktycznie prześwitują
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOP_CROP, RenderLayer.getCutout());
    }
}
