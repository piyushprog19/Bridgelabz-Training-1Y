import java.util.Scanner;
class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 1) {
            System.out.println("this is not prime number");
        }
        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("this is prime number");
		}
        else{
            System.out.println("this is not prime number");
		}
    }
}
