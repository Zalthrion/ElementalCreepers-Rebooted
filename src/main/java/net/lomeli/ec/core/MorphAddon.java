package net.lomeli.ec.core;

import net.lomeli.ec.entity.EntityDarkCreeper;
import net.lomeli.ec.entity.EntityFireCreeper;
import net.lomeli.ec.entity.EntityMagmaCreeper;
import net.lomeli.ec.entity.EntitySpiderCreeper;
import net.lomeli.ec.entity.EntityWaterCreeper;
import net.lomeli.ec.entity.EntityWindCreeper;

import net.lomeli.lomlib.util.ModLoaded;

import morph.api.Ability;

public class MorphAddon {
    public static void loadAddon() {
        if (ModLoaded.isModInstalled("Morph"))
            registerAbilities();
    }

    private static void registerAbilities() {
        Ability.mapAbilities(EntityFireCreeper.class, Ability.getNewAbilityFireImmunity(), Ability.getNewAbilityHostile());
        Ability.mapAbilities(EntityMagmaCreeper.class, Ability.getNewAbilityFireImmunity(), Ability.getNewAbilityHostile(), Ability.getNewAbilityWaterAllergy());
        Ability.mapAbilities(EntityWaterCreeper.class, Ability.getNewAbilitySwim(true), Ability.getNewAbilityHostile());
        Ability.mapAbilities(EntityDarkCreeper.class, Ability.getNewAbilitySunburn(), Ability.getNewAbilityHostile());
        Ability.mapAbilities(EntitySpiderCreeper.class, Ability.getNewAbilityClimb(), Ability.getNewAbilityHostile());
        Ability.mapAbilities(EntityWindCreeper.class, Ability.getNewAbilityFloat(-0.1141748F, true), Ability.getNewAbilityHostile());
    }
}
