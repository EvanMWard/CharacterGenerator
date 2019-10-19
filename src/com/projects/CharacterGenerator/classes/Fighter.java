package com.projects.CharacterGenerator.classes;

public class Fighter implements DNDClass {
    String[] statOrder = {"Strength", "Constitution", "Dexterity", "Charisma", "Wisdom", "Intelligence"};

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
}
