package com.jetbrains.pokemon;

import com.jetbrains.pokemon.factories.PokemonFactory;
import com.jetbrains.pokemon.stats.Pokemon;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    Scanner read;

    public DataReader(String filePath) throws IOException{
        FileReader file = new FileReader(filePath);
        read = new Scanner(file);
    }

    public Trainer[] ReadTrainer(Trainer[] trainers){

        for(int k = 0; k < 2; k++){
            Trainer trainer = new Trainer();
            String name = read.nextLine();
            int age = read.nextInt();
            ArrayList<Pokemon> pokemoni = new ArrayList<>();
            read.nextLine();

            for(int i = 0; i < 3; i++){
                String line = read.nextLine();
                String[] elements = line.split(";");
                trainer.addPokemon(PokemonFactory.CreatePokemon(elements[0], elements[1], elements[2], elements[3]));
            }
            trainer.setName(name);
            trainer.setAge(age);
            trainers[k] = trainer;
        }

        return trainers;
    }
}
