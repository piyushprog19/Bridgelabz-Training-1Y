import java.util.Scanner;
import java.util.Arrays;
class NumberChecker3 {
		public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arr[] = storeDigits(num);
        System.out.println(countDigits(num));
        int rev[] = reverseDigits(arr);
        System.out.println("Digits = " + Arrays.toString(arr));
        System.out.println("Reversed = " + Arrays.toString(rev));
        System.out.println("Arrays equal = " + compareArrays(arr, rev));
        if (Palindrome(num)){
            System.out.println("Palindrom");
		}
        else{
            System.out.println("Not palindrome");
		}
        if (Duck(num)){
            System.out.println("Duck number");
		}
        else{
            System.out.println("Not duck number");
		}
    }
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    static int[] storeDigits(int num) {
        int n = countDigits(num);
        int arr[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;
    }
    static int[] reverseDigits(int arr[]) {
        int rev[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }
    static boolean compareArrays(int a[], int b[]) {

        if (a.length != b.length){
            return false;
		}
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
    static boolean Palindrome(int num) {

        int arr[] = storeDigits(num);
        int rev[] = reverseDigits(arr);

        return compareArrays(arr, rev);
    }
    static boolean Duck(int num) {

        int arr[] = storeDigits(num);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                return true;
        }
        return false;
    }
}