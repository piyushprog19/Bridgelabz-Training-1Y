package problem_5.Backup;
class BackupProcessor {
    void process(Object obj) {
        if (obj instanceof Backup) {
            System.out.println("Backing up data...");
        } else {
            System.out.println("Not eligible for backup");
        }
    }
}