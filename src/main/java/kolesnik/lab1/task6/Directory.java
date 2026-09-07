package main.java.kolesnik.lab1.task6;

public class Directory extends Book {
    private String subjectArea; // Область справочника

    public Directory(String title, String author, int pages, String subjectArea) {
        super(title, author, pages);
        this.subjectArea = subjectArea;
    }

    @Override
    public String getBookType() {
        return "Directory";
    }

    // Полиморфизм
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" | Сфера применения: " + subjectArea);
    }
}
