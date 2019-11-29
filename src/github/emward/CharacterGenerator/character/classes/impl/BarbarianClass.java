package com.projects.CharacterGenerator.character.classes.impl;

import com.projects.CharacterGenerator.character.classes.AbstractCharacterClass;
import com.projects.CharacterGenerator.character.classes.ArmorType;
import com.projects.CharacterGenerator.character.classes.ICharacterClass;
import com.projects.CharacterGenerator.character.classes.IUnarmoredDefensive;
import com.projects.CharacterGenerator.character.classes.Stat;
import com.projects.CharacterGenerator.character.inventory.Item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BarbarianClass extends AbstractCharacterClass implements IUnarmoredDefensive {

    private static final boolean SHIELD = false;

    private static final int BASE_HIT_POINTS = 12;

    private static final String NAME = "Barbarian";

    private static final List<String> FEATURES = new LinkedList<>() {{
        add("Rage");
    }};

    private static final List<Item> BALANCED_INVENTORY = new LinkedList<>() {{
        add(new Item("Greataxe", 1));
        add(new Item("Handaxe", 2));
        add(new Item("Javlin", 4));
        add(new Item("Explorer's Pack", 1));
    }};

    private static final List<Stat> STATS = new LinkedList<>() {{
        add(Stat.STRENGTH);
        add(Stat.CONSTITUTION);
        add(Stat.DEXTERITY);
        add(Stat.CHARISMA);
        add(Stat.WISDOM);
        add(Stat.INTELLIGENCE);
    }};

    public BarbarianClass() {
        this(1);
    }

    // TODO: We can use this in the future if user wants to generate a higher level character
    public BarbarianClass(int level) {
        super(NAME, SHIELD, BASE_HIT_POINTS, level, ArmorType.NONE);
    }

    @Override
    protected void init(List<String> features, List<Item> balancedInventory, List<Item> combatInventory, List<Item> rpInventory, List<Stat> stats) {
        features.addAll(FEATURES);
        balancedInventory.addAll(BALANCED_INVENTORY);
        combatInventory.addAll(BALANCED_INVENTORY);
        rpInventory.addAll(BALANCED_INVENTORY);
        stats.addAll(STATS);
    }

    @Override
    public Stat getUnarmoredDefenseStat() {
        return Stat.CONSTITUTION;
    }
}
