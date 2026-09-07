package main.java.kolesnik.lab1.task5;
import java.util.Objects;

public class Bus {
    protected String type;

    public Bus(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bus bus = (Bus) obj;
        return Objects.equals(type, bus.type);

    }
}