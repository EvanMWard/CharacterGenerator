package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

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
