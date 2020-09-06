package ru.project.medievalrpg.mainCharacter;

import lombok.*;
import ru.project.medievalrpg.descriptions.CharacterOfWorld;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class MainHero extends CharacterOfWorld {
    private String name;
    private int level;
    private int maxExp;
    private int exp;
    private int health;
    private int damageBase;
    private int defence;

    public void levelUp() {
        if (getExp() == getMaxExp()) {
            int addLevel = getLevel() + 1;
            setLevel(addLevel);
            setExp(getExp() - getMaxExp()); // если exp стал больше, чем максимальный, отнимем максимальный.
            setMaxExp(getMaxExp() + 10);
        }
    }

    public void addExpForWin(int exp) {
        setExp(getExp() + exp);
    }
}
