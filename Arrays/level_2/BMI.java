import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of persons in the team: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nPerson " + i);
            System.out.print("Enter height: ");
            double height = in.nextDouble();
            System.out.print("Enter weight: ");
            double weight = in.nextDouble();
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            System.out.println("Height : " + height + " m");
            System.out.println("Weight : " + weight + " kg");
            System.out.println("BMI    : " + bmi);
            System.out.println("Status : " + status);
        }
    }
}