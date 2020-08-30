package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.enemies.Rat;

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
        attack.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ratHP.setText((hl -= 10) + "/100");
            }
        });
    }
}
