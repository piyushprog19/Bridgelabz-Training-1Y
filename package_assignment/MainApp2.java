import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainApp2 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling");
        Member m = new Member("Piyush", 101);
        Transaction t = new Transaction();
        b.displayBook();
        m.displayMember();
        t.issueBook("Java Programming", "Piyush");
    }
}