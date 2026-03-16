package library.books;
public class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}