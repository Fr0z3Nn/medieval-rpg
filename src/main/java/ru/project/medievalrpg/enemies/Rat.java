package ru.project.medievalrpg.enemies;

import lombok.*;
import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rat extends MainClassEnemy {
    final private String RatName = "Крыс " + DataBaseOfNamesAdd.getNamesAdds();
    private int level;
    private int health;
    private int damage;
    private int defence;



//Мне очень стыдно за код ниже: Но я пишу что пока могу;(
}

