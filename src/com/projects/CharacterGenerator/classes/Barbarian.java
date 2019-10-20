package com.projects.CharacterGenerator.classes;

import java.util.ArrayList;

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
    public ArrayList<String> getFeatures() {
        ArrayList<String> features = new ArrayList<>();
        features.add("Rage");
        features.add("Unarmored Defense");
        return features;
    }

    @Override
    public String getUnarmoredDefense() {
        return "Constitution";
    }

    @Override
    public ArrayList<String> getBalancedInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Greataxe");
        inventory.add("Handaxe (x2)");
        inventory.add("Javelin (x4)");
        inventory.add("Explorer's Pack");
        return inventory;
    }

    @Override
    public ArrayList<String> getCombatInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Greatsword");
        inventory.add("Handaxe (x2)");
        inventory.add("Javelin (x4)");
        inventory.add("Explorer's Pack");
        return inventory;
    }

    @Override
    public ArrayList<String> getRPInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Battleaxe");
        inventory.add("Greatclub");
        inventory.add("Javelin (x4)");
        inventory.add("Explorer's Pack");
        return inventory;
    }
}
