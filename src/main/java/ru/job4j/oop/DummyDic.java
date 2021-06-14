package ru.job4j.oop;

public class DummyDic {
    public static String engToRus() {
        String eng = "Unknown word";
        return eng;
    }
    public static void main(String[] args) {
        String eng = engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }

}
