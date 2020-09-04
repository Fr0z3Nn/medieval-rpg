package ru.project.medievalrpg.mainCharacter;

import ru.project.medievalrpg.descriptions.CharacterOfWorld;

import java.io.Serializable;


public class MainHero extends CharacterOfWorld {
    public MainHero(String name, int level, int maxExp, int exp, int health, int damage, int defence) {
        super(name, level, maxExp, exp, health, damage, defence);
    }

    public void levelUp() {
        if (this.getExp() == this.getMaxExp()) {
            int addLevel = this.getLevel() + 1;
            this.setLevel(addLevel);
            this.setExp(this.getExp() - this.getMaxExp()); // если exp стал больше, чем максимальный, отнимем максимальный.
            this.setMaxExp(this.getMaxExp() + 10);
        }
    }

    public void addExpForWin(int exp) {
        this.setExp(this.getExp() + exp);
    }
}
