package ru.project.medievalrpg.actions;

public interface Attacj {
    default int attack(int attackerLvL, int attackerAttack, int enemyDef, int enemyHeath) {
        int damage = valueAfterCalculate(attackerAttack, attackerLvL); // прогнозируемый уровень аттаки
        damage = armorReduceAttack(damage, enemyDef);
        return enemyHeath - damage;
    }

    default int valueAfterCalculate(int heroAttack, int LvL) {
        return (int) (Math.random() * (LvL * 0.8))*10 + heroAttack;
    }

    default int armorReduceAttack(int attack, int defence) {
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
