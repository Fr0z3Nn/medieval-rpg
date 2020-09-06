package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.enemies.Rat;

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
    public ImageView back;
    @FXML
    public Text easyText;
    @FXML
    public Text normalText;
    @FXML
    public Text hardText;

    @FXML
    public void initialize() {
        Main.easyRat = Rat.builder()
                .defence(5)
                .health(100)
                .damage(5)
                .level(5)
                .build();
        Main.normalRat = Rat.builder()
                .defence(5)
                .health(100)
                .damage(5)
                .level(10)
                .build();
        Main.hardRat = Rat.builder()
                .defence(5)
                .health(100)
                .damage(5)
                .level(15)
                .build();
        easyText.setText(Main.easyRat.getRatName() + " LVL." + Main.easyRat.getLevel());
        normalText.setText(Main.normalRat.getRatName() + " LVL." + Main.normalRat.getLevel());
        hardText.setText(Main.hardRat.getRatName() + " LVL." + Main.hardRat.getLevel());
        easyFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
        normalFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
        hardFight.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/fightWithRat.fxml"));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/map.fxml"));
    }
}
