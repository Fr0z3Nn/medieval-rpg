package ru.project.medievalrpg.enemies;

import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;


public class Wolf extends MainClassEnemy {
    final private String name = "Волк " + DataBaseOfNamesAdd.getNamesAdds();

    public Wolf(int level, int health, int damageBase, int defence) {
        super(level, health, damageBase, defence);
    }

    public void fight() {
    }
}
