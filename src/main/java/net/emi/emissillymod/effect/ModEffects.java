package net.emi.emissillymod.effect;

import net.emi.emissillymod.EmisSillyMod;
import net.emi.emissillymod.effect.custom.DeathClockEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, EmisSillyMod.MOD_ID);

    public static final Holder<MobEffect> DEATH_CLOCK_EFFECT = MOB_EFFECTS.register("death_clock",
            () -> new DeathClockEffect(MobEffectCategory.HARMFUL, 7561558));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
