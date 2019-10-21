package github.emward.CharacterGenerator;

import github.emward.CharacterGenerator.classes.DNDClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private DNDRace characterRace;
    private DNDClass characterClass;
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
