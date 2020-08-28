package ru.project.medievalrpg;

import ru.project.medievalrpg.NPC.King;
import ru.project.medievalrpg.enemies.Rat;
import ru.project.medievalrpg.exceptions.NullValueException;
import ru.project.medievalrpg.mainCharacter.MainHero;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NullValueException {
        MainHero mainHero = new MainHero(startHistory(), 1, 100, 5, 5);
        continueStart(mainHero.getName());
        Rat rat = new Rat(1,20,5,5);
        if(rat.fight(mainHero,rat)){
            System.out.printf("%s за победу над %s вы получаете только нагоняй. А нефиг мучать животных", mainHero.getName(),rat.getRatName());
        }


    }

    static String mainHeroName() {
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

    }

    static String startHistory() {
        System.out.printf("Мое имя, король %s. Я король этих великих и прекрасных земель. " +
                "\nГерой! Нашим землям нужен именно ты, не можешь ли ты?..." +
                "\nТакие слова всегда хочешь услышать в начале приключения. Но, вы не благородный герой." +
                "\nИ давайте начнем ВАШУ историю с самого начала...", King.getKingName());
        System.out.println("\n".repeat(5));
        System.out.println("Ты лежишь на столе и в довольно грязном и плохо освещенном помещении" +
                "\nВокруг тебя мерзкий запах. В разных концах комнаты сидят люди." +
                "\nОни такие же как и ты. Нааааркоманы. Тууууунеядцы - Сказали в голове мои бабушки на скамейке" +
                "\nТвои веки медленно открываються. Ты видишь перед собой человека" +
                "\nТы начинаешь вспомнинать... что под тобою что-то мокрое и что твое имя:");
        //Дописать больше текста описания для описания чтоб описать больше описание.Ага.(я не дописываю текст, так как если мы будем переносить его в JavaFx - то лучше я уж там разыграюсь.
        return mainHeroName();
    }

    static void continueStart(String heroName) {
        if (heroName.equals("Карасик")) {
            System.out.println("Какое же у меня замечательное имя!");
        } else {
            System.out.printf("Фу, какая гадость - подумал я о своем имени %s", heroName);
        }
        // желательно так и оставить текст ниже
        System.out.printf("\nТакже я вспомнил человека перед собой. Это мой старый знакомый" +
                "\nКоля_хускар2007 , так его звали. Но, я его звал Сева" +
                "\nЭто был *придумать описание Гришы*" +
                "\nМы с ним были знакомы с *не придумывать историю с Анатолием*" +
                "\nЯ был несчастлив его видеть." +
                "\n-Опа %s дарова, можно я подсяду? - сказал мне весело этот парень и похлопал меня по плечу." +
                "\nОн как всегда задумал что-то не ладное или опять в какое-то передрягу хочет меня затянуть" +
                "\n-Я нашел тут открытку от самого нашего КОРОЛЯ(!), - и он тыкнул какой-то бумажкой мне в лицо" +
                "\nТам было написано что-то про короля и земли... что нужны герои и бла бла бла" +
                "\nКонечно, нынешний набор в армию. Военком не имел лучшего креативщика,но так как забирали всех" +
                "\nЯ вообще не видел смысла в трате бумаги." +
                "\nНо тут внезапно в комнату забежал крыс!", heroName);
    }
}
