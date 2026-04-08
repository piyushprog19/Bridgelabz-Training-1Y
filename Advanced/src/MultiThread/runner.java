package MultiThread;

public class runner {
    public static void main(String[] args) {
        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        a.setPriority(10);
        b.setPriority(5);
        a.start();
        b.start();
    }
}
