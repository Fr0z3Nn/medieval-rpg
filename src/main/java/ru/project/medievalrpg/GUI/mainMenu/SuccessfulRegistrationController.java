package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.NPC.King;

import java.io.IOException;

public class SuccessfulRegistrationController {
    @FXML
    public Button next;
    @FXML
    public TextArea kingText;
    @FXML
    public void initialize(){
        kingText.setText("Мое имя, король " + King.getKingName() + ". Я король этих великих и прекрасных земель.\n" +
                "Герой! Нашим землям нужен именно ты, не можешь ли ты?...\n" +
                "Такие слова всегда хочешь услышать в начале приключения.\n" +
                " Но, вы не благородный герой.\n" +
                "И давайте начнем ВАШУ историю с самого начала...");
        next.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
            }
        });
    }
}
