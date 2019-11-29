package com.projects.CharacterGenerator.character.classes;

public interface IUnarmoredDefensive extends ICharacterClass {

    default boolean hasUnarmoredDefense() {
        return true;
    }

    Stat getUnarmoredDefenseStat();
}
