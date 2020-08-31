package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.dataBase.Talk;

public class SuccessfulRegistrationController {
    @FXML
    public Button next;
    @FXML
    public TextArea kingText;
    private int menuCount = 0;

    @FXML
    public void initialize() {

        kingText.setText(Talk.kingGreeting);

        next.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {

            switch (menuCount) {
                case 0:
                    kingText.setText(Talk.heroThoughts);
                    menuCount++;
                    break;

                case 1:
                    StartTheGame.setNewScene("/gui/map.fxml");
                    break;
            }
        });
    }
}
