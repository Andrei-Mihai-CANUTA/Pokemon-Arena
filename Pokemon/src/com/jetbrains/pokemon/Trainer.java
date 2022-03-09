package com.jetbrains.pokemon;

import com.jetbrains.pokemon.factories.PokemonFactory;
import com.jetbrains.pokemon.stats.Pokemon;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int age;
    private ArrayList<Pokemon> pokemoni = new ArrayList<>();

    public boolean poateLupta()
    {
        for(Pokemon pokemon : pokemoni)
            if( pokemon.getHP_Count() > 0 )
                return true;
        return false;
    }

    public Pokemon alegePokemon()
    {
        for(Pokemon pokemon : pokemoni)
            if( pokemon.getHP_Count() > 0 )
                return pokemon;
        return null;
    }

    public Trainer CreeazaNeutrel1()
    {
        Trainer t = new Trainer();
        t.setName("Neutrel1");
        t.setAge(0);
        t.pokemoni.add(PokemonFactory.CreatePokemon("Neutrel1", null, null, null));
        return t;
    }

    public Trainer CreeazaNeutrel2()
    {
        Trainer t = new Trainer();
        t.setName("Neutrel2");
        t.setAge(0);
        t.pokemoni.add(PokemonFactory.CreatePokemon("Neutrel2", null, null, null));
        return t;
    }

    public void addPokemon(Pokemon pokemon){
        pokemoni.add(pokemon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Pokemon> getPokemoni() {
        return pokemoni;
    }

    public void setPokemoni(ArrayList<Pokemon> pokemoni) {
        this.pokemoni = pokemoni;
    }
}
