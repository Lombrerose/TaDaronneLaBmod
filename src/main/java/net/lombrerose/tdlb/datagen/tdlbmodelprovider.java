package net.lombrerose.tdlb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lombrerose.tdlb.item.tdlbitem;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class tdlbmodelprovider extends FabricModelProvider {
    public tdlbmodelprovider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(tdlbitem.HACHE_DIVINE, Models.HANDHELD);
        itemModelGenerator.register(tdlbitem.PIOCHE_DIVINE, Models.HANDHELD);
        itemModelGenerator.register(tdlbitem.FAUX_DIVINE, Models.HANDHELD);
        itemModelGenerator.register(tdlbitem.PELLE_DIVINE, Models.HANDHELD);
    }
}
