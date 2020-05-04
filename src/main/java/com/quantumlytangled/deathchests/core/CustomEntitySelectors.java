package com.quantumlytangled.deathchests.core;

import com.google.common.base.Predicate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;


public final class CustomEntitySelectors {
    public static final Predicate<Entity> IN_CREATIVE = entity -> !(entity instanceof EntityPlayer) || !((EntityPlayer)entity).isSpectator() && ((EntityPlayer)entity).isCreative();
}
