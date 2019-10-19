package com.projects.CharacterGenerator.classes;

public class Monk implements DNDClass {

    String[] statOrder = {"Dexterity", "Wisdom", "Constitution", "Strength", "Intelligence", "Charisma"};

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
}
