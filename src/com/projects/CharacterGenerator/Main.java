package com.projects.CharacterGenerator;

import com.projects.CharacterGenerator.classes.DNDClass;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Character character;
        DNDRace characterRace;
        DNDClass characterClass;
        characterRace = (DNDRace) getUserInput("race");
        characterClass = (DNDClass) getUserInput("class");
        System.out.println("You have selected " + characterRace + " " + characterClass);
        Generator generator = new Generator(characterRace, characterClass);
        character = generator.generateCharacter();
        System.out.println(character);
    }

    private static Object getUserInput(String input){
        int ordinal;
        while(true) {
            if(input.equals("race")) {
                System.out.println("Please enter what race you'd like your character to be (1-9):");
                System.out.println("1. Dragonborn");
                System.out.println("2. Dwarf");
                System.out.println("3. Elf");
                System.out.println("4. Gnome");
                System.out.println("5. Half-Elf");
                System.out.println("6. Halfling");
                System.out.println("7. Half-Orc");
                System.out.println("8. Human");
                System.out.println("9. Tiefling");
                ordinal = scanner.nextInt();
                if(ordinal > 0 && ordinal < 10) return DNDRace.byOrdinal(ordinal);
            }
            else{
                System.out.println("Please enter what class you'd like your character to be (1-12):");
                System.out.println("1. Barbarian");
                System.out.println("2. Bard");
                System.out.println("3. Cleric");
                System.out.println("4. Druid");
                System.out.println("5. Fighter");
                System.out.println("6. Monk");
                System.out.println("7. Paladin");
                System.out.println("8. Ranger");
                System.out.println("9. Rogue");
                System.out.println("10. Sorcerer");
                System.out.println("11. Warlock");
                System.out.println("12. Wizard");
                ordinal = scanner.nextInt();
                if(ordinal > 0 && ordinal < 13) return DNDClass.byOrdinal(ordinal);
            }
        }
    }
}

