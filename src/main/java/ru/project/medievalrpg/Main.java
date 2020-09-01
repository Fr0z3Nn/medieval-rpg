package ru.project.medievalrpg;

import ru.project.medievalrpg.actions.Attack;
import ru.project.medievalrpg.enemies.Rat;
import ru.project.medievalrpg.exceptions.NullValueException;
import ru.project.medievalrpg.mainCharacter.MainHero;


public class Main extends Attack {
    // для общего доступа все переменные такого типа будут храниться тут
    public static MainHero mainHero;
    public static Rat easyRat;
    public static Rat normalRat;
    public static Rat hardRat;

    public static void main(String[] args) throws NullValueException {
        if (Attack.fight(mainHero, new Rat(1, 20, 5, 5))) {
            System.out.printf("%s за победу над %s вы получаете только нагоняй. А нефиг мучать животных",
                    mainHero.getName(), new Rat().getRatName());
        }
    }
}
