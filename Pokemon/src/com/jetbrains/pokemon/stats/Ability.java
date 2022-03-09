package com.jetbrains.pokemon.stats;

public class Ability {
    private int Dmg = 0;
    private boolean Stun = false;
    private boolean Dodge = false;
    private int Cd = 0;
    private int Cd_count = 0;

    public void decreaseCount(){
        Cd_count--;
        if(Cd_count < 0){
            Cd_count = 0;
        }
    }

    public void useAbility(){
            Cd_count = Cd;
    }

    public int getDmg() {
        return Dmg;
    }

    public void setDmg(int dmg) {
        Dmg = dmg;
    }

    public boolean isStun() {
        return Stun;
    }

    public void setStun(boolean stun) {
        Stun = stun;
    }

    public boolean isDodge() {
        return Dodge;
    }

    public void setDodge(boolean dodge) {
        Dodge = dodge;
    }

    public int getCd() {
        return Cd;
    }

    public void setCd(int cd) {
        Cd = cd;
    }

    public int getCd_count() {
        return Cd_count;
    }

    public void setCd_count(int cd_count) {
        Cd_count = cd_count;
    }
}
