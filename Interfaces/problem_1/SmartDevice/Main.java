package problem_1.SmartDevice;
public class Main {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new Ac();
        SmartDevice d3 = new TV();

        d1.turnOn();
        d1.turnOff();

        d2.turnOn();
        d2.turnOff();

        d3.turnOn();
        d3.turnOff();
    }
}