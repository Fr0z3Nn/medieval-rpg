package ru.project.medievalrpg.descriptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.project.medievalrpg.exceptions.NullValueException;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class CharacterOfWorld implements Serializable {
    private String name;
    private int level;
    private int maxExp;
    private int exp;
    private int health;
    private int damageBase;
    private int defence;
    // private int energy;

    public CharacterOfWorld(int level, int health, int damageBase, int defence) { // не всем персонажам нужны стандартные имена
        this.level = level;
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
