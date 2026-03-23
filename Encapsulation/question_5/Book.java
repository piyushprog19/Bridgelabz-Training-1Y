package question_5;
class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}