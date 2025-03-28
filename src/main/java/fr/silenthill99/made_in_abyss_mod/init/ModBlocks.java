package fr.silenthill99.made_in_abyss_mod.init;

import fr.silenthill99.made_in_abyss_mod.Main;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    static Identifier redWoolButtonId = Identifier.of(Main.MOD_ID, "red_wool_button");

    public static ButtonBlock RED_WOOL_BUTTON = createBlock(redWoolButtonId, new ButtonBlock(
            BlockSetType.OAK, 20,
            AbstractBlock.Settings.copy(Blocks.RED_WOOL)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, redWoolButtonId))
    ));

    public static <T extends Block> T createBlock(Identifier id, T block) {
        Identifier itemId = Identifier.of(Main.MOD_ID, id.getPath());
        ModItems.createItem(itemId, new BlockItem(block, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, itemId)))
        );
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerBlock() {
        Main.LOGGER.info("Register mod blocks for : " + Main.MOD_ID);
    }

}
