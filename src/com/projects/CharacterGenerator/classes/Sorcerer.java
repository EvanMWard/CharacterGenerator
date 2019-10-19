package com.projects.CharacterGenerator.classes;

public class Sorcerer implements DNDClass {

    String[] statOrder = {"Charisma", "Constitution", "Intelligence", "Wisdom", "Dexterity", "Strength"};
    int level = 1;

    public Sorcerer(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Sorcerer";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
