package Single.Smart_home;
public class Main {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(101, "ON", 24.5);
        t.displayStatus();
    }
}