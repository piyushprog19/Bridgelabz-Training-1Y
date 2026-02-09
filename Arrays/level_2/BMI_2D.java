import java.util.Scanner;
class BMI_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = in.nextInt();
        double[][] data = new double[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height (in meters): ");
            data[i][0] = in.nextDouble();
            System.out.print("Enter weight (in kg): ");
            data[i][1] = in.nextDouble();
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);
        }
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            double bmi = data[i][2];
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
            System.out.println(data[i][0] + "\t" +data[i][1] + "\t" +String.format("%.2f", bmi) + "\t" +status);
        }

    }
}