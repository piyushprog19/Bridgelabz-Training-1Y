import java.util.Scanner;
class grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = in.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = in.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = in.nextInt();
        int total = physics + chemistry + maths;
        double percentage = (total / 300.0) * 100;
        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }
        System.out.println("Physics   : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Maths     : " + maths);
        System.out.println("Total     : " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade     : " + grade);
    }
}