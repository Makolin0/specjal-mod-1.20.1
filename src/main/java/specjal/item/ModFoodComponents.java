package specjal.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    // Tą wartość dodajemy przy tworzeniu przedmiotu
    public static final FoodComponent SPECJAL = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.25f)
            .build();

    public static final FoodComponent ASBESTOS_SOUP = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000), 1f)
            .build();}
