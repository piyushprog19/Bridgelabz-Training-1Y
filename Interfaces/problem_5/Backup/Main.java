package problem_5.Backup;
public class Main {
    public static void main(String[] args) {
        UserData u = new UserData("Piyush");
        BackupProcessor bp = new BackupProcessor();

        bp.process(u);
    }
}