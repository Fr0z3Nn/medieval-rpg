package ru.project.medievalrpg.descriptions;

import ru.project.medievalrpg.exceptions.NullValueException;

import java.io.Serializable;

public abstract class CharacterOfWorld implements Serializable {
    private String name;
    private int level;
    private int maxExp;
    private int exp;
    private int health;

    protected CharacterOfWorld() {
    }

    public int getHealth() {
        return health;
    }

    private int damageBase;
    private int defence;
    // private int energy;

    public CharacterOfWorld(int level, int health, int damageBase, int defence) { // не всем персонажам нужны стандартные имена
        this.level = level;
        this.health = health;
        this.damageBase = damageBase;
        this.defence = defence;
    }

    public CharacterOfWorld(String name, int level, int maxExp, int exp, int health, int damageBase, int defence) { // конструктор для персонажа
        this.name = name;
        this.level = level;
        this.maxExp = maxExp;
        this.exp = exp;
        this.health = health;
        this.damageBase = damageBase;
        this.defence = defence;
    }

    public CharacterOfWorld(String name, int level, int health, int damage, int defence) {
        this(level, health, damage, defence);
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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
