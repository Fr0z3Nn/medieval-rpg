package ru.project.medievalrpg.dataBase;

public class DataBaseOfNamesAdd {
    private static String[] namesAdds =
            {"Мурыжный", "Классный", "Крутой"};

    public static String getNamesAdds() {
        return namesAdds[(int) (Math.random() * namesAdds.length)];
    }
}
