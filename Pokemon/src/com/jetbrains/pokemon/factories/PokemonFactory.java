package com.jetbrains.pokemon.factories;

import com.jetbrains.pokemon.builders.AbilityBuilder;
import com.jetbrains.pokemon.builders.PokemonBuilder;
import com.jetbrains.pokemon.stats.Ability;
import com.jetbrains.pokemon.stats.Item;
import com.jetbrains.pokemon.stats.Pokemon;

public class PokemonFactory {
    public static PokemonFactory pokemonFactory = new PokemonFactory();

    private PokemonFactory(){}

    public static PokemonFactory GetInstance(){
        return pokemonFactory;
    }

    public static Pokemon CreatePokemon(String name, String item1, String item2, String item3){

        PokemonBuilder pokemonBuilder = new PokemonBuilder(name);
        AbilityBuilder abilityBuilder1 = new AbilityBuilder();
        AbilityBuilder abilityBuilder2 = new AbilityBuilder();


        Item[] items = {ItemFactory.CreateItem(item1),
                        ItemFactory.CreateItem(item2),
                        ItemFactory.CreateItem(item3)};

        switch (name){
            case "Neutrel1":
                pokemonBuilder.buildPokemonHP(10);
                pokemonBuilder.buildPokemonAttack(3);
                pokemonBuilder.buildPokemonDefense(1);
                pokemonBuilder.buildPokemonSpecialDefense(1);
            case "Neutrel2":
                pokemonBuilder.buildPokemonHP(20);
                pokemonBuilder.buildPokemonAttack(4);
                pokemonBuilder.buildPokemonDefense(1);
                pokemonBuilder.buildPokemonSpecialDefense(1);
            case "Pikachu":
                abilityBuilder1.buildAbilityDmg(6);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(4);
                abilityBuilder2.buildAbilityStun(true);
                abilityBuilder2.buildAbilityDodge(true);
                abilityBuilder2.buildAbilityCd(5);

                pokemonBuilder.buildPokemonHP(35);
                pokemonBuilder.buildPokemonSpecialAttack(4);
                pokemonBuilder.buildPokemonDefense(2);
                pokemonBuilder.buildPokemonSpecialDefense(3);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Bulbasaur":
                abilityBuilder1.buildAbilityDmg(6);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(5);
                abilityBuilder2.buildAbilityStun(false);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(3);

                pokemonBuilder.buildPokemonHP(42);
                pokemonBuilder.buildPokemonSpecialAttack(5);
                pokemonBuilder.buildPokemonDefense(3);
                pokemonBuilder.buildPokemonSpecialDefense(1);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Charmander":
                abilityBuilder1.buildAbilityDmg(4);
                abilityBuilder1.buildAbilityStun(true);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(7);
                abilityBuilder2.buildAbilityStun(false);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(6);

                pokemonBuilder.buildPokemonHP(40);
                pokemonBuilder.buildPokemonAttack(4);
                pokemonBuilder.buildPokemonDefense(3);
                pokemonBuilder.buildPokemonSpecialDefense(2);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Squirtle":
                abilityBuilder1.buildAbilityDmg(4);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(3);

                abilityBuilder2.buildAbilityDmg(2);
                abilityBuilder2.buildAbilityStun(true);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(2);

                pokemonBuilder.buildPokemonHP(60);
                pokemonBuilder.buildPokemonSpecialAttack(3);
                pokemonBuilder.buildPokemonDefense(5);
                pokemonBuilder.buildPokemonSpecialDefense(5);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Snorlax":
                abilityBuilder1.buildAbilityDmg(4);
                abilityBuilder1.buildAbilityStun(true);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(5);

                abilityBuilder2.buildAbilityDmg(0);
                abilityBuilder2.buildAbilityStun(false);
                abilityBuilder2.buildAbilityDodge(true);
                abilityBuilder2.buildAbilityCd(5);

                pokemonBuilder.buildPokemonHP(62);
                pokemonBuilder.buildPokemonAttack(3);
                pokemonBuilder.buildPokemonDefense(6);
                pokemonBuilder.buildPokemonSpecialDefense(4);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Vulpix":
                abilityBuilder1.buildAbilityDmg(8);
                abilityBuilder1.buildAbilityStun(true);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(6);

                abilityBuilder2.buildAbilityDmg(2);
                abilityBuilder2.buildAbilityStun(false);
                abilityBuilder2.buildAbilityDodge(true);
                abilityBuilder2.buildAbilityCd(7);

                pokemonBuilder.buildPokemonHP(36);
                pokemonBuilder.buildPokemonAttack(5);
                pokemonBuilder.buildPokemonDefense(2);
                pokemonBuilder.buildPokemonSpecialDefense(4);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Eevee":
                abilityBuilder1.buildAbilityDmg(5);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(3);

                abilityBuilder2.buildAbilityDmg(3);
                abilityBuilder2.buildAbilityStun(true);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(3);

                pokemonBuilder.buildPokemonHP(39);
                pokemonBuilder.buildPokemonSpecialAttack(4);
                pokemonBuilder.buildPokemonDefense(3);
                pokemonBuilder.buildPokemonSpecialDefense(3);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Jigglypuff":
                abilityBuilder1.buildAbilityDmg(4);
                abilityBuilder1.buildAbilityStun(true);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(3);
                abilityBuilder2.buildAbilityStun(true);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(4);

                pokemonBuilder.buildPokemonHP(34);
                pokemonBuilder.buildPokemonAttack(3);
                pokemonBuilder.buildPokemonDefense(2);
                pokemonBuilder.buildPokemonSpecialDefense(3);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Meowth":
                abilityBuilder1.buildAbilityDmg(5);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(true);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(1);
                abilityBuilder2.buildAbilityStun(false);
                abilityBuilder2.buildAbilityDodge(true);
                abilityBuilder2.buildAbilityCd(3);

                pokemonBuilder.buildPokemonHP(41);
                pokemonBuilder.buildPokemonAttack(3);
                pokemonBuilder.buildPokemonDefense(4);
                pokemonBuilder.buildPokemonSpecialDefense(2);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
            case "Psyduck":
                abilityBuilder1.buildAbilityDmg(2);
                abilityBuilder1.buildAbilityStun(false);
                abilityBuilder1.buildAbilityDodge(false);
                abilityBuilder1.buildAbilityCd(4);

                abilityBuilder2.buildAbilityDmg(2);
                abilityBuilder2.buildAbilityStun(true);
                abilityBuilder2.buildAbilityDodge(false);
                abilityBuilder2.buildAbilityCd(5);

                pokemonBuilder.buildPokemonHP(43);
                pokemonBuilder.buildPokemonAttack(3);
                pokemonBuilder.buildPokemonDefense(3);
                pokemonBuilder.buildPokemonSpecialDefense(3);
                pokemonBuilder.buildPokemonAbility(abilityBuilder1.getAbility(), abilityBuilder2.getAbility());
                pokemonBuilder.buildPokemonItems(items);
        }
        return pokemonBuilder.getPokemon();
    }
}
