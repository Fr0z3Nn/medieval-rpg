package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;

public class fightWithRatController {
    @FXML
    public Button attack;
    @FXML
    public Button defend;
    @FXML
    public Text heroHp;
    @FXML
    public Text ratHP;
    int hl = 100;

    @FXML
    public void initialize() {

        heroHp.setText(Main.mainHero.getHealth() + "/100");
        ratHP.setText(hl + "/100");

        attack.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            ratHP.setText((hl -= 10) + "/100");
            if (Main.mainHero.getHealth() <= 0) {
                StartTheGame.setNewScene("/gui/loseFightWithRat.fxml");
            }
            if (hl <= 0) {
                StartTheGame.setNewScene("/gui/winFightWithRat.fxml");
                Main.mainHero.addExpForWin(5);
                Main.mainHero.levelUp();
            }
        });

    }
}
