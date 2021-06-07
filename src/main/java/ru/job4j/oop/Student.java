package ru.job4j.oop;

public class Student {
    public void music(int i) {
        System.out.println("Tra tra tra");
    }
    public void sing() {
        System.out.println("Lalala");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(1);
        petya.music(1);
        petya.music(1);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}