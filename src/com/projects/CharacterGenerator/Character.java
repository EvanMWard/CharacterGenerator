package com.projects.CharacterGenerator;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    int level = 1;
    DNDRace characterRace;
    DNDClass characterClass;
    HashMap<String, String> features;
    ArrayList<String> spellList;
    ArrayList<String> inventory;
    HashMap<String, Integer> stats;
    HashMap<String, Integer> skills;
    int hitPoints;
    int hitDice = 1;
    int hitDiceType;
    int proficiencyBonus = 1;
    int armorClass;
    int speed;
    int initiative;
    HashMap<String, Integer> savingThrows;
    ArrayList<String> proficiencies;
    HashMap<String, Integer> spellSlots;

    public Character(){
    }
}
