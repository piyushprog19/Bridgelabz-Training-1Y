package problem_3.Password;
public class Main {
    public static void main(String[] args) {
        String password = "Test@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}