package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.mainCharacter.MainHero;

import java.io.IOException;

public class ChooseNameController {

    @FXML
    public TextField heroName;
    @FXML
    public Text textForOutput;
    @FXML
    private Button createHero;

    @FXML
    public void initialize() {
        createHero.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                correctNameInput();
            }
        });
    }

    private void correctNameInput() {
        Main.mainHero = new MainHero(heroName.getText(), 1, 100, 5, 5);
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/gui/successfulRegistration.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        StartTheGame.primaryStage.setScene(new Scene(root, 600, 333));
    }
}
//correctInputAndGoNext();
                /*if(heroName.getText() != null){
                    correctInputAndGoNext();
                }else{
                    textForOutput.setText("Имя не должно отсутствовать");
                }*/
