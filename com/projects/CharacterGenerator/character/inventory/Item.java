package com.projects.CharacterGenerator.character.inventory;

public class Item {

    private final String name;
    private final String plural;

    private int amount;

    public Item(String name, int amount) {
        this(name, name + "s", amount);
    }

    public Item(String name, String plural, int amount) {
        this.name = name;
        this.plural = plural;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public String getPlural() {
        return this.plural;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getDisplay() {
        if (getAmount() > 1) {
            return getAmount() + " " + this.plural;
        }

        return this.name;
    }
}
