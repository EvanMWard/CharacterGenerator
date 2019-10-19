package com.projects.CharacterGenerator.classes;

public class Bard implements DNDClass{
    String[] statOrder = {"Charisma", "Dexterity", "Wisdom", "Constitution", "Intelligence", "Strength"};

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
}
