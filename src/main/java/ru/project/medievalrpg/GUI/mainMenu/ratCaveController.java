package ru.project.medievalrpg.GUI.mainMenu;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class ratCaveController {
    @FXML
    public ImageView easyFight;
    @FXML
    public ImageView normalFight;
    @FXML
    public ImageView hardFight;
    @FXML
    public Text levelInfo;

    @FXML
    public void initialize() {
        easyFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
        normalFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
        hardFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
    }
}
