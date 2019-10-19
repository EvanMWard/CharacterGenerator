package com.projects.CharacterGenerator.classes;

public class Rogue implements DNDClass {

    String[] statOrder = {"Dexterity", "Charisma", "Constitution", "Strength", "Wisdom", "Intelligence"};
    int level = 1;

    public Rogue(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Rogue";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
