package com.projects.CharacterGenerator.classes;

public class Ranger implements DNDClass {

    String[] statOrder = {"Dexterity", "Wisdom", "Constitution", "Strength", "Intelligence", "Charisma"};
    int level = 1;

    public Ranger(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Ranger";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
