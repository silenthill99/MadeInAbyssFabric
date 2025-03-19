package fr.silenthill99.made_in_abyss_mod.utils;

import fr.silenthill99.made_in_abyss_mod.Main;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {

    public static final SoundEvent SACRIFICED_FLOWERS = Registry.register(
            Registries.SOUND_EVENT, Identifier.of(Main.MOD_ID, "sacrificed_flowers"),
            SoundEvent.of(Identifier.of(Main.MOD_ID, "sacrificed_flowers"))
    );

    public static RegistryKey<JukeboxSong> convertToJukeboxSong(SoundEvent sound) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, sound.id());
    }

    public static void registerSoundEvents() {
        Main.LOGGER.info("Register mod sound events for : " + Main.MOD_ID);
    }

}
