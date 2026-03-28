package problem_2.Temperature;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHigh = temp -> temp > 30.0;

        double temperature = 35.5;

        if (isHigh.test(temperature)) {
            System.out.println("Alert: High Temperature!");
        } else {
            System.out.println("Temperature Normal");
        }
    }
}