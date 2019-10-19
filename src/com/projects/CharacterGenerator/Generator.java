package com.projects.CharacterGenerator;

import com.projects.CharacterGenerator.classes.DNDClass;

import java.lang.reflect.Array;
import java.util.*;

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
        character.resistances = computeResistances();
        return character;
    }

    private HashMap<String, Integer> rollStats(){
        Random rand = new Random();
        HashMap<String, Integer> stats = new HashMap<>();
        stats.put("Strength", 0);
        stats.put("Dexterity", 0);
        stats.put("Constitution", 0);
        stats.put("Intelligence", 0);
        stats.put("Wisdom", 0);
        stats.put("Charisma", 0);
        ArrayList<Integer> statHolder = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        //Simulate 4d6 drop lowest
        for(int i = 0; i < 6; i++){
            temp.clear();
            //4d6
            for(int j = 0; j < 4; j++){
                temp.add(rand.nextInt(6)+1);
            }
            Collections.sort(temp);
            int sum = 0;
            //drop lowest
            for(int j = 1; j < 4; j++){
                sum += temp.remove(1);
            }
            statHolder.add(sum);
        }

        Collections.sort(statHolder);
        Collections.reverse(statHolder);

        //Assign stats based on class
        String[] statOrder = characterClass.getStatOrder();
        for(int i = 0; i < 6; i++){
            Iterator iter = stats.keySet().iterator();
            while(iter.hasNext()){
                if(iter.next().equals(statOrder[i])) stats.replace(statOrder[i], statHolder.remove(0));
            }
        }
        System.out.println(stats);
        return stats;
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

    private ArrayList<String> computeResistances(){
        return null;
    }

}
