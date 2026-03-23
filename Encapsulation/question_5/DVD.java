package question_5;
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        available = false;
    }

    public boolean checkAvailability() {
        return available;
    }
}