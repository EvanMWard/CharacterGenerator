package com.projects.CharacterGenerator.character.classes;

import com.projects.CharacterGenerator.character.inventory.Item;
import com.projects.CharacterGenerator.util.ImmutableCollection;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractCharacterClass implements ICharacterClass {

    protected boolean shield;

    protected int level;
    protected int baseHitPoints;

    protected String name;

    protected ArmorType armorType;

    protected final ImmutableCollection<String> features;
    protected final ImmutableCollection<Item> balancedInventory;
    protected final ImmutableCollection<Item> combatInventory;
    protected final ImmutableCollection<Item> rpInventory;
    protected final ImmutableCollection<Stat> stats;

    public AbstractCharacterClass(String name, boolean shield, int baseHitPoints, int level, ArmorType armorType) {
        this.name = name;
        this.shield = shield;
        this.baseHitPoints = baseHitPoints;
        this.level = level;
        this.armorType = armorType;
        List<String> features = new LinkedList<>();
        List<Item> balancedInventory = new LinkedList<>();
        List<Item> combatInventory = new LinkedList<>();
        List<Item> rpInventory = new LinkedList<>();
        List<Stat> stats = new LinkedList<>();
        init(features, balancedInventory, combatInventory, rpInventory, stats);

        if (this instanceof IUnarmoredDefensive) {
            features.add("Unarmored Defense (" + ((IUnarmoredDefensive) this).getUnarmoredDefenseStat().name() + ")");
        }

        this.features = new ImmutableCollection<>(features);
        this.balancedInventory = new ImmutableCollection<>(balancedInventory);
        this.combatInventory = new ImmutableCollection<>(combatInventory);
        this.rpInventory = new ImmutableCollection<>(rpInventory);
        this.stats = new ImmutableCollection<>(stats);
    }

    protected abstract void init(List<String> features, List<Item> balancedInventory, List<Item> combatInventory, List<Item> rpInventory, List<Stat> stats);

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getBaseHitPoints() {
        return this.baseHitPoints;
    }

    @Override
    public ArmorType getArmorType() {
        return this.armorType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ImmutableCollection<Stat> getStatOrder() {
        return this.stats;
    }

    @Override
    public boolean hasShield() {
        return this.shield;
    }

    @Override
    public ImmutableCollection<String> getFeatures() {
        return this.features;
    }

    @Override
    public ImmutableCollection<Item> getBalancedInventory() {
        return this.balancedInventory;
    }

    @Override
    public ImmutableCollection<Item> getCombatInventory() {
        return this.combatInventory;
    }

    @Override
    public ImmutableCollection<Item> getRPInventory() {
        return this.rpInventory;
    }
}
