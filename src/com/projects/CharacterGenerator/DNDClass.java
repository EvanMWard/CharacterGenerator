package com.projects.CharacterGenerator;

public enum DNDClass implements DNDValue{
    Barbarian(1), Bard(2), Cleric(3),
    Druid(4), Fighter(5), Monk(6),
    Paladin(7), Ranger(8), Rogue(9),
    Sorcerer(10), Warlock(11), Wizard(12);

    int classOrdinal;

    DNDClass(int ord){
        this.classOrdinal = ord;
    }

    public static DNDClass byOrdinal(int ord){
        for(DNDClass c : DNDClass.values()){
            if (c.classOrdinal == ord) {
                System.out.println("You have selected " + c);
                return c;
            }
        }
        return null;
    }
}
