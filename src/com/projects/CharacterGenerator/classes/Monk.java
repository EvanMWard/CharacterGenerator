package com.projects.CharacterGenerator.classes;

public class Monk implements DNDClass {

    String[] statOrder = {"Dexterity", "Wisdom", "Constitution", "Strength", "Intelligence", "Charisma"};
    int level = 1;

    public Monk(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Monk";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
