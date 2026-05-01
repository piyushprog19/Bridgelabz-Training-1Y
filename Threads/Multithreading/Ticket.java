package Mutithreading;

public class Ticket extends Thread {
    private int id;
    private String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int sleepTime = (int)(Math.random() * 5 + 1) * 1000;
        System.out.println("Ticket " + id + " [" + type + "] started by " + getName() + " | Priority: " + getPriority());
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {}
        long end = System.currentTimeMillis();
        System.out.println("Ticket " + id + " completed in " + (end - start) + " ms");
    }
}