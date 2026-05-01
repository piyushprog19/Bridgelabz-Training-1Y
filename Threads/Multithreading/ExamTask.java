package Mutithreading;

public class ExamTask implements Runnable {
    private String task;
    private int delay;
    public ExamTask(String task, int delay) {
        this.task = task;
        this.delay = delay;
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(task + " State: " + t.getState());
        try {
            Thread.sleep(delay);
            System.out.println(task + " executing...");
        } catch (InterruptedException e) {}
        System.out.println(task + " completed.");
    }
}