package ru.job4j.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Ошибка");
        error.printInfo();
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println( message);
    }
}