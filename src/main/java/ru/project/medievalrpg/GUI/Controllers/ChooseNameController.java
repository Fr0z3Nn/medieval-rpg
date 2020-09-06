package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.mainCharacter.MainHero;

public class ChooseNameController {

    @FXML
    public TextField heroName;
    @FXML
    public Text textForOutput;
    @FXML
    private Button createHero;

    @FXML
    public void initialize() {
        createHero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(heroName.getText().equals("")){
                textForOutput.setText("Имя не должно быть пустым.");
            }else if(heroName.getText().length() < 3){
                textForOutput.setText("Имя не может быть меньше 3х символов.");
            }else if(heroName.getText().matches("[a-zA-Z0-9_-]{3,15}")){
                registerCharacter();
                correctNameInput();
            }else{
                textForOutput.setText("Длина 3-15 символов, только a-z A-Z 0-9 _ -");
            }
        });
    }

    private void registerCharacter(){
        Main.mainHero = MainHero.builder()
                .name(heroName.getText())
                .level(1)
                .maxExp(10)
                .exp(0)
                .health(100)
                .damageBase(50)
                .defence(5)
                .pointsToImproveStats(0)
                .build();
    }

    private void correctNameInput() {
        StartTheGame.setNewScene("/gui/successfulRegistration.fxml");
    }
}

