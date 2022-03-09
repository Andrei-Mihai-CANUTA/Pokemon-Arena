package com.jetbrains.pokemon.factories;

import com.jetbrains.pokemon.builders.ItemBuilder;
import com.jetbrains.pokemon.stats.Item;

public class ItemFactory {
    public static ItemFactory itemFactory = new ItemFactory();

    private ItemFactory(){}

    public static ItemFactory GetInstance(){
        return itemFactory;
    }

    public static Item CreateItem(String name){
        ItemBuilder itemBuilder = new ItemBuilder(name);

        if(name == null)
            return null;

        switch (name){
            case "Scut":
                itemBuilder.buildItemDefense(2);
                itemBuilder.buildItemSpecialDefense(2);
            case "Vesta":
                itemBuilder.buildItemHP(10);
            case "Sabiuta":
                itemBuilder.buildItemAttack(3);
            case "Bagheta Magica":
                itemBuilder.buildItemSpecialAttack(3);
            case "Vitamine":
                itemBuilder.buildItemHP(2);
                itemBuilder.buildItemAttack(2);
                itemBuilder.buildItemSpecialAttack(2);
            case "Brad de Craciun":
                itemBuilder.buildItemAttack(3);
                itemBuilder.buildItemDefense(1);
            case "Pelerina":
                itemBuilder.buildItemSpecialDefense(3);
        }
        return itemBuilder.getItem();
    }

}
