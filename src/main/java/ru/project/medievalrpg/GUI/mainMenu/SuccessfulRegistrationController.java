package ru.project.medievalrpg.GUI.mainMenu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.NPC.King;

import java.io.IOException;

public class SuccessfulRegistrationController {
    @FXML
    public Button next;
    @FXML
    public TextArea kingText;
    private int menuCount = 0;
    @FXML
    public void initialize(){

        kingText.setText("Мое имя, король " + King.getKingName() + ". Я король этих великих и прекрасных земель.\n" +
                "Герой! Нашим землям нужен именно ты, не можешь ли ты?...\n" +
                "Такие слова всегда хочешь услышать в начале приключения.\n" +
                " Но, вы не благородный герой.\n" +
                "И давайте начнем ВАШУ историю с самого начала...");

        next.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {

                switch (menuCount){
                    case 0:
                        kingText.setText("Ты лежишь на столе и в довольно грязном и плохо освещенном помещении\n" +
                                "Вокруг тебя мерзкий запах. В разных концах комнаты сидят люди.\n" +
                                "Они такие же как и ты. Нааааркоманы. Тууууунеядцы - Сказали в голове мои бабушки\n" +
                                "на скамейке. Твои веки медленно открываються. Ты видишь перед собой человека\n" +
                                "Ты начинаешь вспомнинать... что под тобою что-то мокрое и что твое имя: \n" + Main.mainHero.getName());
                        menuCount++;
                        break;

                    case 1:
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(getClass().getResource("/gui/ratCave.fxml"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        StartTheGame.primaryStage.setScene(new Scene(root, 600, 333));
                        break;
                }

            }
        });
    }
}
