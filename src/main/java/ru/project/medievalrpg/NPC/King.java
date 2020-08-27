package ru.project.medievalrpg.NPC;

import ru.project.medievalrpg.actions.Speaking;
import ru.project.medievalrpg.descriptions.Сharacter;

public class King extends Сharacter implements Speaking {

    public King(String name, int level, int health, int damage, int defence) {
        super(name, level, health, damage, defence);
    }

    public void attack() {
        //нет атаки
    }

    public void speak() {

    }
}
