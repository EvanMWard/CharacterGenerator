package com.projects.CharacterGenerator.classes;

public class Druid implements DNDClass {

    String[] statOrder = {"Wisdom", "Constitution", "Intelligence", "Charisma", "Dexterity", "Strength"};

    public Druid(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Druid";
    }
}
