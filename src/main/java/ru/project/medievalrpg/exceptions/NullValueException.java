package ru.project.medievalrpg.exceptions;

public class NullValueException extends Exception {
    @Override
    public void printStackTrace() {
        System.err.println("Показатель меньше 0");
    }
}
