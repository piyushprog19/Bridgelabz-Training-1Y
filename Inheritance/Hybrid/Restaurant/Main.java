package Hybrid.Restaurant;
public class Main {
    public static void main(String[] args) {
        Chef c = new Chef("Piyush", 1);
        Waiter w = new Waiter("Rahul", 2);

        c.performDuties();
        w.performDuties();
    }
}