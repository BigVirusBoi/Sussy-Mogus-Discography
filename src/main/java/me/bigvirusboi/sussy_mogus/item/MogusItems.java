package me.bigvirusboi.sussy_mogus.item;

import me.bigvirusboi.sussy_mogus.SussyMogus;
import me.bigvirusboi.sussy_mogus.sound.MogusSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;

public class MogusItems {
    public static final Item MUSIC_DISC_AMOGUS = registerRecord(MogusSounds.AMOGUS, 2, 25);

    public static final Item MUSIC_DISC_WHERES_MY_PIPE = registerRecord(MogusSounds.WHERES_MY_PIPE, 1, 35);
    public static final Item MUSIC_DISC_CRACKS_IN_THE_MIRROR_P1 = registerRecord(MogusSounds.CRACKS_IN_THE_MIRROR_P1, 1, 35);
    public static final Item MUSIC_DISC_CRACKS_IN_THE_MIRROR_P2 = registerRecord(MogusSounds.CRACKS_IN_THE_MIRROR_P2, 1, 42);
    public static final Item MUSIC_DISC_LOST_IN_THE_SMOKE = registerRecord(MogusSounds.LOST_IN_THE_SMOKE, 1, 42);
    public static final Item MUSIC_DISC_CRACKHEADS_LULLABY = registerRecord(MogusSounds.CRACKHEADS_LULLABY, 3, 31);
    public static final Item MUSIC_DISC_IN_THE_GRIP_OF_THE_PIPE = registerRecord(MogusSounds.IN_THE_GRIP_OF_THE_PIPE, 3, 22);
    public static final Item MUSIC_DISC_RAVAGED_BY_THE_ROCK = registerRecord(MogusSounds.RAVAGED_BY_THE_ROCK, 2, 32);
    public static final Item MUSIC_DISC_IN_THE_ABYSS_OF_THE_PIPE = registerRecord(MogusSounds.IN_THE_ABYSS_OF_THE_PIPE, 2, 13);
    public static final Item MUSIC_DISC_IN_THE_DEPTHS_OF_ROCK_BOTTOM = registerRecord(MogusSounds.IN_THE_DEPTHS_OF_ROCK_BOTTOM, 1, 43);
    public static final Item MUSIC_DISC_LOST_IN_THE_CRACKVERSE = registerRecord(MogusSounds.LOST_IN_THE_CRACKVERSE, 2, 22);

    public static final Item MUSIC_DISC_OVERWINNINGSGEWIJS_VERNEDERD = registerRecord(MogusSounds.OVERWINNINGSGEWIJS_VERNEDERD, 1, 47);

    private static int count = 0;

    private static Item registerRecord(SoundEvent sound, int minutes, int seconds) {
        count++;
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SussyMogus.MOD_ID, sound.getLocation().getPath().replaceAll("\\.", "_")),
                new RecordItem(count, sound, new FabricItemSettings().maxCount(1), (minutes * 60) + seconds));
    }

    public static void addItemsToItemGroup() {
        //addToItemGroup(MogusTab.TAB, MUSIC_BOX_MUSIC_DISC);
    }

    private static void addToItemGroup(ResourceKey<CreativeModeTab> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.accept(item));
    }

    public static void registerItems() {
        SussyMogus.LOGGER.info("Registering Mod Items for " + SussyMogus.MOD_ID);

        addItemsToItemGroup();
    }
}
