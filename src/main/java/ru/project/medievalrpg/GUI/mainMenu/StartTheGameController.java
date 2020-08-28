package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
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
    public void initialize(){
        startGame.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                startGame.setText("Thanks!");
            }
        });
    }

}
