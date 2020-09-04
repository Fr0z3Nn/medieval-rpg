package ru.project.medievalrpg.enemies;

import lombok.Getter;
import lombok.Setter;
import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;

@Getter
@Setter
public class Rat extends MainClassEnemy {
    final private String RatName;

    public Rat(int level, int health, int damage, int defence) {
        super( level, health, damage, defence);
        this.RatName = "Крыс " + DataBaseOfNamesAdd.getNamesAdds();
    }

    public Rat() {
        this.RatName = "Крыс " + DataBaseOfNamesAdd.getNamesAdds();
    }

//Мне очень стыдно за код ниже: Но я пишу что пока могу;(
}

