package specjal.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import specjal.SpecjalMod;

public class ModSounds {
    public static final SoundEvent BURP = registerSoundEvent("burp");

    public static final SoundEvent AKCENT_KYLIE = registerSoundEvent("akcent_kylie");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SpecjalMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SpecjalMod.LOGGER.info("Registering Sounds for " + SpecjalMod.MOD_ID);
    }
}
