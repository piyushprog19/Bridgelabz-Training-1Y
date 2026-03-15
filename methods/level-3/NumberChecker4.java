import java.util.Scanner;
import java.util.Arrays;
class NumberChecker4 {
	 public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (Prime(num)){
            System.out.println("Prime");
		}
        else{
            System.out.println("Not prime");
		}
        if (Neon(num)){
            System.out.println("Neomn");
		}
        else{
            System.out.println("Not neon");
		}
        if (Spy(num)){
            System.out.println("Spy");
		}
        else{
            System.out.println("Not spy");
		}

        if (Automorphic(num)){
            System.out.println("Automorphic");
		}
        else{
            System.out.println("Not automorphic");
		}
        if (Buzz(num)){
            System.out.println("Buzz");
		}
        else{
            System.out.println("Not buzz");
		}
    }
    static boolean Prime(int num) {
        if (num <= 1){
            return false;
		}
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){
                return false;
			}
        }
        return true;
    }
    static boolean Neon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == num;
    }
    static boolean Spy(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            product *= d;
            num = num / 10;
        }
        return sum == product;
    }
    static boolean Automorphic(int num) {
        int square = num * num;
        while (num != 0) {
            if (num % 10 != square % 10){
                return false;
			}
            num = num / 10;
            square = square / 10;
        }
        return true;
    }
    static boolean Buzz(int num) {
	 if (num % 7 == 0 || num % 10 == 7){
            return true;
	 }
        return false;
    }
}