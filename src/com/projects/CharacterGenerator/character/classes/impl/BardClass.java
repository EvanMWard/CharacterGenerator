package com.projects.CharacterGenerator.character.classes.impl;

import com.projects.CharacterGenerator.character.classes.AbstractCharacterClass;
import com.projects.CharacterGenerator.character.classes.ArmorType;
import com.projects.CharacterGenerator.character.classes.ICharacterClass;
import com.projects.CharacterGenerator.character.classes.Stat;
import com.projects.CharacterGenerator.character.inventory.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BardClass extends AbstractCharacterClass {
    private static final boolean SHIELD = false;

    private static final int BASE_HIT_POINTS = 8;

    private static final String NAME = "Bard";

    private static final List<Stat> STATS = new LinkedList<>() {{
        add(Stat.CHARISMA);
        add(Stat.DEXTERITY);
        add(Stat.WISDOM);
        add(Stat.CONSTITUTION);
        add(Stat.INTELLIGENCE);
        add(Stat.STRENGTH);
    }};

    public BardClass() {
        this(1);
    }

    public BardClass(int level) {
        super(NAME, SHIELD, BASE_HIT_POINTS, level, ArmorType.NONE /* TODO: Placeholder */);
    }

    @Override
    protected void init(List<String> features, List<Item> balancedInventory, List<Item> combatInventory, List<Item> rpInventory, List<Stat> stats) {
        stats.addAll(STATS);
    }
}
