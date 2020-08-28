package ru.project.medievalrpg.mainCharacter;

import ru.project.medievalrpg.actions.Speaking;
import ru.project.medievalrpg.descriptions.СharacterOfWorld;


public class MainHero extends СharacterOfWorld implements Speaking {
    public MainHero(String name, int level, int health, int damage, int defence) {
        super(name, level, health, damage, defence);
    }

    public void speak() {

    }

    public void attack() {

    }
}