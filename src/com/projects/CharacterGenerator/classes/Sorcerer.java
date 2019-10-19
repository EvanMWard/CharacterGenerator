package com.projects.CharacterGenerator.classes;

public class Sorcerer implements DNDClass {

    String[] statOrder = {"Charisma", "Constitution", "Intelligence", "Wisdom", "Dexterity", "Strength"};

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
}
