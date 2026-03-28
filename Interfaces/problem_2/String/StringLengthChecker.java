package problem_2.String;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();

        String message = "Hello World";

        int length = lengthChecker.apply(message);

        if (length > 10) {
            System.out.println("Message exceeds limit");
        } else {
            System.out.println("Message within limit");
        }
    }
}