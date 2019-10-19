package com.projects.CharacterGenerator.classes;

public class Cleric implements DNDClass{
    String[] statOrder = {"Wisdom", "Constitution", "Strength", "Intelligence", "Charisma", "Dexterity"};

    public Cleric(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Cleric";
    }
}
