package ru.project.medievalrpg.GUI.mainMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class StartTheGameController {

    @FXML
    private Button startGame;
    @FXML
    private Button about;
    @FXML
    private Button exit;

    @FXML
    public void initialize() {
        startGame.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/chooseName.fxml"));

        about.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/aboutUs.fxml"));

        exit.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> System.exit(0));
    }
}
