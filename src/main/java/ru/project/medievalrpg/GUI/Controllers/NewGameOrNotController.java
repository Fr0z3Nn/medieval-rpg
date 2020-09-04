package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.mainCharacter.MainHero;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NewGameOrNotController {
    @FXML
    public Button newGame;
    @FXML
    public Button continueGame;

    @FXML
    public void initialize() {
        newGame.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/chooseName.fxml"));

        continueGame.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> {
            try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream("SavedGame.ser"));
                Main.mainHero = (MainHero) is.readObject();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            StartTheGame.setNewScene("/gui/map.fxml");
        });

    }
}
