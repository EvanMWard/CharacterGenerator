package com.projects.CharacterGenerator.character.classes;

import com.projects.CharacterGenerator.character.inventory.Item;
import com.projects.CharacterGenerator.util.ImmutableCollection;

public interface ICharacterClass {

    int getLevel();
    int getBaseHitPoints();

    ArmorType getArmorType();

    String getName();

    ImmutableCollection<Stat> getStatOrder();

    boolean hasShield();

    default boolean hasUnarmoredDefense() {
        return false;
    }

    ImmutableCollection<String> getFeatures();

    ImmutableCollection<Item> getBalancedInventory();
    ImmutableCollection<Item> getCombatInventory();
    ImmutableCollection<Item> getRPInventory();
}
