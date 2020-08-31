package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;

public class WinFightWithRatController {
    @FXML
    public Button continueTravel;
    @FXML
    public void initialize() {
        continueTravel.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/ratCave.fxml"));

    }
}
