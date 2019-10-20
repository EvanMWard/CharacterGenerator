package com.projects.CharacterGenerator.classes;

import java.util.ArrayList;

public class Rogue implements DNDClass {

    String[] statOrder = {"Dexterity", "Charisma", "Constitution", "Strength", "Wisdom", "Intelligence"};
    int level = 1;

    public Rogue(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Rogue";
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
    public ArrayList<String> getFeatures() {
        return null;
    }

    @Override
    public String getUnarmoredDefense() {
        return null;
    }

    @Override
    public ArrayList<String> getBalancedInventory() {
        return null;
    }

    @Override
    public ArrayList<String> getCombatInventory() {
        return null;
    }

    @Override
    public ArrayList<String> getRPInventory() {
        return null;
    }
}
