package net.lombrerose.tdlb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lombrerose.tdlb.item.tdlbitem;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class tdlbitemtag extends FabricTagProvider.ItemTagProvider{


    public tdlbitemtag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS).add(tdlbitem.EPEE_DIVINE);
        getOrCreateTagBuilder(ItemTags.AXES).add(tdlbitem.HACHE_DIVINE);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(tdlbitem.PIOCHE_DIVINE);
        getOrCreateTagBuilder(ItemTags.HOES).add(tdlbitem.FAUX_DIVINE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(tdlbitem.PELLE_DIVINE);
    }
}
