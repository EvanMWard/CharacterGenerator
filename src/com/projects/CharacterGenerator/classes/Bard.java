package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

public class Bard implements DNDClass{
    String[] statOrder = {"Charisma", "Dexterity", "Wisdom", "Constitution", "Intelligence", "Strength"};
    int level = 1;

    public Bard(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Bard";
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
