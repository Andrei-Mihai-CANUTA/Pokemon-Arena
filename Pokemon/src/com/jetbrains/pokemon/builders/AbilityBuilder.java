package com.jetbrains.pokemon.builders;

import com.jetbrains.pokemon.stats.Ability;

public class AbilityBuilder {
    private Ability ability;

    public AbilityBuilder(){
        ability = new Ability();
    }

    public void buildAbilityDmg(int Dmg){
        ability.setDmg(Dmg);
    }

    public void buildAbilityStun(boolean Stun){
        ability.setStun(Stun);
    }

    public void buildAbilityDodge(boolean Dodge){
        ability.setDodge(Dodge);
    }

    public void buildAbilityCd(int Cd){
        ability.setCd(Cd);
        ability.setCd_count(Cd);
    }

    public Ability getAbility(){
        return ability;
    }
}
