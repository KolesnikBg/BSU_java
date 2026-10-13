package main.java.kolesnik.lab2.task2;

public class Main {
    public static void main(String[] args) {
        // Сравнение длины строк и возврат большей
        StringSelector selector = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

        System.out.println(selector.getMore("Java", "JavaScript"));
    }
}