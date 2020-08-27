package ru.project.medievalrpg.descriptions;

import ru.project.medievalrpg.exceptions.NullValueException;

public abstract class Сharacter {
    private String name;
    private int level;
    private int health;
    private int damage;
    private int defence;
    // private int energy;

    public abstract void attack();

    public Сharacter(String name, int level, int health, int damage, int defence) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.defence = defence;
    }

    public int getAttack() throws NullValueException {
        if(this.damage <= 0){
            throw new NullValueException();
        }
        return Math.max(this.damage, 0);
    }

    public int getDefence() throws NullValueException {
        if(this.defence <= 0){
            throw new NullValueException();
        }
        return Math.max(this.defence, 0);
    }
}
