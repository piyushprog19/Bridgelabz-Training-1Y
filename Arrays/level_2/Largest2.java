import java.util.Scanner;
class Largest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int maxDigit = 10;           
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number > 0) {
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] newDigits = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    newDigits[i] = digits[i];
                }
                digits = newDigits;
            }
            digits[index] = number % 10;
            index++;
            number /= 10;
        }
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Digits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);
    }
}