package ru.project.medievalrpg.enemies;

import lombok.Builder;
import lombok.NonNull;
import ru.project.medievalrpg.dataBase.DataBaseOfNamesAdd;

@Builder
public class Wolf extends MainClassEnemy {
    final private String name = "Волк " + DataBaseOfNamesAdd.getNamesAdds();

    public void fight() {
    }
}
