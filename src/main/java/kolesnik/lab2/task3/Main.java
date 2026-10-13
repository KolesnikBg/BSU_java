package main.java.kolesnik.lab2.task3;


public class Main {
    public static void main(String[] args) {
        Matcher discriminate = (a, b, c) -> (b * b) - (4 * a * c);

        System.out.println("Дискрименант: " + discriminate.calculate(4.1, 12.2, 3.3));
    }
}
