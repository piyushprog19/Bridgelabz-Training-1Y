import java.util.Scanner;
class harshad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        if (n % sum == 0){
            System.out.println("Harshad Number");
		}
        else{
            System.out.println("Not Harshad Number");
		}
    }
}