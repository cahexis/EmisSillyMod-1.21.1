package net.emi.emissillymod.effect.custom;

import net.emi.emissillymod.effect.ModEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.SubscribeEvent;

import net.neoforged.neoforge.event.entity.living.MobEffectEvent;

public class DeathClockEffect extends MobEffect  {
    public DeathClockEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        //scary hearts maybe
        return true;
    }


}
