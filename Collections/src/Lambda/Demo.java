package Lambda;

public class Demo {
    static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("This is my first thread");
        };
        Thread thread = new Thread(runnable);
        thread.start();
////////////////////////////////////////////////     SECOND THREAD     ////////////////////////////////////////////////////////////////////
        Runnable runnable1 = () -> {
            System.out.println("This is my second thread");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
///////////////////////////////////////////////      THIRD THREAD      /////////////////////////////////////////////////////////////////////
        Runnable runnable2 = () -> {
            System.out.println("This is my third thread");
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
//////////////////////////////////////////////       FOURTH THREAD      ////////////////////////////////////////////////////////////////////
        Runnable runnable3 = () -> {
            for (int i=0; i<10; i++) {
                System.out.println("This is my fourth thread");
            }
        };
        Thread thread3 = new Thread(runnable3);
        thread3.start();
    }
}
