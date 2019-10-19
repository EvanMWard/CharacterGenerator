package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

public class Cleric implements DNDClass{
    String[] statOrder = {"Wisdom", "Constitution", "Strength", "Intelligence", "Charisma", "Dexterity"};
    int level = 1;

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

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getBaseHitPoints() {
        return 0;
    }

    @Override
    public boolean hasShield() {
        return false;
    }

    @Override
    public String getArmorType() {
        return null;
    }

    @Override
    public HashMap<String, String> getFeatures() {
        return new HashMap<>();
    }

    @Override
    public String getUnarmoredDefense() {
        return null;
    }
}
