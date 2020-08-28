package ru.project.medievalrpg.GUI.mainMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartTheGame extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/gui/startMenu.fxml"));
        primaryStage.setTitle("RPG");
        primaryStage.setScene(new Scene(root,600,333));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
