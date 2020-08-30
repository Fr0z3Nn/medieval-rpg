package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.NPC.King;
import ru.project.medievalrpg.dataBase.Talk;

import java.io.IOException;

public class SuccessfulRegistrationController {
    @FXML
    public Button next;
    @FXML
    public TextArea kingText;
    private int menuCount = 0;
    @FXML
    public void initialize(){

        kingText.setText(Talk.kingGreeting);

        next.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {

                switch (menuCount){
                    case 0:
                        kingText.setText(Talk.heroThoughts);
                        menuCount++;
                        break;

                    case 1:
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("/gui/ratCave.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        StartTheGame.primaryStage.setScene(new Scene(root, 600, 333));
                        break;
                }

            }
        });
    }
}
