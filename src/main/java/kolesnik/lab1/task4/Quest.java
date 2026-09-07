package main.java.kolesnik.lab1.task4;

import java.util.Objects;

public class Quest {
    private int a;
    private short b;

    public Quest(int a, short b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
