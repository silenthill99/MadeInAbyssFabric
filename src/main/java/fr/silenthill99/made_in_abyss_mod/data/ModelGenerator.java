package fr.silenthill99.made_in_abyss_mod.data;

import fr.silenthill99.made_in_abyss_mod.init.ModBlocks;
import fr.silenthill99.made_in_abyss_mod.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ModelGenerator extends FabricModelProvider {

    Item[] MUSIC_DISCS = {ModItems.SACRIFICED_FLOWER};

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool redWoolTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        redWoolTexturePool.button(ModBlocks.RED_WOOL_BUTTON);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        for (Item cd : MUSIC_DISCS) {
            itemModelGenerator.register(cd, Items.MUSIC_DISC_MELLOHI, Models.GENERATED);
        }
    }
}