package specjal.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import specjal.sound.ModSounds;

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
}
