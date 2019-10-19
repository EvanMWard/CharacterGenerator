package com.projects.CharacterGenerator;

class Generator {
    private DNDClass characterClass;
    private DNDRace characterRace;


    Generator(DNDRace characterRace, DNDClass characterClass){
        this.characterRace = characterRace;
        this.characterClass = characterClass;
    }
}
