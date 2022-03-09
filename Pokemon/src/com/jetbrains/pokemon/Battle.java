package com.jetbrains.pokemon;

import com.jetbrains.pokemon.stats.Pokemon;

import java.util.Random;

public class Battle implements Runnable{

    public Trainer[] trainers;

    public Battle(Trainer[] trainers)
    {
        this.trainers = trainers;
    }

    public int CalculeazaDamage(Pokemon atacant, int atac, Pokemon aparator, int aparare)
    {
        if(atacant.isStunned())
        {
            atacant.setStunned(false);
            System.out.println(atacant.getName() + " a incercat sa-l atace pe " + aparator.getName() + " dar are stun.");
            return 0;
        }

        if(aparare == 2 && aparator.getAbility1().isDodge()) {
            System.out.println(atacant.getName() + " a incercat sa-l atace pe  " + aparator.getName() + "  dar a ratat.");
            return 0;
        }
        if(aparare == 3 && aparator.getAbility2().isDodge()) {
            System.out.println(atacant.getName() + " a incercat sa-l atace pe  " + aparator.getName() + "  dar a ratat.");
            return 0;
        }

        if(atac == 0) {
            System.out.println(atacant.getName() + " a folosit atac normal");
            return Math.max(atacant.getAttack() - aparator.getDefense(), 0);
        }
        if(atac == 1) {
            System.out.println(atacant.getName() + " a folosit atac special");
            return Math.max(atacant.getSpecialAttack() - aparator.getSpecialDefense(), 0);
        }
        if(atac == 2)
        {
            System.out.println(atacant.getName() + " a folosit abilitatea1");
            if(atacant.getAbility1().isStun())
                aparator.setStunned(true);

            atacant.getAbility1().useAbility();
            return atacant.getAbility1().getDmg();
        }

        if( atac == 3 )
        {
            System.out.println(atacant.getName() + " a folosit abilitatea2");
            if(atacant.getAbility2().isStun())
                aparator.setStunned(true);

            atacant.getAbility2().useAbility();
            return atacant.getAbility2().getDmg();
        }

        return  0;
    }

    @Override
    public void run() {
        Random rnd = new Random();

        System.out.println();
        System.out.println("===== Batalie intre " + trainers[0].getName()+ " si "+ trainers[1].getName() + " =====");

        while(trainers[0].poateLupta() && trainers[1].poateLupta())
        {

            Pokemon pokemon1 = trainers[0].alegePokemon();
            Pokemon pokemon2 = trainers[1].alegePokemon();
            pokemon1.applyItems();
            pokemon2.applyItems();

            System.out.println("----- Se lupta " + trainers[0].alegePokemon().getName()
                    + " si "+ trainers[1].alegePokemon().getName() + " -----");

            while (pokemon1.getHP_Count() > 0 && pokemon2.getHP_Count() > 0)
            {
                int miscare1 = pokemon1.alegeAtac();
                int miscare2 = pokemon2.alegeAtac();

                int dmg1 = CalculeazaDamage(pokemon1, miscare1, pokemon2, miscare2);
                int dmg2 = CalculeazaDamage(pokemon2, miscare2, pokemon1, miscare1);

                pokemon1.setHP_Count( pokemon1.getHP_Count() - dmg2 );
                System.out.println(pokemon1.getName() + " a luat " + dmg2 + "damage");
                pokemon2.setHP_Count( pokemon2.getHP_Count() - dmg1 );
                System.out.println(pokemon2.getName() + " a luat " + dmg1 + "damage\n");

                pokemon1.getAbility1().decreaseCount();
                pokemon1.getAbility2().decreaseCount();
                pokemon2.getAbility1().decreaseCount();
                pokemon2.getAbility2().decreaseCount();
            }

            if(pokemon1.getHP_Count() > 0)
            {
                pokemon1.LevelUp();
                pokemon1.setHP_Count(pokemon1.getHP());
                System.out.println("##### " + pokemon1.getName() + " a castigat si a dat LevelUp #####z");
                System.out.println("Statusuri noi pentru " + pokemon1.getName() + ":\n"
                        +"    HP " + pokemon1.getHP() + "\n"
                        +"    Attack " + pokemon1.getAttack() + "\n"
                        +"    SpecialAttack " + pokemon1.getSpecialAttack() + "\n"
                        +"    Defense " + pokemon1.getDefense() + "\n"
                        +"    SpecialDefense " + pokemon1.getSpecialDefense() + "\n");
            }
            else if(pokemon2.getHP_Count() > 0)
            {
                pokemon2.LevelUp();
                pokemon2.setHP_Count(pokemon2.getHP());
                System.out.println("##### " + pokemon2.getName() + " a castigat si a dat LevelUp #####");
                System.out.println("Statusuri noi pentru " + pokemon2.getName() + ":\n"
                        +"    HP " + pokemon2.getHP() + "\n"
                        +"    Attack " + pokemon2.getAttack() + "\n"
                        +"    SpecialAttack " + pokemon2.getSpecialAttack() + "\n"
                        +"    Defense " + pokemon2.getDefense() + "\n"
                        +"    SpecialDefense " + pokemon2.getSpecialDefense() + "\n");
            }
            else
                System.out.println("egalitate\n");

        }
        if(trainers[0].poateLupta()){
            System.out.println("===== " + trainers[0].getName() + " a castigat arena =====");
        }
        else if(trainers[1].poateLupta()){
            System.out.println("===== " + trainers[1].getName() + " a castigat arena =====");
        }
    }
}
