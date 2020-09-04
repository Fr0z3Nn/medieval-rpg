package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;

public class WinFightWithRatController {
    @FXML
    public Button continueTravel;

    @FXML
    public void initialize() {
        continueTravel.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            int currentLvl = Main.mainHero.getLevel();
            Main.mainHero.levelUp();
            int nextLvl = Main.mainHero.getLevel();
            if (currentLvl != nextLvl) {
                StartTheGame.setNewScene("/gui/levelUp.fxml");
            } else {
                StartTheGame.setNewScene("/gui/ratCave.fxml");
            }
        });


    }
}
