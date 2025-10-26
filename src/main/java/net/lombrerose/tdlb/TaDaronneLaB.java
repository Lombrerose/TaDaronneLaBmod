package net.lombrerose.tdlb;

import net.fabricmc.api.ModInitializer;

import net.lombrerose.tdlb.item.tdlbitem;
import net.lombrerose.tdlb.item.tdlbitemgroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaDaronneLaB implements ModInitializer {
	public static final String MOD_ID = "tdlb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        tdlbitem.registerModItems();
        tdlbitemgroup.registerItemGroup();
	}
}