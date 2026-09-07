package main.java.kolesnik.lab1.task6;

abstract class Book implements Publication {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // Абстрактный класс
    public abstract String getBookType();

    // Общий метод
    @Override
    public void printInfo() {
        System.out.print("Тип книги: " + getBookType() + " | Название: " + title + " | Автор: " + author + " | Страниц: " + pages);
    }
}
