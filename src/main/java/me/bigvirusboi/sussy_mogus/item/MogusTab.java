package me.bigvirusboi.sussy_mogus.item;

import me.bigvirusboi.sussy_mogus.SussyMogus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MogusTab {
    public static CreativeModeTab TAB;

    public static void registerTab() {
        TAB = FabricItemGroup.builder()
                .title(Component.translatable("item_group." + SussyMogus.MOD_ID + ".mogus"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(MogusItems.MUSIC_DISC_AMOGUS);

                    output.accept(MogusItems.MUSIC_DISC_WHERES_MY_PIPE);
                    output.accept(MogusItems.MUSIC_DISC_CRACKS_IN_THE_MIRROR_P1);
                    output.accept(MogusItems.MUSIC_DISC_CRACKS_IN_THE_MIRROR_P2);
                    output.accept(MogusItems.MUSIC_DISC_LOST_IN_THE_SMOKE);
                    output.accept(MogusItems.MUSIC_DISC_IN_THE_DEPTHS_OF_ROCK_BOTTOM);
                    output.accept(MogusItems.MUSIC_DISC_CRACKHEADS_LULLABY);
                    output.accept(MogusItems.MUSIC_DISC_IN_THE_GRIP_OF_THE_PIPE);
                    output.accept(MogusItems.MUSIC_DISC_RAVAGED_BY_THE_ROCK);
                    output.accept(MogusItems.MUSIC_DISC_IN_THE_ABYSS_OF_THE_PIPE);
                    output.accept(MogusItems.MUSIC_DISC_LOST_IN_THE_CRACKVERSE);

                    output.accept(MogusItems.MUSIC_DISC_OVERWINNINGSGEWIJS_VERNEDERD);
                })
                .icon(() -> new ItemStack(MogusItems.MUSIC_DISC_AMOGUS)).build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(SussyMogus.MOD_ID, "mogus"), TAB);
    }
}
