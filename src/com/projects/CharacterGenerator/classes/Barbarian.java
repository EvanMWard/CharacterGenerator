package com.projects.CharacterGenerator.classes;

public class Barbarian implements DNDClass {
    String[] statOrder = {"Strength", "Constitution", "Dexterity", "Charisma", "Wisdom", "Intelligence"};
    int level = 1;

    public Barbarian(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Barbarian";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
