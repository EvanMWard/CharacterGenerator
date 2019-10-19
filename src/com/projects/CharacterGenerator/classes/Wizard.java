package com.projects.CharacterGenerator.classes;

import java.util.HashMap;

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
