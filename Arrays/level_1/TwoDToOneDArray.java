import java.util.Scanner;
class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        int[][] twoD = new int[rows][cols];
        int[] oneD = new int[rows * cols];
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoD[i][j] = in.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[index] = twoD[i][j];
                index++;
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1D Array:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
    }
}