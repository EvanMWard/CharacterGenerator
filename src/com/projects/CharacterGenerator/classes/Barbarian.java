package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

public class Barbarian implements DNDClass {
    private String[] statOrder = {"Strength", "Constitution", "Dexterity", "Charisma", "Wisdom", "Intelligence"};
    private int level = 1;

    Barbarian(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Barbarian";
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getBaseHitPoints() {
        return 12;
    }

    @Override
    public boolean hasShield() {
        return false;
    }

    @Override
    public String getArmorType() {
        return "None";
    }

    @Override
    public HashMap<String, String> getFeatures() {
        return new HashMap<>();
    }

    @Override
    public String getUnarmoredDefense() {
        return "Constitution";
    }
}
