package fr.silenthill99.made_in_abyss_mod;

import fr.silenthill99.made_in_abyss_mod.data.ModRecipeGenerator;
import fr.silenthill99.made_in_abyss_mod.data.ModelGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MainDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
	}
}
