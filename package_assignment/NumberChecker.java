import static java.lang.Math.*;
import java.util.Scanner;
public class NumberChecker {
    public static int countDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int n = countDigits(num);
        int arr[] = new int[n];
        for(int i = n-1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }
    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int rev[] = new int[n];
        for(int i = 0; i < n; i++) {
            rev[i] = arr[n-1-i];
        }
        return rev;
    }
    public static boolean compareArrays(int a[], int b[]) {
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    public static boolean Palindrome(int num) {
        int arr[] = storeDigits(num);
        int rev[] = reverseArray(arr);

        return compareArrays(arr, rev);
    }
    public static boolean Duck(int num) {
        while(num > 0) {
            if(num % 10 == 0)
                return true;
            num /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digits = countDigits(num);
        System.out.println("Digit Count " + digits);
        int arr[] = storeDigits(num);
        System.out.println("Digits:");
        for(int i : arr){
            System.out.print(i + " ");
		}
        System.out.println();
        int rev[] = reverseArray(arr);
        System.out.println("Reversed");
        for(int i : rev){
            System.out.print(i + " ");
		}
        System.out.println();
        System.out.println("Palindrom " + Palindrome(num));
        System.out.println("Duck Number " + Duck(num));
    }
}