package ru.project.medievalrpg.enemies;

import ru.project.medievalrpg.actions.Attacj;
import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;
import ru.project.medievalrpg.descriptions.СharacterOfWorld;
import ru.project.medievalrpg.exceptions.NullValueException;
import ru.project.medievalrpg.mainCharacter.MainHero;

public class Rat extends СharacterOfWorld implements Attacj {
    final private String RatName = "Крыс " + DataBaseOfNamesAdd.жалкий;

    public Rat(int level, int health, int damage, int defence) {
        super(level, health, damage, defence);
    }

    public String getRatName() {
        return RatName;
    }
//Мне очень стыдно за код ниже: Но я пишу что пока могу;(

    public boolean fight(MainHero hero, Rat rat) throws NullValueException {
        int ratHP = rat.getHealth();
        int heroHP = hero.getHealth();
        int dmg = 0;
        while (ratHP > 0 && heroHP > 0) {
            System.out.printf("\nВы жадно смотрите на %s. Он тоже ничего." +
                    "\nВы атакуете!", rat.getRatName());
            ratHP = attack(hero.getLevel(), hero.getDamageBase(), rat.getDefence(), rat.getHealth());
            System.out.printf("%s\nВы нанесли %d урона!",hero.getName(), rat.getHealth() - ratHP);
            System.out.println("Теперь вермя крысы вас ублажать!"); // что??!?!?!
            heroHP = attack(rat.getLevel(), rat.getAttack(), hero.getDefence(),hero.getHealth());
            System.out.printf("%s\nВы нанесли %d урона!",rat.getRatName(), hero.getHealth() - heroHP);
            rat.setHealth(ratHP);
            hero.setHealth(heroHP);
            if(ratHP<=0 || heroHP <=0){
                System.out.println("Бой закончен!");
            }
            else {
                System.out.println("Бой продолжаеться!");
            }
        }
        return ratHP<=0;

    }

}
