package net.lombrerose.tdlb.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lombrerose.tdlb.TaDaronneLaB;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class tdlbitemgroup {

    public static final ItemGroup TA_DARONNE_LA_B = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TaDaronneLaB.MOD_ID, "ta_daronne_la_b"),
            FabricItemGroup.builder().icon(() -> new ItemStack(tdlbitem.TABLEAU_DIVIN))
                    .displayName(Text.translatable("itemgroup.tdlb.ta_daronne_la_b"))
                    .entries((displayContext, entries) -> {
                        entries.add(tdlbitem.TABLEAU_DIVIN);
                        entries.add(tdlbitem.EPEE_DIVINE);
                        entries.add(tdlbitem.HACHE_DIVINE);
                        entries.add(tdlbitem.PIOCHE_DIVINE);
                        entries.add(tdlbitem.FAUX_DIVINE);
                        entries.add(tdlbitem.PELLE_DIVINE);
                    })


                    .build());

    public static void registerItemGroup(){
        TaDaronneLaB.LOGGER.info("chargement des groupes d'items pour " + TaDaronneLaB.MOD_ID);
    }
}
