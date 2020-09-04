package ru.project.medievalrpg.mainCharacter;

import ru.project.medievalrpg.descriptions.CharacterOfWorld;

import java.io.Serializable;


public class MainHero extends CharacterOfWorld {
    public MainHero(String name, int level, int maxExp, int exp, int health, int damage, int defence) {
        super(name, level, maxExp, exp, health, damage, defence);
    }

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
