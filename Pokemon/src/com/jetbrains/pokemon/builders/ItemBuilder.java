package com.jetbrains.pokemon.builders;

import com.jetbrains.pokemon.stats.Item;

public class ItemBuilder {
    private Item item;

    public ItemBuilder(String name){
        item = new Item();
        item.setName(name);
    }

    public void buildItemHP(int HP){
        item.setHP(HP);
    }

    public void buildItemAttack(int Attack){
        item.setAttack(Attack);
    }

    public void buildItemDefense(int Defense){
        item.setDefense(Defense);
    }

    public void buildItemSpecialAttack(int SpecialAttack){
        item.setSpecialAttack(SpecialAttack);
    }

    public void buildItemSpecialDefense(int SpecialDefense){
        item.setSpecialDefense(SpecialDefense);
    }

    public Item getItem(){
        return item;
    }
}
