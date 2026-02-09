import java.util.Scanner;
class Comparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = in.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = in.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = in.nextInt();
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }
		
        System.out.print("Enter Amar's height (cm): ");
        float heightAmar = in.nextFloat();
        System.out.print("Enter Akbar's height (cm): ");
        float heightAkbar = in.nextFloat();
        System.out.print("Enter Anthony's height (cm): ");
        float heightAnthony = in.nextFloat();
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}