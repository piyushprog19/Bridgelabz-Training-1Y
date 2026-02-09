import java.util.Scanner;
class grade_2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Physics marks: ");
            marks[i][0] = in.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = in.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = in.nextInt();
        }
        System.out.println("\nPhy\tChem\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" +marks[i][2] + "\t" +String.format("%.2f", percentage) + "%\t\t" +grade);
        }
    }
}