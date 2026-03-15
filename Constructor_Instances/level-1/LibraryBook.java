import java.util.Scanner;
class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;
    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        availability = true;
    }
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        String author = in.nextLine();
        double price = in.nextDouble();
        LibraryBook b = new LibraryBook(title, author, price);
        b.display();
        b.borrowBook();
        b.display();
    }
}