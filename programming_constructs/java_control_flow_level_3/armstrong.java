import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp = temp / 10;
        }
        if (sum == number){
            System.out.println("Armstrong Number");
		}
        else{
            System.out.println("Not Armstrong Number");
		}
    }
}