package ru.project.medievalrpg.mainCharacter;

import ru.project.medievalrpg.actions.Speaking;
import ru.project.medievalrpg.descriptions.Сharacter;
//test

public class MainHero extends Сharacter implements Speaking {
    public MainHero(String name, int level, int health, int damage, int defence) {
        super(name, level, health, damage, defence);
    }

    public void speak() {

    }

    public void attack() {

    }
}
