package com.jetbrains.pokemon.stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokemon {
    private String name;
    private int HP = 0;
    private int HP_Count = 0;
    private int Attack = 0;
    private int SpecialAttack = 0;
    private int Defense = 0;
    private int SpecialDefense = 0;
    private Ability Ability1 = null;
    private Ability Ability2 = null;
    private Item[] Items = {null, null, null};
    private boolean Stunned = false;
    private boolean Alive = true;
    private boolean itemApply = false;

    //alive

    public void LevelUp() {
        HP++;
        Attack++;
        Defense++;
        SpecialDefense++;

        if (SpecialAttack != 0) {
            SpecialAttack++;
        }
    }

    public void applyItems()
    {
        if (itemApply){
            return;
        }
        for(Item items : getItems())
            if( items != null )
            {
                HP += items.getHP();
                Attack += items.getAttack();
                SpecialAttack += items.getSpecialAttack();
                Defense += items.getDefense();
                SpecialDefense += items.getSpecialDefense();
            }
        itemApply = true;
    }

    //0-atac normal
    //1-atac special
    //2-abilitate 1
    //3-abilitate 2
    public int alegeAtac()
    {
        Random rnd = new Random();
        List<Integer> atacPosibil = new ArrayList<>();

        if( getAttack() > 0 )
            atacPosibil.add(0);
        if( getSpecialAttack() > 0 )
            atacPosibil.add(1);
        if( getAbility1().getCd_count() == 0 )
            atacPosibil.add(2);
        if( getAbility2().getCd_count() == 0 )
            atacPosibil.add(3);

        return atacPosibil.get( rnd.nextInt(atacPosibil.size()) );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHP_Count() {
        return HP_Count;
    }

    public void setHP_Count(int HP_Count) {
        this.HP_Count = HP_Count;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getSpecialAttack() {
        return SpecialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        SpecialAttack = specialAttack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getSpecialDefense() {
        return SpecialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        SpecialDefense = specialDefense;
    }

    public Ability getAbility1() {
        return Ability1;
    }

    public void setAbility1(Ability ability1) {
        Ability1 = ability1;
    }

    public Ability getAbility2() {
        return Ability2;
    }

    public void setAbility2(Ability ability2) {
        Ability2 = ability2;
    }

    public Item[] getItems() {
        return Items;
    }

    public void setItems(Item[] items) {
        Items = items;
    }

    public boolean isStunned() {
        return Stunned;
    }

    public void setStunned(boolean stunned) {
        Stunned = stunned;
    }
}

