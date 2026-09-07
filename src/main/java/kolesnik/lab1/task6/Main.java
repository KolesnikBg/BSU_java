package main.java.kolesnik.lab1.task6;

public class Main {
    public static void main(String[] args) {
        Publication[] library = new Publication[2];

        library[0] = new Directory("Справочник по сетям", "Умный Чел", 109, "Сети");
        library[1] = new Encyclopedia("Большая Советская Энциклопедия", "Много умных людей", 999, 67);

        for (Publication pub : library) {
            pub.getTitle();
            pub.printInfo();
        }
    }
}
