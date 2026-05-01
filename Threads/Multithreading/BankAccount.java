package Mutithreading;
public class BankAccount implements Runnable{
    private String name;
    private String type;
    public BankAccount(String name, String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=1;i<=3;i++){
            System.out.println(name+"("+type+") checking balance | Priority: "+t.getPriority());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}