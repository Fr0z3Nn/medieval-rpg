package ru.project.medievalrpg.descriptions;

import lombok.Getter;
import lombok.Setter;
import ru.project.medievalrpg.exceptions.NullValueException;

import java.io.Serializable;
@Getter
@Setter
public abstract class CharacterOfWorld implements Serializable {
    private String name;
    private int level;
    private int maxExp;
    private int exp;
    private int health;

    protected CharacterOfWorld() {
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

    public int getAttack() throws NullValueException {
        if (this.damageBase <= 0) {
            throw new NullValueException();
        }
        return Math.max(this.damageBase, 0);
    }
}
