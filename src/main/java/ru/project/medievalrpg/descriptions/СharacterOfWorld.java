package ru.project.medievalrpg.descriptions;

import ru.project.medievalrpg.exceptions.NullValueException;

public abstract class СharacterOfWorld implements DamageRandom {
    private String name;
    private int level;
    private int health;

    public int getHealth() {
        return health;
    }

    private int damageBase;
    private int defence;
    // private int energy;

    public СharacterOfWorld(int level, int health, int damageBase, int defence) { // не всем персонажам нужны стандартные имена
        this.level = level;
        this.health = health;
        this.damageBase = damageBase;
        this.defence = defence;
    }

    public СharacterOfWorld(String name, int level, int health, int damage, int defence) {
        this(level,health,damage,defence);
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamageBase() {
        return damageBase;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() throws NullValueException {
        if (this.damageBase <= 0) {
            throw new NullValueException();
        }
        return Math.max(this.damageBase, 0);
    }
    public int getDefence() throws NullValueException {
        if (this.defence <= 0) {
            throw new NullValueException();

        }
        return Math.max(this.defence, 0);
    }

    public String getName() {
        return name;
    }

}
