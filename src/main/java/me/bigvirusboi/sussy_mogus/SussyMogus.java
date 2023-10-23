package me.bigvirusboi.sussy_mogus;

import me.bigvirusboi.sussy_mogus.item.MogusItems;
import me.bigvirusboi.sussy_mogus.item.MogusTab;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SussyMogus implements ModInitializer {
    public static final String MOD_ID = "sussy_mogus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MogusItems.registerItems();
        MogusTab.registerTab();
    }
}