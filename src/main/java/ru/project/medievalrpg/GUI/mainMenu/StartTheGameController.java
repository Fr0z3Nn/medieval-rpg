package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class StartTheGameController{

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
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/gui/chooseName.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                StartTheGame.primaryStage.setScene(new Scene(root,600,333));
            }
        });
    }
}
