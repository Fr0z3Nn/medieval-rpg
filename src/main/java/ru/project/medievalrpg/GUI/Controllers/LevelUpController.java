package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;

public class LevelUpController {
    @FXML
    public Button continueTravel;
    @FXML
    public Text levelUpText;
    @FXML
    public void initialize() {
        levelUpText.setText((Main.mainHero.getLevel()-1) + " => " + Main.mainHero.getLevel());
        continueTravel.addEventHandler(MouseEvent.MOUSE_CLICKED,
                mouseEvent -> StartTheGame.setNewScene("/gui/ratCave.fxml"));

    }
}
