package ru.project.medievalrpg.enemies;

import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;
import ru.project.medievalrpg.descriptions.СharacterOfWorld;
import ru.project.medievalrpg.mainCharacter.MainHero;

public class Rat extends СharacterOfWorld {
   final private String RatName = "Крыс " + DataBaseOfNamesAdd.жалкий;
    public Rat(int level, int health, int damage, int defence) {
        super(level, health, damage, defence);
    }

    public String getRatName() {
        return RatName;
    }


}
