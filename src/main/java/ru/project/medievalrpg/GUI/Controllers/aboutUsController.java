package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;

public class aboutUsController {
    @FXML
    public Button back;

    @FXML
    public void initialize() {
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent
                -> StartTheGame.setNewScene("/gui/startMenu.fxml"));
    }
}
