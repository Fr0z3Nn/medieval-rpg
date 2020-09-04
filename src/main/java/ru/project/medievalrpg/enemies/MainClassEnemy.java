package ru.project.medievalrpg.enemies;

import lombok.Getter;
import lombok.Setter;
import ru.project.medievalrpg.descriptions.CharacterOfWorld;

@Getter
@Setter
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
