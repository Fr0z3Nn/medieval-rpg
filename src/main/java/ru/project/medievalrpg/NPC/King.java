package ru.project.medievalrpg.NPC;

import ru.project.medievalrpg.descriptions.CharacterOfWorld;

public class King extends CharacterOfWorld {
    static private String kingName = "Артур"; // Let be one King of the World!


    public static String getKingName() { //Это костыль
        return kingName;
    }

    public King(int level, int health, int damage, int defence) {
        super(level, health, damage, defence);
    }


    public void attack() {
        //нет атаки
    }

    public void speak() {

    }
}
