package com.projects.CharacterGenerator.classes;

public class Paladin implements DNDClass {

    String[] statOrder = {"Strength", "Charisma", "Constitution", "Wisdom", "Dexterity", "Intelligence"};
    int level = 1;

    public Paladin(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Paladin";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
