package me.bigvirusboi.sussy_mogus.sound;

import me.bigvirusboi.sussy_mogus.SussyMogus;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class MogusSounds {
    public static SoundEvent AMOGUS = registerSoundEvent("amogus");

    public static SoundEvent WHERES_MY_PIPE = registerSoundEvent("wheres_my_pipe");
    public static SoundEvent CRACKS_IN_THE_MIRROR_P1 = registerSoundEvent("cracks_in_the_mirror_p1");
    public static SoundEvent CRACKS_IN_THE_MIRROR_P2 = registerSoundEvent("cracks_in_the_mirror_p2");
    public static SoundEvent LOST_IN_THE_SMOKE = registerSoundEvent("lost_in_the_smoke");
    public static SoundEvent CRACKHEADS_LULLABY = registerSoundEvent("crackheads_lullaby");
    public static SoundEvent IN_THE_GRIP_OF_THE_PIPE = registerSoundEvent("in_the_grip_of_the_pipe");
    public static SoundEvent RAVAGED_BY_THE_ROCK = registerSoundEvent("ravaged_by_the_rock");
    public static SoundEvent IN_THE_ABYSS_OF_THE_PIPE = registerSoundEvent("in_the_abyss_of_the_pipe");
    public static SoundEvent IN_THE_DEPTHS_OF_ROCK_BOTTOM = registerSoundEvent("in_the_depths_of_rock_bottom");
    public static SoundEvent LOST_IN_THE_CRACKVERSE = registerSoundEvent("lost_in_the_crackverse");

    public static SoundEvent OVERWINNINGSGEWIJS_VERNEDERD = registerSoundEvent("overwinningsgewijs_vernederd");

    private static SoundEvent registerSoundEvent(String name) {
        ResourceLocation resource = new ResourceLocation(SussyMogus.MOD_ID, "music_disc." + name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, resource, SoundEvent.createVariableRangeEvent(resource));
    }
}
