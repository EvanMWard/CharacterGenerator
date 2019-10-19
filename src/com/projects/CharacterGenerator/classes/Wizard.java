package com.projects.CharacterGenerator.classes;

public class Wizard implements DNDClass {

    String[] statOrder = {"Intelligence", "Constitution", "Dexterity", "Wisdom", "Charisma", "Strength"};
    int level = 1;

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

    @Override
    public int getLevel() {
        return level;
    }
}
