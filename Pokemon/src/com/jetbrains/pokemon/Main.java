package com.jetbrains.pokemon;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        DataReader x = new DataReader("Data\\Fight2.txt");
        Trainer[] trainers = new Trainer[2];
        trainers = x.ReadTrainer(trainers);

        Battle b1 = new Battle(new Trainer[]{trainers[0], trainers[0].CreeazaNeutrel1()});
        Battle b2 = new Battle(new Trainer[]{trainers[0], trainers[0].CreeazaNeutrel2()});
        Battle b3 = new Battle(new Trainer[]{trainers[1], trainers[1].CreeazaNeutrel1()});
        Battle b4 = new Battle(new Trainer[]{trainers[1], trainers[1].CreeazaNeutrel2()});
        Battle b5 = new Battle(new Trainer[]{trainers[1], trainers[0]});

        List<Battle> b = new ArrayList<>();
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        while ( b.size() != 0 )
        {
            Random rnd = new Random();
            Battle batalie = b.remove(rnd.nextInt(b.size()));
            batalie.run();
        }
        b5.run();
    }
}
