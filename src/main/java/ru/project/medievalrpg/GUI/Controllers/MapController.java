package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MapController {
    @FXML
    public ImageView aboutHero;
    @FXML
    public ImageView inventory;
    @FXML
    public ImageView quest;
    @FXML
    public ImageView ratCave;
    @FXML
    public ImageView saveGame;

    @FXML
    public void initialize() {
        ratCave.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/ratCave.fxml"));
        aboutHero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/aboutHero.fxml"));
        saveGame.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            try {
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("SavedGame.ser"));
                os.writeObject(Main.mainHero);
                os.close();
                StartTheGame.setNewScene("/gui/startMenu.fxml");
            }catch (IOException ex){
                ex.printStackTrace();
            }
                });
    }
}
