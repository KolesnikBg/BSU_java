package main.java.kolesnik.lab1.task6;

public class Encyclopedia extends Book {
    private int volumeCount; // кол-во томов

    public Encyclopedia(String title, String author, int pages, int volumeCount) {
        super(title, author, pages);
        this.volumeCount = volumeCount;
    }

    @Override
    public String getBookType() {
        return "Encyclopedia";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" | Кол-во томов: " + volumeCount);

    }
}
