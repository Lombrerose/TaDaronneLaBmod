package net.lombrerose.tdlb;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.lombrerose.tdlb.datagen.tdlbitemtag;
import net.lombrerose.tdlb.datagen.tdlbmodelprovider;
import net.lombrerose.tdlb.datagen.tdlbrecipies;

public class TaDaronneLaBDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(tdlbitemtag::new);
        pack.addProvider(tdlbmodelprovider::new);
        pack.addProvider(tdlbrecipies::new);
	}
}
