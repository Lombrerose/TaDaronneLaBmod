package net.lombrerose.tdlb.item;

import net.lombrerose.tdlb.TaDaronneLaB;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class tdlbitem {

    public static final Item TABLEAU_DIVIN = registerItem("tableau_divin", new Item(new Item.Settings()));

    public static final Item EPEE_DIVINE = registerItem("epee_divine", new SwordItem(tdlboutils.DIVIN, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(tdlboutils.DIVIN, 13, -1))));
    public static final Item HACHE_DIVINE = registerItem("hache_divine", new AxeItem(tdlboutils.DIVIN, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(tdlboutils.DIVIN, 14, -2))));
    public static final Item PIOCHE_DIVINE = registerItem("pioche_divine", new PickaxeItem(tdlboutils.DIVIN, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(tdlboutils.DIVIN, 5, -1.5f))));
    public static final Item FAUX_DIVINE = registerItem("faux_divine", new HoeItem(tdlboutils.DIVIN, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(tdlboutils.DIVIN, 15, 2))));
    public static final Item PELLE_DIVINE = registerItem("pelle_divine", new ShovelItem(tdlboutils.DIVIN, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(tdlboutils.DIVIN, 2, 1.5f))));

    private static Item registerItem(String name, Item item){
       return Registry.register(Registries.ITEM, Identifier.of(TaDaronneLaB.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TaDaronneLaB.LOGGER.info("chargement des items pour " + TaDaronneLaB.MOD_ID);
    }
}
