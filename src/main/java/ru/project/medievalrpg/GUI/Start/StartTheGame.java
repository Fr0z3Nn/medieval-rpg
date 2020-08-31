package ru.project.medievalrpg.GUI.Start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartTheGame extends Application {
    static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        StartTheGame.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/gui/startMenu.fxml"));
        primaryStage.setTitle("RPG");
        primaryStage.setScene(new Scene(root, 600, 333));
        primaryStage.show();
    }

    public static void setNewScene(String urlScene) {
        Parent root;
        try {
            root = FXMLLoader.load(StartTheGame.class.getResource(urlScene));
            StartTheGame.primaryStage.setScene(new Scene(root, 600, 333));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
