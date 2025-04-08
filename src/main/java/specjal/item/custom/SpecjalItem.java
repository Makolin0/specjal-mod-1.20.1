package specjal.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import specjal.sound.ModSounds;

import java.util.List;

public class SpecjalItem extends Item {
    public SpecjalItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // wykonuje dźwięk tylko na serwerze
        if(!world.isClient) {
            world.playSound(null, user.getBlockPos(), ModSounds.BURP, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        return super.finishUsing(stack, world, user);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.specjal-mod.specjal").formatted(Formatting.DARK_PURPLE, Formatting.ITALIC));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
