package Mutithreading;

public class Order implements Runnable {
    private int id;
    private String restaurant;
    private int deliveryTime;
    public Order(int id, String restaurant, int deliveryTime) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }
    @Override
    public void run() {
        String agent = Thread.currentThread().getName();
        long start = System.currentTimeMillis();
        try {
            System.out.println("Order " + id + " picked up by " + agent);
            Thread.sleep(1000);
            System.out.println("Order " + id + " in transit...");
            Thread.sleep(deliveryTime * 1000);
            System.out.println("Order " + id + " delivered by " + agent);
        } catch (InterruptedException e) {}
        long end = System.currentTimeMillis();
        System.out.println("Total delivery time for Order " + id + ": " + (end - start) + " ms");
    }
}