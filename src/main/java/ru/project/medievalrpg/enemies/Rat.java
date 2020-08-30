package ru.project.medievalrpg.enemies;

import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;

public class Rat extends MainClassEnemy {
    final private String RatName = "Крыс " + DataBaseOfNamesAdd.getNamesAdds();

    public Rat(int level, int health, int damage, int defence) {
        super(new Rat().getRatName(), level, health, damage, defence);
    }

    public Rat() {
    }

    public String getRatName() {
        return RatName;
    }
//Мне очень стыдно за код ниже: Но я пишу что пока могу;(
}
