package ru.job4j.oop;

public class Item {

    private int id;

    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item() {

    }

    public static void main(String[] args) {
        Item item = new Item();
        item.printInfo();
    }
    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }
}
