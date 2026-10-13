package main.java.kolesnik.lab2.task1;

public class Main {
    public static void main(String[] args) {
        // Лямбда выражение, n делим без остатка -> true
        DivisibleCheck checker = n -> n % 13 == 0;

        System.out.println(checker.check(26)); // t
        System.out.println(checker.check(12)); // f
    }
}