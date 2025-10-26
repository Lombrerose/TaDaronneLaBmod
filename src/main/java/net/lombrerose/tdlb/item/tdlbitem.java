package net.lombrerose.tdlb.item;

import net.lombrerose.tdlb.TaDaronneLaB;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class tdlbitem {

    public static final Item TABLEAU_DIVIN = registerItem("tableau_divin", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
       return Registry.register(Registries.ITEM, Identifier.of(TaDaronneLaB.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TaDaronneLaB.LOGGER.info("chargement des items pour " + TaDaronneLaB.MOD_ID);
    }
}
