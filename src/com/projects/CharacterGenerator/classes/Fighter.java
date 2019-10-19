package com.projects.CharacterGenerator.classes;

public class Fighter implements DNDClass {
    String[] statOrder = {"Strength", "Constitution", "Dexterity", "Charisma", "Wisdom", "Intelligence"};
    int level = 1;

    public Fighter(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Fighter";
    }

    @Override
    public int getLevel() {
        return level;
    }
}
