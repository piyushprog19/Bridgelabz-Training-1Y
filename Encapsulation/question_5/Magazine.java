package question_5;
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}