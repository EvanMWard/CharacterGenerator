package com.projects.CharacterGenerator;

import com.projects.CharacterGenerator.classes.DNDClass;

import java.util.*;

class Generator {
    private Character character;
    private String balance = "Balance";

    Generator(DNDRace characterRace, DNDClass characterClass){
        character = new Character(characterRace, characterClass);
    }

    Character generateCharacter(){
        character.stats = rollStats();
        character.modifiers = computeModifiers(character.getStats());
        getBalance();
        character.inventory = generateInventory(balance);
        character.spellList = generateSpellList(balance);
        character.proficiencies = computeProficiencies();
        character.skills = generateSkills(character.getModifiers(), character.getProficiencies());
        character.features = generateFeatures();
        character.hitPoints = computeHitPoints();
        character.armorClass = computeArmorClass(character.getModifiers());
        character.initiative = computeInitiative(character.getModifiers());
        character.savingThrows = computeSavingThrows(character.getModifiers(), character.getProficiencies());
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
            for (String key : stats.keySet()) {
                if (key.equals(statOrder[i])) stats.replace(statOrder[i], statHolder.remove(0));
            }
        }
        System.out.println(stats);
        return stats;
    }

    private HashMap<String, Integer> computeModifiers(HashMap<String, Integer> stats){
        HashMap<String, Integer> modifiers = new HashMap<>();
        for (String key : stats.keySet()) {
            if (stats.get(key) < 10) modifiers.put(key, (stats.get(key) - 10) / 2 - 1);
            else modifiers.put(key, (stats.get(key) - 10) / 2);
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
        return new ArrayList<>();
    }

    private HashMap<String, Integer> generateSkills(HashMap <String, Integer> modifiers, ArrayList<String> proficiencies){
        HashMap<String, Integer> skills = new HashMap<>();
        populateSkillMap(skills, modifiers);
        for (String key : skills.keySet()) {
            for (String prof : proficiencies) {
                if (prof.equals(key)) skills.replace(key, skills.get(key) + character.getProficiencyBonus());
            }
        }
        return skills;
    }

    private HashMap<String, String> generateFeatures(){
        HashMap<String, String> classFeatures = character.getCharacterClass().getFeatures();
        //HashMap<String, String> raceFeatures = character.getCharacterRace().getFeatures();
        HashMap<String, String> characterFeatures = new HashMap<>();
        for (String key : classFeatures.keySet()) {
            characterFeatures.put(key, classFeatures.get(key));
        }
        /*iter = raceFeatures.keySet().iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            characterFeatures.put(key, raceFeatures.get(key));
        }*/
        return characterFeatures;
    }

    private int computeHitPoints(){
        int baseHP = character.getCharacterClass().getBaseHitPoints();
        int level = character.getCharacterClass().getLevel();
        return baseHP
                + level*character.getModifiers().get("Constitution")
                + (level-1)*(baseHP/2+1);
    }

    private int computeArmorClass(HashMap<String, Integer> modifiers){
        String armorType = character.getCharacterClass().getArmorType();
        boolean hasShield = character.getCharacterClass().hasShield();
        int dexMod = modifiers.get("Dexterity");
        int armorClass = 0;
        switch(armorType){
            case "ChainMail":
                armorClass = 16;
                break;
            case "Leather":
                armorClass = 11 + dexMod;
                break;
            case "ScaleMail":
                armorClass = 14 + Math.min(dexMod, 2);
                break;
            case "None":
                String unarmoredDefense = character.getCharacterClass().getUnarmoredDefense();
                if(unarmoredDefense != null) armorClass = 10+dexMod+modifiers.get(unarmoredDefense);
                else armorClass = 10+dexMod;
            default:
                break;
        }
        if (hasShield) armorClass += 2;
        return armorClass;
    }

    private int computeInitiative(HashMap<String, Integer> modifiers){
        return modifiers.get("Dexterity");
    }

    private HashMap<String, Integer> computeSavingThrows(HashMap<String, Integer> modifiers, ArrayList<String> proficiencies){
        HashMap<String, Integer> savingThrows = new HashMap<>();

        for(int i = 0; i < 6; i++){
            Iterator iter = modifiers.keySet().iterator();
            while(iter.hasNext()){
                String key = (String)iter.next();
                savingThrows.put(key+"Save", modifiers.get(key));
            }
            iter = savingThrows.keySet().iterator();
            while(iter.hasNext()){
                String key = (String)iter.next();
                for(String prof : proficiencies){
                    if(prof.equals(key)) savingThrows.replace(key, savingThrows.get(key)+character.getProficiencyBonus());
                }
            }
        }
        return savingThrows;
    }

    private void populateSkillMap(HashMap<String, Integer> skills, HashMap<String, Integer> modifiers){
        System.out.println(modifiers);
        int strMod = modifiers.get("Strength");
        int dexMod = modifiers.get("Dexterity");
        int intMod = modifiers.get("Intelligence");
        int wisMod = modifiers.get("Wisdom");
        int chaMod = modifiers.get("Charisma");
        skills.put("Acrobatics", dexMod);
        skills.put("Animal Handling", wisMod);
        skills.put("Arcana", intMod);
        skills.put("Athletics", strMod);
        skills.put("Deception", chaMod);
        skills.put("History", intMod);
        skills.put("Insight", wisMod);
        skills.put("Intimidation", chaMod);
        skills.put("Investigation", intMod);
        skills.put("Medicine", wisMod);
        skills.put("Nature", intMod);
        skills.put("Perception", wisMod);
        skills.put("Performance", chaMod);
        skills.put("Persuasion", chaMod);
        skills.put("Religion", intMod);
        skills.put("Sleight Of Hand", dexMod);
        skills.put("Stealth", dexMod);
        skills.put("Survival", wisMod);
    }
}
