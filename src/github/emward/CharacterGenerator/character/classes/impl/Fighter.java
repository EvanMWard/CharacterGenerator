<<<<<<< HEAD:src/github/emward/CharacterGenerator/classes/Fighter.java
package github.emward.CharacterGenerator.classes;
=======
package com.projects.CharacterGenerator.character.classes.impl;

import com.projects.CharacterGenerator.character.classes.ICharacterClass;
>>>>>>> 71eb2fd87f863eb7a9573625e2b7e44ddfd62151:src/github/emward/CharacterGenerator/character/classes/impl/Fighter.java

import java.util.ArrayList;

public class Fighter implements ICharacterClass {
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
