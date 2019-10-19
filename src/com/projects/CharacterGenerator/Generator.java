package com.projects.CharacterGenerator;

import com.projects.CharacterGenerator.classes.DNDClass;

import java.util.*;

class Generator {
    private Character character;
    String balance = "Balance";

    Generator(DNDRace characterRace, DNDClass characterClass){
        character = new Character(characterRace, characterClass);
    }

    Character generateCharacter(){
        character.stats = rollStats();
        character.modifiers = computeModifiers(character.stats);
        getBalance();
        character.inventory = generateInventory(balance);
        character.spellList = generateSpellList(balance);
        character.proficiencies = computeProficiencies();
        character.skills = generateSkills();
        character.features = generateFeatures();
        character.hitPoints = computeHitPoints();
        character.armorClass = computeArmorClass();
        character.initiative = computeInitiative(character.modifiers);
        character.savingThrows = computeSavingThrows();
        return character;
    }

    private void getBalance() {
        Scanner scan = new Scanner(System.in);
        int balanceInt;
        boolean validInput = false;
        while(!validInput){
            System.out.println("Please select a primary role for your character. (1-3)");
            System.out.println("1. RP");
            System.out.println("2. Combat");
            System.out.println("3. Balanced");
            balanceInt = scan.nextInt();
            switch(balanceInt){
                case 1:
                    balance = "RP";
                    validInput = true;
                    break;
                case 2:
                    balance = "Combat";
                    validInput = true;
                    break;
                case 3:
                    balance = "Balance";
                    validInput = true;
                    break;
                default:
                    break;
            }
        }
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
        String[] statOrder = character.getCharacterClass().getStatOrder();
        for(int i = 0; i < 6; i++){
            Iterator iter = stats.keySet().iterator();
            while(iter.hasNext()){
                if(iter.next().equals(statOrder[i])) stats.replace(statOrder[i], statHolder.remove(0));
            }
        }
        System.out.println(stats);
        return stats;
    }

    private HashMap<String, Integer> computeModifiers(HashMap<String, Integer> stats){
        HashMap<String, Integer> modifiers = new HashMap<>();
        Iterator iter = stats.keySet().iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            if(stats.get(key) < 10) modifiers.put(key, (stats.get(key)-10)/2 - 1);
            else modifiers.put(key, (stats.get(key)-10)/2);
        }
        System.out.println(modifiers);
        return modifiers;
    }

    private ArrayList<String> generateInventory(String balance){
        return null;
    }

    private ArrayList<String> generateSpellList(String balance){
        return null;
    }

    private ArrayList<String> computeProficiencies(){
        return null;
    }

    private HashMap<String, Integer> generateSkills(){
        return null;
    }

    private HashMap<String, String> generateFeatures(){
        return null;
    }

    private int computeHitPoints(){
        //return characterClass.baseHitPoints + character.level*(characterClass.baseHitPoints/2+1)
                //+ character.modifiers.get("Constitution")*character.level;
        return 0;
    }

    private int computeArmorClass(){
        return 0;
    }

    private int computeInitiative(HashMap<String, Integer> modifiers){
        return modifiers.get("Dexterity");
    }

    private HashMap<String, Integer> computeSavingThrows(){
        return null;
    }
}
