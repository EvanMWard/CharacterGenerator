package com.projects.CharacterGenerator;



import java.util.ArrayList;
import java.util.HashMap;

class Generator {
    private DNDClass characterClass;
    private DNDRace characterRace;
    private Character character = new Character();

    Generator(DNDRace characterRace, DNDClass characterClass){
        this.characterRace = characterRace;
        this.characterClass = characterClass;
    }

    Character generateCharacter(){
        character.characterRace = this.characterRace;
        character.characterClass = this.characterClass;
        character.stats = rollStats();
        character.inventory = generateInventory();
        character.spellList = generateSpellList();
        character.skills = generateSkills();
        character.features = generateFeatures();
        character.hitPoints = computeHitPoints();
        character.hitDiceType = computeHitDiceType();
        character.armorClass = computeArmorClass();
        character.speed = computeSpeed();
        character.initiative = computeInitiative();
        character.savingThrows = computeSavingThrows();
        character.proficiencies = computeProficiencies();
        character.spellSlots = computeSpellSlots();
        return character;
    }

    private HashMap<String, Integer> rollStats(){
        HashMap<String, Integer> stats = new HashMap<>();
        int[] statHolder = new int[6];
        return null;
    }

    private ArrayList<String> generateInventory(){
        return null;
    }

    private ArrayList<String> generateSpellList(){
        return null;
    }

    private HashMap<String, Integer> generateSkills(){
        return null;
    }

    private HashMap<String, String> generateFeatures(){
        return null;
    }

    private int computeHitPoints(){
        return 0;
    }

    private int computeHitDiceType(){
        return 0;
    }

    private int computeArmorClass(){
        return 0;
    }

    private int computeSpeed(){
        return 0;
    }

    private int computeInitiative(){
        return 0;
    }

    private HashMap<String, Integer> computeSavingThrows(){
        return null;
    }

    private ArrayList<String> computeProficiencies(){
        return null;
    }

    private HashMap<String, Integer> computeSpellSlots(){
        return null;
    }

}
