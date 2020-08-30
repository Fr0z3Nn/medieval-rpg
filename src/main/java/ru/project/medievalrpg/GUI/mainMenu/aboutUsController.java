package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class aboutUsController {
    @FXML
    public Button back;
    @FXML
    public void initialize(){
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/gui/startMenu.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                StartTheGame.primaryStage.setScene(new Scene(root,600,333));
            }
        });

    }
}
