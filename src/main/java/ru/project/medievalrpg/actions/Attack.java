package ru.project.medievalrpg.actions;

import ru.project.medievalrpg.enemies.MainClassEnemy;
import ru.project.medievalrpg.exceptions.NullValueException;
import ru.project.medievalrpg.mainCharacter.MainHero;

public class Attack {
     protected static boolean fight(MainHero hero, MainClassEnemy enemy) throws NullValueException {
        int enemyHP = enemy.getHealth();
        int heroHP = hero.getHealth();
        while (enemyHP > 0 && heroHP > 0) {
            System.out.printf("\nВы жадно смотрите на %s. Он тоже ничего." +
                    "\nВы атакуете!", enemy.getName());
            enemyHP = attack(hero.getLevel(), hero.getDamageBase(), enemy.getDefence(), enemy.getHealth());
            System.out.printf("%s\nВы нанесли %d урона!", hero.getName(), enemy.getHealth() - enemyHP);
            System.out.printf("\nТеперь вермя %s вас ублажать!\n", enemy.getName()); // что??!?!?!
            heroHP = attack(enemy.getLevel(), enemy.getAttack(), hero.getDefence(), hero.getHealth());
            System.out.printf("%s\nВы нанесли %d урона!", enemy.getName(), hero.getHealth() - heroHP);
            enemy.setHealth(enemyHP);
            hero.setHealth(heroHP);
            if (enemyHP <= 0 || heroHP <= 0) {
                System.out.println("Бой закончен!");
            } else {
                System.out.println("Бой продолжаеться!");
            }
        }
        return enemyHP <= 0;

    }

  protected static int attack(int attackerLvL, int attackerAttack, int enemyDef, int enemyHeath) {
        int damage = valueAfterCalculate(attackerAttack, attackerLvL); // прогнозируемый уровень аттаки
        damage = armorReduceAttack(damage, enemyDef);
        return enemyHeath - damage;
    }

    protected static  int valueAfterCalculate(int heroAttack, int LvL) {
        return (int) (Math.random() * (LvL * 0.8)) * 10 + heroAttack;
    }

   protected static int armorReduceAttack(int attack, int defence) {
        int resault = attack - (attack / defence);
        if (resault <= 0) {
            System.out.println("Твоя атака так слаба!");
            return 0;
        } else {
            System.out.println("Твоя атака прошла успешно.");
            return resault;
        }
    }
}


