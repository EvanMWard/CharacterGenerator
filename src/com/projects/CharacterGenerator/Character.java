package com.projects.CharacterGenerator;

import com.projects.CharacterGenerator.classes.DNDClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private DNDRace characterRace;
    private DNDClass characterClass;
    HashMap<String, String> features;
    ArrayList<String> spellList;
    ArrayList<String> inventory;
    HashMap<String, Integer> stats;
    HashMap<String, Integer> modifiers;
    HashMap<String, Integer> skills;
    int hitPoints;
    int proficiencyBonus;
    int armorClass;
    int initiative;
    HashMap<String, Integer> savingThrows;
    ArrayList<String> proficiencies;
    HashMap<String, Integer> spellSlots;
    ArrayList<String> resistances;

    public Character(DNDRace characterRace, DNDClass characterClass){
        this.characterRace = characterRace;
        this.characterClass = characterClass;
        proficiencyBonus = (characterClass.getLevel()+7)/4;
    }

    protected DNDClass getCharacterClass(){
        return characterClass;
    }

    protected DNDRace getCharacterRace(){
        return characterRace;
    }
}
