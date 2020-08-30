package ru.project.medievalrpg.GUI.mainMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LoseFightWithRatController {
    @FXML
    public Button continueTravel;
    @FXML
    public void initialize() {
        continueTravel.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/ratCave.fxml"));

    }
}
