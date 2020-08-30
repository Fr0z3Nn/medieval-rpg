package ru.project.medievalrpg.GUI.mainMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import ru.project.medievalrpg.Main;
import ru.project.medievalrpg.mainCharacter.MainHero;

public class ChooseNameController {

    @FXML
    public TextField heroName;
    @FXML
    public Text textForOutput;
    @FXML
    private Button createHero;

    @FXML
    public void initialize() {
        createHero.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            if(heroName.getText().equals("")){
                textForOutput.setText("Имя не должно быть пустым.");
            }else if(heroName.getText().length() < 3){
                textForOutput.setText("Имя не может быть меньше 3х символов.");
            }else if(heroName.getText().matches("[a-zA-Z0-9_-]{3,15}")){
                registerCharacter();
                correctNameInput();
            }else{
                textForOutput.setText("Длина 3-15 символов, только a-z A-Z 0-9 _ -");
            }
        });
    }

    private void registerCharacter(){
        Main.mainHero = new MainHero(heroName.getText(), 1, 100, 5, 5);
    }

    private void correctNameInput() {
        StartTheGame.setNewScene("/gui/successfulRegistration.fxml");
    }
}
    /*public static String mainHeroName() {
        System.out.println("Введите ваше имя:");
        String resultUserName = "";
        for (int i = 0; i < 5; i++) { // Делаем проверку не более 5 раз, дабы не зацикливать цикл.
            char[] tempArray = scanner.next().toCharArray(); // Превращяем строку в массив чаров, чтоб потом проверить каждый чар
            for (char tempChar : tempArray) {
                if (!Character.isLetter(tempChar) || tempArray.length < 4) { //Делаем допущение, что имя не может быть больше 4 знаков.
                    System.out.println("Извините, вы допустили ошибку. Попробуйте еще раз");
                    break;
                } else {
                    resultUserName = resultUserName.concat(String.valueOf(tempChar)); //  можно заменить на res+=temp а еще лучше....
                }
            }
            if(resultUserName.equals(String.valueOf(tempArray))){
                break;
            }
        }
        if (resultUserName.length() == 1) {
            System.out.println("Ваше имя будет снандартно");
        } else {
            System.out.printf("Ваше имя: %s\n",resultUserName);
            return resultUserName;
        }
        return "Карасик"; // так задумано

    }*/
//correctInputAndGoNext();
                /*if(heroName.getText() != null){
                    correctInputAndGoNext();
                }else{
                    textForOutput.setText("Имя не должно отсутствовать");
                }*/
