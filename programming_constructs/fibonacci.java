import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in){
            System.out.print("enter value of n ");
            int n = in.nextInt();
            int fib = 1;
            int first = 0;
            int second = 1;
            for(int i=1;i<=n;i++){
                System.out.print(" " + first);
                first = second;
                second = fib;
                fib = first + second;
            }
    }
}
