package com.projects.CharacterGenerator.character;

import com.projects.CharacterGenerator.character.classes.ICharacterClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private DNDRace characterRace;
    private ICharacterClass characterClass;
    ArrayList<String> features;
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

    public Character(DNDRace characterRace, ICharacterClass characterClass){
        this.characterRace = characterRace;
        this.characterClass = characterClass;
        proficiencyBonus = (characterClass.getLevel()+7)/4;
    }

    protected ICharacterClass getCharacterClass(){
        return characterClass;
    }

    protected DNDRace getCharacterRace(){
        return characterRace;
    }

    protected HashMap<String, Integer> getModifiers(){
        return modifiers;
    }

    protected HashMap<String, Integer> getStats(){
        return stats;
    }

    public ArrayList<String> getProficiencies() {
        return proficiencies;
    }

    protected int getProficiencyBonus(){
        return proficiencyBonus;
    }

    public String toString(){
        return
                "Your Character:\n" +
                "Race: " + characterRace + "\n" +
                "Class: " + characterClass + "\n" +
                "Stats: " + stats + "\n" +
                "Modifiers: " + modifiers + "\n" +
                "Features: " + features + "\n" +
                "Spell List: " + spellList + "\n" +
                "Inventory: " + inventory + "\n" +
                "Skills: " + skills + "\n" +
                "Proficiencies: " + proficiencies + "\n" +
                "Hit Points: " + hitPoints + "\n" +
                "Proficiency Bonus: " + proficiencyBonus + "\n" +
                "Armor Class: " + armorClass + "\n" +
                "Initiative: " + initiative + "\n" +
                "Saving Throws: " + savingThrows + "\n";
    }
}
