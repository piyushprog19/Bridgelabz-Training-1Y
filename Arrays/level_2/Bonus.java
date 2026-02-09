import java.util.Scanner;
class Bonus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int employees = 10;
        double totalBonus = 0;
        for (int i = 1; i <= employees; i++) {
            System.out.println("\nEmployee " + i);
            System.out.print("Enter basic salary: ");
            double salary = in.nextDouble();
            System.out.print("Enter years of service: ");
            int years = in.nextInt();
            double bonus;
            if (years >= 5) {
                bonus = salary * 0.10;
            } else {
                bonus = salary * 0.05;
            }
            double newSalary = salary + bonus;
            totalBonus += bonus;
            System.out.println("Old Salary : " + salary);
            System.out.println("Bonus      : " + bonus);
            System.out.println("New Salary : " + newSalary);
        }
        System.out.println("\nTotal Bonus Amount Paid by Zara = " + totalBonus);
    }
}