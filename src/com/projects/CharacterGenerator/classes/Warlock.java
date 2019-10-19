package com.projects.CharacterGenerator.classes;

public class Warlock implements DNDClass {

    String[] statOrder = {"Charisma", "Constitution", "Intelligence", "Wisdom", "Dexterity", "Strength"};
    int level = 1;


    public Warlock(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Warlock";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
