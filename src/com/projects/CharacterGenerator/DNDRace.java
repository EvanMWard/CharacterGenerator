package com.projects.CharacterGenerator;

public enum DNDRace{
    Dragonborn(1), Dwarf(2), Elf(3),
    Gnome(4), HalfElf(5), Halfling(6),
    HalfOrc(7), Human(8), Tiefling(9);

    int raceOrdinal;

    DNDRace(int ord){
        this.raceOrdinal = ord;
    }

    public static DNDRace byOrdinal(int ord){
        for(DNDRace race : DNDRace.values()){
            if(race.raceOrdinal == ord){
                System.out.println("You have selected " + race);
                return race;
            }
        }
        return null;
    }
}
