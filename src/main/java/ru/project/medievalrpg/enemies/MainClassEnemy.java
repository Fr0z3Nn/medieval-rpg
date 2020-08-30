package ru.project.medievalrpg.enemies;

import ru.project.medievalrpg.descriptions.CharacterOfWorld;

public class MainClassEnemy extends CharacterOfWorld {

    public MainClassEnemy(String name, int level, int health, int damage, int defence) {
        super(name, level, health, damage, defence);
    }

    public MainClassEnemy(int level, int health, int damageBase, int defence) {
        super(level, health, damageBase, defence);
    }

    public MainClassEnemy() {
    }
}
