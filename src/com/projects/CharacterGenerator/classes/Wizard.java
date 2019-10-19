package com.projects.CharacterGenerator.classes;

public class Wizard implements DNDClass {

    String[] statOrder = {"Intelligence", "Constitution", "Dexterity", "Wisdom", "Charisma", "Strength"};

    public Wizard(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Wizard";
    }
}
