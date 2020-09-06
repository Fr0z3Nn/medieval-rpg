package ru.project.medievalrpg.GUI.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.GUI.Start.StartTheGame;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.exceptions.NullValueException;

public class aboutHeroController {
    @FXML
    public Text name;
    @FXML
    public Text level;
    @FXML
    public Text exp;
    @FXML
    public Text health;
    @FXML
    public Text defence;
    @FXML
    public ImageView back;
    public Text heroAttack;
    public Button attackAdd;
    public Button healthAdd;
    public Button defAdd;
    public Text points;

    @FXML
    public void initialize() {
        name.setText(Main.mainHero.getName());
        level.setText(String.valueOf(Main.mainHero.getLevel()));
        exp.setText(Main.mainHero.getExp() + "/" + Main.mainHero.getMaxExp());
        points.setText("Очки: " + Main.mainHero.getPointsToImproveStats());
        heroAttack.setText(String.valueOf(Main.mainHero.getDamageBase()));
        health.setText(String.valueOf(Main.mainHero.getHealth()));
        defence.setText(String.valueOf(Main.mainHero.getDefence()));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> StartTheGame.setNewScene("/gui/map.fxml"));

        attackAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(Main.mainHero.getPointsToImproveStats() > 0){
                //понижаем очки на 1
                Main.mainHero.setPointsToImproveStats(Main.mainHero.getPointsToImproveStats() - 1);
                points.setText("Очки: " + Main.mainHero.getPointsToImproveStats());
                Main.mainHero.setDamageBase(Main.mainHero.getDamageBase() + 1);
                heroAttack.setText(String.valueOf(Main.mainHero.getDamageBase()));
            }
        });

        healthAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(Main.mainHero.getPointsToImproveStats() > 0){
                //понижаем очки на 1
                Main.mainHero.setPointsToImproveStats(Main.mainHero.getPointsToImproveStats() - 1);
                points.setText("Очки: " + Main.mainHero.getPointsToImproveStats());
                Main.mainHero.setHealth(Main.mainHero.getHealth() + 1);
                heroAttack.setText(String.valueOf(Main.mainHero.getHealth()));
            }
        });

        defAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(Main.mainHero.getPointsToImproveStats() > 0){
                //понижаем очки на 1
                Main.mainHero.setPointsToImproveStats(Main.mainHero.getPointsToImproveStats() - 1);
                points.setText("Очки: " + Main.mainHero.getPointsToImproveStats());
                Main.mainHero.setDefence(Main.mainHero.getDefence() + 1);
                heroAttack.setText(String.valueOf(Main.mainHero.getDefence()));
            }
        });
    }
}
