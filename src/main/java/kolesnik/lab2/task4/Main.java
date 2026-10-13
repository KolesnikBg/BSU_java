package main.java.kolesnik.lab2.task4;
import main.java.kolesnik.lab2.task3.Matcher; // импорт интерфейса

public class Main {
    public static void main(String[] args) {
        Matcher matcher = (a, b, c) -> Math.pow(a*b, c);

        System.out.println(matcher.calculate(2, 3,2));
    }
}
