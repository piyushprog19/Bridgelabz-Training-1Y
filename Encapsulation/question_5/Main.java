package question_5;
class Main {
    public static void main(String[] args) {
        LibraryItem b = new Book(1, "Java", "Piyush");
        LibraryItem m = new Magazine(2, "Tech", "Editor");
        LibraryItem d = new DVD(3, "Movie", "Director");

        LibraryItem[] items = {b, m, d};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration());

            Reservable r = (Reservable) item;
            r.reserveItem();
            System.out.println("Available: " + r.checkAvailability());

            System.out.println();
        }
    }
}