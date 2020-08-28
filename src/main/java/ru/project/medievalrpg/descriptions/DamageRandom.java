package ru.project.medievalrpg.descriptions;

public interface DamageRandom {
    default int changeAttack(int level, int attack) {
        return (int) ((level * 0.8) + (Math.random() * 10)) + attack;
    }
}
