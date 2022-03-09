package com.jetbrains.pokemon.stats;

public class Item {
    private String Name;
    private int HP = 0;
    private int Attack = 0;
    private int SpecialAttack = 0;
    private int Defense = 0;
    private int SpecialDefense = 0;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
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
}
