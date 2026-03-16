package library.transactions;
public class Transaction {
    public void issueBook(String book, String member) {
        System.out.println(book + " issued to " + member);
    }

    public void returnBook(String book, String member) {
        System.out.println(book + " returned by " + member);
    }
}