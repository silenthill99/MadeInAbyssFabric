package fr.silenthill99.made_in_abyss_mod.init;

import fr.silenthill99.made_in_abyss_mod.Main;
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

    public ModItems() {

    }
    public static final Item TEST = Registry.register(Registries.ITEM, testId, new Item(
            new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, testId))
    ));

    public static void registerItems() {
        Main.LOGGER.info("Register mod items for : " + Main.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST);
        });
    }

}
