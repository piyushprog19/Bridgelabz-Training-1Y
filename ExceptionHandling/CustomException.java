public class CustomException {
    static void ageChecker(int age) throws InvalidAgeChecker {
        if (age<18) {
            throw new InvalidAgeChecker("Age is invalid for Voting");
        }
        System.out.println("Valid Age for Voting");
    }
}