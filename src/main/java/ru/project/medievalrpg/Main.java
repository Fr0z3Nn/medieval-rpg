package ru.project.medievalrpg;

import ru.project.medievalrpg.mainCharacter.MainHero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainHero mainHero = new MainHero(entryInfo(),1,100,5,5);
    }
    public static String entryInfo(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
        //TODO проверка на имя
    }
}
