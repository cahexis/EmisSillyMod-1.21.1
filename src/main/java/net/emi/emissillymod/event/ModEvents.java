package net.emi.emissillymod.event;

import net.emi.emissillymod.EmisSillyMod;
import net.emi.emissillymod.effect.ModEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;

@EventBusSubscriber(modid = EmisSillyMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void EffectExpired(MobEffectEvent.Expired event) {

        if (event.getEntity() instanceof ServerPlayer player && event.getEffectInstance().is(ModEffects.DEATH_CLOCK_EFFECT)) {
            player.hurt(player.damageSources().drown(), 20);
        }
    }
}
