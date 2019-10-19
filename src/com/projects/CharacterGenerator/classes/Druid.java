package com.projects.CharacterGenerator.classes;

public class Druid implements DNDClass {

    String[] statOrder = {"Wisdom", "Constitution", "Intelligence", "Charisma", "Dexterity", "Strength"};
    int level = 1;

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

    @Override
    public int getLevel() {
        return level;
    }
}
