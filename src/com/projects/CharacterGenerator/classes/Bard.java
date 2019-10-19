package com.projects.CharacterGenerator.classes;

public class Bard implements DNDClass{
    String[] statOrder = {"Charisma", "Dexterity", "Wisdom", "Constitution", "Intelligence", "Strength"};
    int level = 1;

    public Bard(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Bard";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
