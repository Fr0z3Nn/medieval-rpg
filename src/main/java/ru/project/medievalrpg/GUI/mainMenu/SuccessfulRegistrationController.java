package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SuccessfulRegistrationController {
    @FXML
    public Button next;
    @FXML
    public TextArea kingText;
    @FXML
    public void initialize(){
//        kingText.setEditable(false);
        next.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
            }
        });
    }
}
