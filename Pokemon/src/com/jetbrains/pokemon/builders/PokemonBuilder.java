package com.jetbrains.pokemon.builders;

import com.jetbrains.pokemon.stats.Ability;
import com.jetbrains.pokemon.stats.Item;
import com.jetbrains.pokemon.stats.Pokemon;

public class PokemonBuilder {
    private Pokemon pokemon;

    public PokemonBuilder(String name){
        pokemon = new Pokemon();
        pokemon.setName(name);
    }

    public void buildPokemonHP(int HP){
        pokemon.setHP(HP);
        pokemon.setHP_Count(HP);
    }

    public void buildPokemonAttack(int Attack){
        pokemon.setAttack(Attack);
    }

    public void buildPokemonDefense(int Defense){
        pokemon.setDefense(Defense);
    }

    public void buildPokemonSpecialAttack(int SpecialAttack){
        pokemon.setSpecialAttack(SpecialAttack);
    }

    public void buildPokemonSpecialDefense(int SpecialDefense){
        pokemon.setSpecialDefense(SpecialDefense);
    }

    public void buildPokemonAbility(Ability Ability1, Ability Ability2){
        pokemon.setAbility1(Ability1);
        pokemon.setAbility2(Ability2);
    }

    public void buildPokemonItems(Item[] Items){
        pokemon.setItems(Items);
    }

    public Pokemon getPokemon(){
        return pokemon;
    }
}
