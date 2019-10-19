package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

public class Sorcerer implements DNDClass {

    String[] statOrder = {"Charisma", "Constitution", "Intelligence", "Wisdom", "Dexterity", "Strength"};
    int level = 1;

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
        return null;
    }

    @Override
    public String getUnarmoredDefense() {
        return null;
    }
}
