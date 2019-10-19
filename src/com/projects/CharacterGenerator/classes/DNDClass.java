package com.projects.CharacterGenerator.classes;

import com.projects.CharacterGenerator.DNDValue;
import com.projects.CharacterGenerator.classes.Barbarian;

public interface DNDClass extends DNDValue {

    public static DNDClass byOrdinal(int ord){
        if(ord == 1) return new Barbarian();
        if(ord == 2) return new Bard();
        if(ord == 3) return new Cleric();
        if(ord == 4) return new Druid();
        if(ord == 5) return new Fighter();
        if(ord == 6) return new Monk();
        if(ord == 7) return new Paladin();
        if(ord == 8) return new Ranger();
        if(ord == 9) return new Rogue();
        if(ord == 10) return new Sorcerer();
        if(ord == 11) return new Warlock();
        if(ord == 12) return new Wizard();
    return null;
    }


    public String[] getStatOrder();
    public String toString();

}
