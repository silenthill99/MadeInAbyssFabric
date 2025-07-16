package fr.silenthill99.made_in_abyss_mod.init;

import fr.silenthill99.made_in_abyss_mod.Main;
import fr.silenthill99.made_in_abyss_mod.utils.ModSoundEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    static Identifier testId = Identifier.of(Main.MOD_ID, "test");
    static Identifier sacrificedFlowersId = Identifier.of(Main.MOD_ID, "sacrificed_flowers");

    public ModItems() {

    }
    public static final Item TEST = createItem(testId, new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, testId))
    ));

    public static final Item SACRIFICED_FLOWER = createItem(sacrificedFlowersId, new Item(
            new Item.Settings()
                    .jukeboxPlayable(ModSoundEvents.convertToJukeboxSong(ModSoundEvents.SACRIFICED_FLOWERS))
                    .maxCount(1)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, sacrificedFlowersId))
    ));

    public static <T extends Item> Item createItem(Identifier id, T item) {

        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerItems() {
        Main.LOGGER.info("Register mod items for : " + Main.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST);
            entries.add(SACRIFICED_FLOWER);
        });
    }

}
