<<<<<<< HEAD:src/github/emward/CharacterGenerator/classes/Cleric.java
package github.emward.CharacterGenerator.classes;
=======
package com.projects.CharacterGenerator.character.classes.impl;

import com.projects.CharacterGenerator.character.classes.ICharacterClass;
>>>>>>> 71eb2fd87f863eb7a9573625e2b7e44ddfd62151:src/github/emward/CharacterGenerator/character/classes/impl/Cleric.java

import java.util.ArrayList;
import java.util.Scanner;

public class Cleric implements ICharacterClass {
    String[] statOrder = {"Wisdom", "Constitution", "Strength", "Intelligence", "Charisma", "Dexterity"};
    int level = 1;
    String armorType = "";

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
        return 8;
    }

    @Override
    public boolean hasShield() {
        return true;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public ArrayList<String> getFeatures() {
        ArrayList<String> features = new ArrayList<>();
        boolean validInput = false;
        Scanner scan = new Scanner(System.in);
;       while(!validInput) {
            System.out.println("Please select a Divine Domain for your cleric. (1-7)");
            System.out.println("1. Knowledge Domain");
            System.out.println("2. Life Domain");
            System.out.println("3. Light Domain");
            System.out.println("4. Nature Domain");
            System.out.println("5. Tempest Domain");
            System.out.println("6. Trickery Domain");
            System.out.println("7. War Domain");
            int domainInt = scan.nextInt();
            if(0 < domainInt && 8 > domainInt){
                validInput = true;
                switch(domainInt){
                    case 1:
                        features.add("Divine Domain (Knowledge)");
                        break;
                    case 2:
                        features.add("Divine Domain (Life)");
                        break;
                    case 3:
                        features.add("Divine Domain (Light)");
                        break;
                    case 4:
                        features.add("Divine Domain (Nature)");
                        break;
                    case 5:
                        features.add("Divine Domain (Tempest)");
                        break;
                    case 6:
                        features.add("Divine Domain (Trickery)");
                        break;
                    case 7:
                        features.add("Divine Domain (War)");
                        break;
                    default:
                        break;
                }
            }
            features.add("Spellcasting");
        }
        return features;
    }

    @Override
    public String getUnarmoredDefense() {
        return null;
    }

    @Override
    public ArrayList<String> getBalancedInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Mace");
        inventory.add("Scale Mail");
        armorType = "ScaleMail";
        inventory.add("Light Crossbow");
        inventory.add("Bolt (x20)");
        inventory.add("Priest's Pack");
        inventory.add("Shield");
        inventory.add("Holy Symbol");
        return inventory;
    }

    @Override
    public ArrayList<String> getCombatInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Mace");
        inventory.add("Chain Mail");
        armorType = "ChainMail";
        inventory.add("Light Crossbow");
        inventory.add("Bolt (x20)");
        inventory.add("Explorer's Pack");
        inventory.add("Shield");
        inventory.add("Holy Symbol");
        return inventory;
    }

    @Override
    public ArrayList<String> getRPInventory() {
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Mace");
        inventory.add("Leather Armor");
        armorType = "Leather";
        inventory.add("Spear");
        inventory.add("Priest's Pack");
        inventory.add("Shield");
        inventory.add("Holy Symbol");
        return inventory;
    }
}
